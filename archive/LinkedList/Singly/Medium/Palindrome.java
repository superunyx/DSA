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
    public ListNode reverseLinks(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode newHead = reverseLinks(head.next);
        ListNode front = head.next;
        front.next = head;
        head.next = null;
        return newHead;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        if(fast!=null){
            slow=slow.next;
        }
        ListNode checkHead = slow;
        checkHead = reverseLinks(checkHead);
        ListNode temp=head;
        while(checkHead!=null){
            if(temp.val!=checkHead.val){
                return false;
            }
            temp=temp.next;
            checkHead=checkHead.next;
        }
        return true;
    }
}
