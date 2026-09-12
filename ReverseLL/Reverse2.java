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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head.next==null){
            return head;
        }
        ListNode dummy= new ListNode(0);
        dummy.next=head;
        ListNode curr=head;
        ListNode prev=dummy;
        int count=1;
        while(count!=left){
            prev=curr;
            curr=curr.next;
            count++;
        }
        ListNode before=prev;
        ListNode tail=curr;
        while(count<=right){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            count++;
        }
        before.next=prev;
        tail.next=curr;
        return dummy.next;
    }
}
