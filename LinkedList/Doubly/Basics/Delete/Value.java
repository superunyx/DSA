class Solution{
    public Node deletevalue(Node head,int value){
        if(head==null){
            return null;
        }
        if(head.data==value){
            if(head.next!=null){
                head.next.prev=null;
            } 
            return head.next;
        }
        Node temp = head;
        while(temp!=null){
            if(temp.data==value){
                break;
            }
            temp=temp.next;
        }
        if(temp==null){
            return head;
        }
        if(temp.next!=null){
            temp.next.prev=temp.prev;
        }
        if(temp.prev!=null){
            temp.prev.next=temp.next;
        }
        return head;
    }
}
