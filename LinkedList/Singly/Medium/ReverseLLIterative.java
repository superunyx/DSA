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
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode mover = head.next;
        ListNode follower = head;
        while(mover!=null){
            ListNode temp = mover.next;
            mover.next=follower;
            follower=mover;
            mover=temp;
        }
        head.next=null;
        return follower;
    }
}
