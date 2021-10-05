package 哈希表;

/**
 * @ClassName _242有效的字母异位词
 * @Description TODO
 * @Author 昝亚杰
 * @Date 2021/6/9 19:45
 * Version 1.0
 **/
public class _242有效的字母异位词 {
    public boolean isAnagram(String s, String t) {
        int[] visit = new int[26];
        for(char c : s.toCharArray()){
            visit[c - 'a'] += 1;
        }
        for(char c : t.toCharArray()){
            visit[c - 'a'] -= 1;
        }
        for(int num : visit){
            if(num != 0){
                return false;
            }

        }
        return true;
    }
}
