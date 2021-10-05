package 链表;

/**
 * @ClassName _203移除链表元素
 * @Description TODO
 * @Author 昝亚杰
 * @Date 2021/6/3 21:14
 * Version 1.0
 **/
public class _203移除链表元素 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode fackhead = new ListNode();
        fackhead.next = head;
        ListNode pre = fackhead,curr = head;
        while(curr!=null){
            if(curr.val == val){
                pre.next = curr.next;
                curr = curr.next;
            }else{
                pre = pre.next;
                curr = curr.next;
            }
        }
        return fackhead.next;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

