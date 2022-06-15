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
    public ListNode mergeTwoLists1(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(0);
        ListNode newlist=head;
        
        if (list1==null){
            return list2;
        }
        else if (list2==null){
            return list1;
        }
        while (list1!=null && list2!=null){
            if (list1.val<list2.val){
                newlist.next=list1;
                list1=list1.next;
            }
            else{
                newlist.next=list2;
                list2=list2.next;
            }
            newlist=newlist.next;
        }
        if(list1!=null){
            newlist.next=list1;
        }
        if(list2!=null){
            newlist.next=list2;
        }
        return head.next;
    }
    
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1==null){
            return l2      ;  
            }
        if (l2==null){
            return l1;
        }

        if(l1.val>l2.val){
           ListNode temp=l1;
            l1=l2;
            l2=temp;
        }
        ListNode ans=l1;
        while(l1!=null && l2!=null){
            ListNode temp2=null;
            while(l1!=null && l1.val<=l2.val){
                temp2=l1;
                l1=l1.next;
            }
            temp2.next=l2;
            
           ListNode temp=l1;
            l1=l2;
            l2=temp;
        }
        return ans;
        
    }
}