package 栈和队列;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName _225用队列实现栈
 * @Description TODO
 * @Author 昝亚杰
 * @Date 2021/7/2 21:37
 * Version 1.0
 **/
public class _225用队列实现栈 {
    Queue<Integer> qu1;
    Queue<Integer> qu2;

    /** Initialize your data structure here. */
    public _225用队列实现栈() {
        qu1 = new LinkedList<Integer>();
        qu2 = new LinkedList<Integer>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        qu1.offer(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        while(qu1.size() > 1){
            qu2.offer(qu1.poll());
        }
        int result = qu1.poll();
        Queue temp = new LinkedList<Integer>();
        temp = qu1;
        qu1 = qu2;
        qu2 = temp;
        return result;

    }

    /** Get the top element. */
    public int top() {
        int top = this.pop();
        this.push(top);
        return top;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return qu1.isEmpty();
    }
}
