package 栈和队列;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @ClassName _150逆波兰表达式求值
 * @Description TODO
 * @Author 昝亚杰
 * @Date 2021/8/8 20:13
 * Version 1.0
 **/
public class _150逆波兰表达式求值 {
    public static void main(String[] args) {
        String s[] = {"4","13","5","/","+"};
        System.out.println(evalRPN(s));
    }
    public static  int evalRPN(String[] tokens) {
        Deque<Integer> stack = new LinkedList<Integer>();
        int length = tokens.length;
        for(int i = 0; i < length; i++){
            String c = tokens[i];
            if(isNumber(c)){
                stack.push(Integer.parseInt(c));
            }else{
                Integer num1 = stack.pop();
                Integer num2 = stack.pop();
                switch (c){
                    case "+":
                        stack.push(num2+num1);
                        break;
                    case "-":
                        stack.push(num2-num1);
                        break;
                    case "*":
                        stack.push(num2*num1);
                        break;
                    case "/":
                        stack.push(num2/num1);
                        break;
                }
            }

        }
        return stack.pop();
    }
    public static boolean isNumber(String c){
        return !("+".equals(c) || "-".equals(c) || "*".equals(c) || "/".equals(c));
    }
}
