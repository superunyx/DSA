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
    public ListNode mergesorted(ListNode head1, ListNode head2){
        ListNode temp1=head1;
        ListNode temp2=head2;
        ListNode head = new ListNode();
        ListNode temp = head;
        while(temp1!=null && temp2!=null){
            if(temp1.val<=temp2.val){
                temp.next=temp1;
                temp1=temp1.next;
            }
            else{
                temp.next=temp2;
                temp2=temp2.next;
            }
            temp=temp.next;
        }
        if(temp1!=null){
            temp.next=temp1;
        }
        else{
            temp.next=temp2;
        }
        return head.next;
    }
    public ListNode mergesort(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode fast = head.next.next;
        ListNode slow = head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode part2 = mergesort(slow.next);
        slow.next=null;
        ListNode part1 = mergesort(head);
        ListNode result = mergesorted(part1,part2);
        return result;
    }
    public ListNode sortList(ListNode head) {
        return mergesort(head);
    }
}
