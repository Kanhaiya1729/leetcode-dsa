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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode next;
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
       ListNode newHead= prev;
       if(n==1){
        newHead=newHead.next;
       }else{
        curr=newHead;
       for(int i=1;i<n-1;i++){
        curr=curr.next;

       }
       curr.next=curr.next.next;
       }
       ListNode next2;
        ListNode prev2=null;
        ListNode curr2=newHead;
        while(curr2!=null){
            next2=curr2.next;
            curr2.next=prev2;
            prev2=curr2;
            curr2=next2;
        }
        return prev2;
        
    }
}