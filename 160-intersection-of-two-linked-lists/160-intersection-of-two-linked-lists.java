/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode head1, ListNode head2) {
        ListNode d1 = head1;
        ListNode d2 = head2;

        while(d1 != d2) {
            if(d1==null){
                d1=head2;
            }
            else{
                d1=d1.next;
            }
            if(d2==null){
                d2=head1;
            }
            else{
                d2=d2.next;
            }
            // d1 = d1 == null? head2:d1.next;
            // d2 = d2 == null? head1:d2.next;
        }

        return d1;
        }
}