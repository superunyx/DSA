import java.util.*;

public class Basic{
    static class Node{
        int data;
        Node next;
        Node (int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node head=null;
    static void insert(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    static void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            insert(sc.nextInt());
        }
        print();
    }
}

//delete node;
static void delete(int data){

    if(head == null){
        return;
    }

    if(head.data == data){
        head = head.next;
        return;
    }

    Node prev = head;
    Node temp = head.next;

    while(temp != null){

        if(temp.data == data){
            prev.next = temp.next;
            return;
        }

        prev = temp;
        temp = temp.next;
    }
}

