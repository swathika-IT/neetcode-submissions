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
    public ListNode mergeTwoLists(ListNode a, ListNode b) {
        ListNode c=new ListNode(-1);
        ListNode cu=c;
while(a!=null||b!=null){
    if(a!=null&&(b==null||a.val<=b.val)){
     cu.next=a;
    cu=cu.next;
    a=a.next;

    }
    else if(b!=null){
 cu.next=b;
    cu=cu.next;
    b=b.next;
        }
    }

return c.next;
    }
}