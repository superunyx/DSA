import java.util.*;

public class Middle{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(n==0){
            return;
        }
        Node head= new Node(sc.nextInt());
        Node temp=head;
        for(int i=1;i<n;i++){
            temp.next=new Node(sc.nextInt());
            temp=temp.next;
        }
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            //while(fast.next != null && fast.next.next != null)
            //if asked first middle (rare)
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.print(slow.data);
    }
}
