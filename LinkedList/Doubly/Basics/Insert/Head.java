class Solution{
    public Node inserthead(Node head,int value){
        Node temp = new Node(value);
        temp.prev = null;
        temp.next = head;
        if(head!=null){
            head.prev = temp;
        } 
        return temp;
    }
}
