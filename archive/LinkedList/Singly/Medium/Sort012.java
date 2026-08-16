/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        if (head==null || head.next==null){
            return head;
        }
        Node temp = head;
        Node zeroHead = new Node(-1);
        Node oneHead = new Node(-1);
        Node twoHead = new Node(-1);
        Node mover0 = zeroHead;
        Node mover1 = oneHead;
        Node mover2 = twoHead;
        while(temp!=null){
            if(temp.data==0){
                mover0.next=temp;
                mover0=temp;
            }
            else if (temp.data==1){
                mover1.next=temp;
                mover1=temp;
            }
            else{
                mover2.next=temp;
                mover2=temp;
            }
            temp=temp.next;
        }
        mover2.next=null;
        if(oneHead.next!=null){
            mover0.next=oneHead.next;
            mover1.next=twoHead.next;
        }
        else{
            mover0.next=twoHead.next;
        }

        return zeroHead.next;
        
    }
}
