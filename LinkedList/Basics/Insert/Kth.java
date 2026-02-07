class Solution {
    Node insertNodeatkth(Node head, int k,int value) {
        Node insert = new Node(value);
        if(head==null){
            return insert;
        }
        if (k==1){
            insert.next=head;
            return insert;
        }
        Node temp = head;
        int count=1;
        while(temp!=null){
            count++;
            if(count==k){
                insert.next=temp.next;
                temp.next=insert;
                break;
            }
            temp=temp.next;
        }
        return head;
    }
}
