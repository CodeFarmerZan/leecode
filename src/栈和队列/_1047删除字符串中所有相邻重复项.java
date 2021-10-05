package 栈和队列;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @ClassName _1047删除字符串中所有相邻重复项
 * @Description TODO
 * @Author 昝亚杰
 * @Date 2021/8/7 18:51
 * Version 1.0
 **/
public class _1047删除字符串中所有相邻重复项 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String st = in.nextLine();
        String[] s = st.substring(1,st.length()-1).split(" ");
        int[] a = new int[s.length];
        for(int i = 0; i < s.length; i++){
            a[i] = Integer.parseInt(s[i]);
        }
        for(int i = 0; i < s.length; i++){
            System.out.println(a[i]);
        }
    }
    public static String removeDuplicates(String s) {
        StringBuffer stack = new StringBuffer();
        int length = s.length();
        int top = -1;
        for(int i = 0; i < length; i++){
            char c = s.charAt(i);
            if(top >= 0 && stack.charAt(top) == c){
                stack.deleteCharAt(top);
                top--;
            }else {
                stack.append(c);
                top++;
            }
        }
        return stack.toString();
    }
}
