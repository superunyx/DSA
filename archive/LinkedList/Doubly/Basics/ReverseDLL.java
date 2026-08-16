/*
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    public Node reverse(Node head) {
        if(head==null || head.next==null){
            return head;
        }
        Node current = head;
        Node last=null;
        while(current!=null){
            last= current.prev;
            current.prev=current.next;
            current.next=last;
            current=current.prev;
        }
    return last.prev;
    }
}
