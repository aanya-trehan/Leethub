/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList1(ListNode head) {
        ListNode current=head; //1
        ListNode previous=null; 
        ListNode next=null; //2
        while(current!=null){
            next=current.next; //2
            current.next=previous; // 1 ka next is null 
            previous=current; // previous=1
            current=next; 
        }
        return previous;
    }
    
    public ListNode reverseList(ListNode head) {
        ListNode current=head;
        ListNode prev=null;
        ListNode next=null;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }
}