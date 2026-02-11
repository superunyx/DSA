/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public int lengthOfLoop(Node head) {
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                int count=1;
                slow=slow.next;
                while(fast!=slow){
                    slow=slow.next;
                    count++;
                }
                return count;
            }
        }
        return 0;
    }
}
