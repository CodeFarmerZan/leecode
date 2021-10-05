//package 链表;
//
///**
// * @ClassName _24两两交换链表中的节点
// * @Description TODO
// * @Author 昝亚杰
// * @Date 2021/6/5 21:31
// * Version 1.0
// **/
//public class _24两两交换链表中的节点 {
//    public ListNode swapPairs(ListNode head) {//模拟法
//        ListNode fackNode = new ListNode(0,head);
//        ListNode pre = fackNode;
//        while(pre.next!=null&&pre.next.next!=null){
//            ListNode temp = head.next.next;
//            head.next.next=head;
//            pre.next=head.next;
//            head.next=temp;
//            pre=head;
//            head=temp;
//        }
//        return fackNode.next;
//    }
//    public ListNode swapPairs(ListNode head) {//递归法
//        if(head==null||head.next==null){return head;}
//        ListNode cur = head.next;
//        ListNode newNode = swapPairs(cur.next);
//        cur.next=head;
//        head.next=newNode;
//        return cur;
//    }
//}
