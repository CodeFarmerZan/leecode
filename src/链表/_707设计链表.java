package 链表;

/**
 * @ClassName _707设计链表
 * @Description TODO
 * @Author 昝亚杰
 * @Date 2021/6/4 12:07
 * Version 1.0
 **/
public class _707设计链表 {
    class LinkNode{
        int val;
        LinkNode next;
        public LinkNode(int val){this.val=val;}
        public LinkNode(int val,LinkNode next){this.val=val;this.next=next;}
    }
    class MyLinkedList {
        int size;
        LinkNode head;
        /** Initialize your data structure here. */
        public MyLinkedList() {
            this.size=0;
            head=new LinkNode(0);
        }

        /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
        public int get(int index) {
            if(index<0||index>=size){//等号！！！
                return -1;
            }
            LinkNode curr=head;
            for(int i=0; i<=index; i++){
                curr=curr.next;
            }
            return curr.val;
        }

        /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
        public void addAtHead(int val) {
            addAtIndex(0,val);
        }

        /** Append a node of value val to the last element of the linked list. */
        public void addAtTail(int val) {
            addAtIndex(size,val);
        }

        /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
        public void addAtIndex(int index, int val) {
            if(index > size){
                return;
            }
            if(index < 0){
                index = 0;
            }
            LinkNode pre = head;
            for(int i = 0; i < index; i++){
                pre=pre.next;
            }
            size++;
            LinkNode newnode = new LinkNode(val);
            newnode.next=pre.next;
            pre.next=newnode;
        }

        /** Delete the index-th node in the linked list, if the index is valid. */
        public void deleteAtIndex(int index) {
            if(index>=size || index<0){//等号！！！
                return;
            }
            size--;
            LinkNode pre = head;
            for(int i = 0; i < index; i++){
                pre=pre.next;
            }
            pre.next=pre.next.next;
        }
    }
}
