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
    //optimised approach
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode current = head;
        while (current!=null && current.next!=null) {
            if (current.val==current.next.val){
                current.next = current.next.next;
            }
            else{
                current = current.next;
            }
        }
        return head;
    }
    
    //first approach
    public ListNode deleteDuplicates1(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode prev=head;
        ListNode curr=head.next;
        while(curr!=null){
            if(curr.val==prev.val){
                prev.next=curr.next;
                curr=curr.next;
            }
            else{
                prev=curr;
                curr=curr.next;
            }
        }
        return head;
    }
}