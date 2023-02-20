package leetcode.medium;

import linkedlist.singly.Node;

public class PartitionList {
    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    public static ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode temp = head;
        ListNode greater = null;
        ListNode first = null;
        ListNode last = null;
        while (temp != null){
            if (temp.val >= x ){
                if(first == null){
                    first = temp;
                }
                else{
                    if (last.next != temp){
                        last.next = temp;
                    }
                }
                last = temp;
            }else if (temp.val < x){
                if (greater != null && greater.next != temp){
                    greater.next = temp;
                    last.next = temp.next;
                }
                greater = temp;
            }
            temp = temp.next;
        }
        if (greater != null && first != null){
            if (greater.next == null){
                first.next = null;
                greater.next = first;
            }else{
                greater.next = first;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(-1);
        head = appendToList(head, 1);
        head = appendToList(head, 2);
        head = appendToList(head, 3);
        head = appendToList(head, 4);
        head = appendToList(head, 5);
        head = appendToList(head, 6);

        System.out.println(partition(head.next,2));
    }
       static ListNode appendToList(ListNode head, int val) {
        ListNode temp = head;
        if(head.next == null) {
            ListNode node = new ListNode(val);
            head.next = node;
        }

        while(head.next != null) {
            head = head.next;
        }
        head.next = new ListNode(val);
        return temp;
    }
}
