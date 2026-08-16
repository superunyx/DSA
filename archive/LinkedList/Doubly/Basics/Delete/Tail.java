class Solution{
    public Node deletetail(Node head){
        if(head==null || head.next==null){
            return null;
        }
        Node temp = head;
        Node prev=null;
        while(temp.next!=null){
            prev=temp;
            temp=temp.next;
        }
        prev.next=null;
        temp.prev=null;
        return head;
    }
}
