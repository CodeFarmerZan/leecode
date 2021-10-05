//package 链表;
//
///**
// * @ClassName _206反转链表
// * @Description TODO
// * @Author 昝亚杰
// * @Date 2021/6/5 20:42
// * Version 1.0
// **/
//public class _206反转链表 {
//    public ListNode reverseList(ListNode head) {//用递归试一下（在下方）
//        ListNode pre = null;
//        ListNode cur = head;
//        ListNode tempt = null;
//        while(cur!= null){
//            tempt = cur.next;
//            cur .next = pre;
//            pre=cur;
//            cur=tempt;
//        }
//        return pre;
//
//    }
//    //以下为递归
//    public ListNode reverseList(ListNode head) {
//        return reverse(null,head);
//    }
//    public ListNode reverse(ListNode pre,ListNode curr){
//        if(curr == null){
//            return pre;
//        }
//        ListNode temp = new ListNode();
//        temp = curr.next;
//        curr.next = pre;
//        return reverse(curr,temp);
//    }
//}
