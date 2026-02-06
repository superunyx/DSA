import java.util.*;

public class LengthofLL{
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
    }
    public static Node arraytoll(int[] arr){ 
        Node head= new Node(arr[0]); 
        Node mover= head;
        int n=arr.length;
        for (int i=1;i<n;i++){
            Node temp = new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }
    public static int length(Node head){
        int count=0;
        Node temp = head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public static void main(String args[]){
        int[] arr={1,3,4,5,6}; 
        Node answer = arraytoll(arr);
        int length = length(answer);
    }
}
