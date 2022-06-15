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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int c1=0;
        int c2=0;
        ListNode tempA=headA;
        ListNode tempB=headB;
        while(tempA!=null){
            c1++;
            tempA=tempA.next;
        }
        while(tempB!=null){
            c2++;
            tempB=tempB.next;
        }
        int diff=Math.abs(c1-c2);
        if(c1>c2){
            for(int i=0;i<diff;i++){
                headA=headA.next;
            }
        }
        else{
            for(int i=0;i<diff;i++){
                headB=headB.next;
            }
        }
        while(headA!=null && headB!=null){
            if(headA==headB){
                return headA;
            }
            headA=headA.next;
            headB=headB.next;
        }
        return null;
    }
}