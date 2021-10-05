package 哈希表;

import com.sun.tools.javac.Main;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @ClassName _49字母异位分组
 * @Description TODO
 * @Author 昝亚杰
 * @Date 2021/6/9 21:16
 * Version 1.0
 **/
public class _49字母异位分组 {
    public static void main(String[] args) {
        String[] strings = new String[]{"eat","tea","tan","ate","nat","bat"};
        List<List<String>> lists = groupAnagrams(strings);
        System.out.println(lists);
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<String,List<String>>();
        for(String str : strs){
            int[] visit = new int[26];
            for(char c : str.toCharArray()){
                visit[c - 'a']++;
            }
            StringBuffer stringBuffer = new StringBuffer();
            for(int i = 0; i < 26; i++){
                if(visit[i] != 0){
                    stringBuffer.append(visit[i]);
                    stringBuffer.append('a' + i);
                }
            }
            String key = stringBuffer.toString();
            List<String> list = map.getOrDefault(key,new ArrayList<String>());
            list.add(str);
            map.put(key,list);
        }
        return new ArrayList<List<String>>(map.values());
    }
}
