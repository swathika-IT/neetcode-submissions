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
     ListNode temp=head;
     int c=0;
     if(head==null||(head.next==null&&n==1)){
        return null;
     }
     while(temp!=null){
        temp=temp.next;
        c++;
     }
     if(c==n){
        return head.next;
     }
     int t=c-n-1;
     ListNode p=head;
   //  p=head;
     for(int i=0;i<t;i++){
      p=p.next;
     }
     p.next=p.next.next;
     p=p.next;
     return head;
    }
}
