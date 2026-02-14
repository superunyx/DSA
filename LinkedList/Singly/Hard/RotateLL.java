// you can also just find the tail in the length traversal and improve the complexity slightly from 3n to 2n


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
    public int length(ListNode head){
        if (head==null){
            return 0;
        }
        ListNode temp = head;
        int count =0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        return count;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0){
            return head;
        }
        int length = length(head);
        int rotate = k%length;
        if (rotate==0){
            return head;
        }
        ListNode temp  = head;
        for (int i=1;i<length-rotate;i++){
            temp=temp.next;
        }
        ListNode nextNode = temp.next;
        ListNode newHead = temp.next;
        temp.next=null;
        while(nextNode.next!=null){
            nextNode=nextNode.next;
        }
        nextNode.next=head;
        return newHead;
    }
}
