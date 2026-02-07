class Solution{
    public ListNode inserthead(ListNode head,int value){
        ListNode temp = new ListNode(value);
        temp.next=head;
        return temp;
    }
}
