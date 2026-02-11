// 
//
//
// brute approach 
//
// list = count
// middle = count/2 +1
//
//
///**

/* Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode temp =head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        int n=(count/2)+1;
        temp=head;
        for (int i=1;i<n;i++){
            temp=temp.next;
        }
        return temp;
    }
}

/// optimal 
///
///
///
/// slow pointer fast pointer 
///
///
/// move slow by 1 and move fast by 2 so slow always remains in center
///
///



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
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
}
