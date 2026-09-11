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
        ListNode curr1=headA;
        ListNode curr2=headB;
        int sizeA=0;
        int sizeB=0;
        while(curr1!= null){
            curr1=curr1.next;
            sizeA++;;

        }
         while(curr2!= null){
            curr2=curr2.next;
            sizeB++;;

        }
        curr1=headA;
        curr2=headB;
         int diff=Math.abs(sizeA-sizeB);
           if(sizeA>sizeB){
          while(diff!=0){
            curr1=curr1.next;
            diff--;
         }
       }
       if(sizeA<sizeB){
         while(diff!=0){
            curr2=curr2.next;
            diff--;
         }
       }
        
       while(curr1!=null && curr2!=null){
        if(curr1==curr2){
            return curr1;
        }else{
            curr1=curr1.next;
            curr2=curr2.next;
        }
       }
       return null;
    

        
    }
}