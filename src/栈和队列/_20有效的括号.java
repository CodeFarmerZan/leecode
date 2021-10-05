package 栈和队列;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @ClassName _20有效的括号
 * @Description TODO
 * @Author 昝亚杰
 * @Date 2021/8/6 19:58
 * Version 1.0
 **/
public class _20有效的括号 {
    public static void main(String[] args) {
        LinkedList<Integer> intlist = new LinkedList<Integer>();
        LinkedList<String> stringlist = new LinkedList<String>();
        System.out.println(stringlist.getClass());
        System.out.println(intlist.getClass());
    }
    public static boolean isValid(String s) {
        int length = s.length();
        Map<Character,Character> pair = new HashMap<Character,Character>();
        Deque<Character> stack = new LinkedList<Character>();
        pair.put(')','(');
        pair.put(']','[');
        pair.put('}','{');
        if(length % 2 != 0){
            return false;
        }else {
            for(int i = 0; i < length; i++){
                if(pair.containsKey(s.charAt(i))){
                    if(stack.isEmpty() || stack.peek() != pair.get(s.charAt(i))){
                        return false;
                    }
                    stack.pop();
                }else {
                    stack.push(s.charAt(i));
                }
            }
        }
        return stack.isEmpty();
    }
}
