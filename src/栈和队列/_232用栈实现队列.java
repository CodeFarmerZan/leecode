package 栈和队列;

import java.lang.annotation.ElementType;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @ClassName _232用栈实现队列
 * @Description TODO
 * @Author 昝亚杰
 * @Date 2021/7/2 20:55
 * Version 1.0
 **/
public class _232用栈实现队列 {
    Deque<Integer> in;
    Deque<Integer> out;
    /** Initialize your data structure here. */
    public _232用栈实现队列() {
        in = new ArrayDeque<Integer>();
        out = new ArrayDeque<Integer>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        in.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {//这里是重点
        if(out.isEmpty()){
            while(!in.isEmpty()){
                out.push(in.pop());
            }
        }
        return out.pop();
    }

    /** Get the front element. */
    public int peek() {
        Integer pop = this.pop();
        out.push(pop);
        return pop;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return out.isEmpty() && in.isEmpty();
    }
}
