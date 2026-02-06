import java.util.*;

public class Structure{
    static class Node{ // Node structure as a class 
        int data; // Value of that node
        Node next; // Stores another nodes location in next
        Node (int data1, Node next1){
            this.data=data1; 
            this.next=next1;
        }
        Node (int data1){
            this.data=data1;
            this.next=null;
        }
    };



    public static void main(String args[]){
        Node y = new Node(2);
        Node z = new Node(3,y);
        System.out.println(y);
        System.out.println(y.data);
       // NOT FOR JAVA
       // System.out.println(z->next);
        System.out.println(z.data);
        // print(y) is same as z.next give reference to that node.
        System.out.println(z.next);
    }
}
