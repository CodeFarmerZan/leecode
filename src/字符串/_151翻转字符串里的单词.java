package 字符串;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName _151翻转字符串里的单词
 * @Description TODO
 * @Author 昝亚杰
 * @Date 2021/6/19 19:06
 * Version 1.0
 **/
public class _151翻转字符串里的单词 {
    public static void main(String[] args) {
        reverseWords("     sdfl   dfd     dfd    ");
    }
    public static  String reverseWords(String s) {//答案：先把字符串多余的空格去除掉，再反转整个字符串，然后依次反转每个单词
        List<String> list = new ArrayList<>();
        int len = s.length();
        int start = 0,end = 0;
        while(end < len){
            while (start < len && " ".equals(String.valueOf(s.charAt(start)))){
               start++;
            }
            end = start;
            while (end < len && !" ".equals(String.valueOf(s.charAt(end)))){
                end++;
            }
            if(start < len && !" ".equals(String.valueOf(s.charAt(start)))){
                list.add(s.substring(start,end));
            }

            if(end + 1 < len){
                start = end + 1;
            }

        }
        StringBuffer stringBuffer = new StringBuffer();
        for(int i = list.size() - 1; i >= 0; i--){
            if(i == 0){
                stringBuffer.append(list.get(i));
            }else{
                stringBuffer.append(list.get(i) + " ");

            }

        }
        return new String(stringBuffer);
    }
}
