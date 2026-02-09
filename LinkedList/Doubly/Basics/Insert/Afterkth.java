/*
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}
*/

class Solution {
    Node insertAtPos(Node head, int p, int x) {
        Node insert = new Node(x);
        if(head==null){
            return insert;
        }
        int count = 0;
        Node mover = head;
        while(mover!=null && count<p){
            mover=mover.next;
            count++;
        }
        if(mover==null){
            return head;
        }
        insert.next=mover.next;
        insert.prev=mover;
        if(mover.next!=null){
            mover.next.prev=insert;
        }
        mover.next=insert;
        return head;
    }
}
