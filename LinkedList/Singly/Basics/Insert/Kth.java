class Solution {
    Node insertNodeatkth(Node head, int k,int value) {
        Node insert = new Node(value);
        if (k==1 || head==null){
            insert.next=head;
            return insert;
        }
        Node temp = head;
        int count=1;
        while (temp!=null && count<k-1){
            temp=temp.next;
            count++;
        } 
        if(temp!=null){
            insert.next=temp.next;
            temp.next=insert;
        }
        return head;
    }
}
