//package 链表;
//
//import java.util.HashSet;
//import java.util.Set;
//
///**
// * @ClassName _142环形链表
// * @Description TODO
// * @Author 昝亚杰
// * @Date 2021/6/7 21:18
// * Version 1.0
// **/
//public class _142环形链表 {
//    public ListNode detectCycle(ListNode head) {//hashSet实现，
//        ListNode pos = head;
//        Set<ListNode> set = new HashSet<ListNode>();
//        while(pos!=null){
//            if(set.contains(pos)){
//                return pos;
//            }else{
//                set.add(pos);
//            }
//            pos=pos.next;
//        }
//        return null;
//    }
//    public ListNode detectCycle(ListNode head) {//快慢指针法
//        ListNode fast = head;
//        ListNode slow = head;
//        while(fast!=null&&fast.next!=null){
//            fast=fast.next.next;
//            slow=slow.next;
//            if(fast==slow){
//                ListNode pos1 = head;
//                ListNode pos2 = fast;
//                while(pos1!=pos2){
//                    pos1=pos1.next;
//                    pos2=pos2.next;
//                }
//                return pos2;
//            }
//
//        }
//        return null;
//
//
//    }
//}
