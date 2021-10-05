package 链表;

/**
 * @ClassName _19删除链表倒数第N个元素
 * @Description TODO
 * @Author 昝亚杰
 * @Date 2021/6/6 20:30
 * Version 1.0
 **/
public class _19删除链表倒数第N个元素 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //当碰到需要移除某个节点的时候，设置虚拟头结点，可以使操作统一化
        ListNode fackhead = new ListNode(0,head);
        ListNode pre = fackhead;
        ListNode tail = fackhead;
        for(int i = 0; i < n; i++){
            tail=tail.next;
        }
        ListNode prepre = null;
        while(tail!=null){//尽量不要用tail.next作判别条件，容易出现空指针异常！！！
            prepre = pre;
            pre = pre.next;
            tail = tail.next;
        }
        prepre.next = pre.next;
        return fackhead.next;
    }
}
