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
    public void reorderList(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        ListNode re=slow.next;
        slow.next=null;
        ListNode prev=null;
ListNode curr=re;
        while(curr!=null){
            ListNode n=curr.next;
            curr.next=prev;
            prev=curr;
            curr=n;
        }
        ListNode f=head;
        ListNode s=prev;
        while(s!=null){
            ListNode p=f.next;
            ListNode q=s.next;
            f.next=s;
            s.next=p;
            f=p;
            s=q;

        }
       
       // return head;
    }
}
