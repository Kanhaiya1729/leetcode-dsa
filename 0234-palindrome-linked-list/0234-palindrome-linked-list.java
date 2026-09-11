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
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }
        ListNode mid=getMid(head);
        ListNode right=mid.next;
        ListNode curr=right;
         ListNode prev=null;
        ListNode next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;   
        }
        while(head!=null && prev!=null){
            if(head.val==prev.val){
                head=head.next;
                prev=prev.next;
            }else{
                return false;
            }
        }
        return true;
    }
        public ListNode getMid(ListNode head){
        ListNode slow=head;
        ListNode  fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
        
    }
    }
