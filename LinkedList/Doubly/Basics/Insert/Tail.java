class Solution{
    public Node insertTail(Node head,int value){
        Node temp = new Node(value);
        if (head==null){
            return temp;
        }
        Node mover = head;
        while(mover.next!=null){
            mover=mover.next;
        }
        mover.next=temp;
        temp.prev=mover;
        return head;
    }
}
