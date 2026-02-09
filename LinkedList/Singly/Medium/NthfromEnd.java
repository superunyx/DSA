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
        if (head==null){
            return null;
        }
        int count=1;
        ListNode temp = head;
        ListNode end = head;
        ListNode prev=null;
        while(end.next!=null){
            if(count<n){
                end=end.next;
                count++;
                continue;
            }
            end=end.next;
            prev=temp;
            temp=temp.next;
        }
        if(prev==null){
            return head.next;
        }
        prev.next=temp.next;;
        return head;
    }
}
