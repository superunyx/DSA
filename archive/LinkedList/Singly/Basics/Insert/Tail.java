public Node insertlastnode(Node head,int value) {
        Node temp = new Node(value);
        if (head==null){
            return temp;
        }
        Node mover = head;
        while(mover.next!=null){
            mover=mover.next;
        }
        mover.next=temp;
        return head;
    }
}
