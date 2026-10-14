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
    public ListNode addTwoNumbers(ListNode p, ListNode q) {
        if(p==null&&q==null){
            return null;
        }
        ListNode u=new ListNode(-1);
        ListNode r=u;
        int c=0;int s=0;
        while(p!=null&&q!=null){
         //   s=c
             s=p.val+q.val+c;
             p=p.next;
             q=q.next;
             c=s/10;
             r.next=new ListNode(s%10);
             r=r.next;

        }
        while(p!=null){
            s=p.val+c;
            r.next=new ListNode(s%10);
            r=r.next;
           c=s/10;;
            p=p.next;
        }
         while(q!=null){
            s=q.val+c;
            r.next=new ListNode(s%10);
            r=r.next;
            c=s/10;
            q=q.next;
        }


        if(c>0){
            r.next=new ListNode(c);
        }
        return u.next;
    }
}
