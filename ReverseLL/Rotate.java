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
// using close to 2n traverse
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode temphead=head;
        ListNode last=head;
        int n=1;
        while(last.next!=null){
            n++;
            last=last.next;
        }
        k=k%n;
        if(k==0){
            return head;
        }
        ListNode newtail=head;
        for(int i=0;i<n-k-1;i++){
            newtail=newtail.next;
        }
        ListNode newHead=newtail.next;
        newtail.next=null;
        last.next=head;
        return newHead;
    }
}

//can also use reverse -> reverse n-k nodes and then reverse k nodes and then 
//reverse the entire linked list close to 3n similar complexity  
