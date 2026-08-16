import java.util.*;


public class MergeSorted{
    static class Node{
        int data;
        Node next;
        Node (int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node merge (Node head1, Node head2){
        Node dummy = new Node(0);
        Node curr=dummy;
        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){
                curr.next=head1;
                head1=head1.next;
            }
            else{
                curr.next=head2;
                head2=head2.next;
            }
            curr=curr.next;
        }
        curr.next=(head1!=null)?head1:head2;
        return dummy.next;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        Node head1=new Node(sc.nextInt());
        Node temp=head1;
        for (int i=1;i<n1;i++){
            temp.next=new Node(sc.nextInt());
            temp=temp.next;
        }
        int n2=sc.nextInt();
        Node head2=new Node(sc.nextInt());
        temp=head2;
        for (int i=1;i<n2;i++){
            temp.next=new Node(sc.nextInt());
            temp=temp.next;
        }
        Node newHead = merge(head1,head2);
        temp=newHead;
        for (int i=0;i<n1+n2;i++){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
