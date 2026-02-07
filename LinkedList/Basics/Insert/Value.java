class Solution{
    public Node insertbeforevalue(Node head,int value, int x){
        Node insert = new Node(x);
        if(head==null || head.data==value){
            insert.next=head;
            return insert;
        }
        Node temp=head;
        while(temp.next!=null){
            if(temp.next.data==value){
                insert.next=temp.next;
                temp.next=insert;
                break;
            }
            temp=temp.next;
        }
        return head;
    }
}
