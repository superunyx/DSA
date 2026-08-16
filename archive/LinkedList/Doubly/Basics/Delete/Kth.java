/*
Structure of a Doubly LinkList
class Node {
    int data;
    Node next;
    Node prev;

    Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public Node delPos(Node head, int x) {
        if(x==1){
            head=head.next;
            if(head!=null){
                head.prev=null;
            }
            return head;
        }
        Node temp = head;
        int count = 1;
        while(temp!=null && count<x){
            temp=temp.next;
            count++;
        }
        if(temp==null){
            return head;
        }
        if(temp.prev!=null){
            temp.prev.next=temp.next;
        }
        if(temp.next!=null){
            temp.next.prev=temp.prev;
        }
        return head;
    }
}
