package 哈希表;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName _438找到字符串中所有字母异位词
 * @Description TODO
 * @Author 昝亚杰
 * @Date 2021/6/10 18:33
 * Version 1.0
 **/
public class _438找到字符串中所有字母异位词 {
    public static void main(String[] args) {
        String s = "abab";
        String p = "ab";
        System.out.println(findAnagrams(s,p));
    }
    public static List<Integer> findAnagrams(String s, String p) {//滑动窗口法
        List<Integer> result = new ArrayList<>();
        int[] sCount = new int[26];
        int[] pCount = new int[26];
        int len_s = s.length(),len_p = p.length();
        if(len_p > len_s){
            return result;
        }
        for(int i = 0; i < len_p; i++){
            sCount[s.charAt(i) - 'a']++;
            pCount[p.charAt(i) - 'a']++;
        }
        if(Arrays.equals(sCount,pCount)){
            result.add(0);
        }
        for(int i = len_p; i < len_s; i++){
            sCount[s.charAt(i - len_p) - 'a']--;
            sCount[s.charAt(i) - 'a']++;
            if(Arrays.equals(sCount,pCount)){
                result.add(i - len_p + 1);
            }
        }
        return result;
    }
//    public static List<Integer> findAnagrams(String s, String p) {//暴力法
//        List<Integer> result = new ArrayList<>();
//        int[] visit = new int[26];
//        char[] chars = s.toCharArray();
//        for(char c : p.toCharArray()){
//            visit[c - 'a'] += 1;
//        }
//        for(int i = 0; i < s.length(); i++){
//            int[] visit_1 = new int[visit.length];
//            System.arraycopy(visit,0,visit_1,0,visit.length);
//            int num = 0;
//            int j = 0;
//            for(j = i,num = 0; num < p.length()&&j<chars.length; j++,num++){
//                if(visit_1[chars[j] - 'a'] > 0){
//                    visit_1[chars[j] - 'a']--;
//                }else{
//                    break;
//                }
//                if(num == p.length()-1){
//                    result.add(i);
//                }
//            }
//        }
//        return result;
//    }
}
