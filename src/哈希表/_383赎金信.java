package 哈希表;

import org.junit.Test;

/**
 * @ClassName _383赎金信
 * @Description TODO
 * @Author 昝亚杰
 * @Date 2021/6/9 19:54
 * Version 1.0
 **/
public class _383赎金信 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] visit = new int[26];
        for(char c : magazine.toCharArray()){
            visit[c - 'a'] += 1;
        }
        for(char c : ransomNote.toCharArray()){
            visit[c - 'a'] -= 1;
            if(visit[c - 'a'] < 0){
                return false;
            }
        }
        return true;
    }
}
