class Solution{
    public ListNode deletenode(ListNode head,int value){
        if(head==null){
            return null;
        }
        if(head.data==value){
            return head.next;
        }
        ListNode temp = head;
        ListNode prev = null;
        while(temp!=null){
            if(temp.data==value){
                prev.next=temp.next;
                break;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
    }
}
