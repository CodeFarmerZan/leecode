package 字符串;

import java.util.Arrays;

/**
 * @ClassName _541反转字符串II
 * @Description TODO
 * @Author 昝亚杰
 * @Date 2021/6/17 19:17
 * Version 1.0
 **/
public class _541反转字符串II {
    public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        int len = chars.length;
        for(int start = 0; start < len; start += 2*k){
            int i = start,j = start + k -1 > len - 1 ? len - 1 : start + k -1;
            while(i < j){
                char temp = chars[i];
                chars[i++] = chars[j];
                chars[j--] = temp;
            }

        }
        return String.valueOf(chars);
    }
}
