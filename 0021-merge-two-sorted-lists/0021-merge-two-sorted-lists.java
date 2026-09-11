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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dumy=new ListNode(-1);
        ListNode temp=dumy;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                temp.next=list1;
                list1=list1.next;
                temp=temp.next;
            }else{
                temp.next=list2;
                list2=list2.next;
                temp=temp.next;

            }
        }
            while(list1!=null){
                temp.next=list1;
                list1=list1.next;
                temp=temp.next;

            }
            while(list2!=null){
                temp.next=list2;
                list2=list2.next;
                temp=temp.next;
            }
            
               return dumy.next;
        }
        
    public ListNode mergesort(ListNode list){
        if(list==null || list.next==null){
            return list;
        }
        ListNode mid=getMid(list);
        ListNode righthead=mid.next;
        mid.next=null;
        ListNode newLeft=mergesort(list);
        ListNode newRight=mergesort(righthead);
        return mergeTwoLists(newLeft,newRight);
    }

    public ListNode getMid(ListNode list){
        ListNode slow=list;
        ListNode fast=list.next;
        while(slow!=null && fast!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
