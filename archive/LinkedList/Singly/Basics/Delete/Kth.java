/*
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        this.data = d;
        this.next = null;
    }
}
*/
class Solution {
    Node deleteNode(Node head, int x) {
        if (x==1){
            return head.next;
        }
        Node temp = head;
        int count = 1;
        
        while(count<x-1 && temp.next!=null){
            temp=temp.next;
            count++;
        }
        if(temp.next!=null){
            temp.next=temp.next.next;
        }
        return head;
        
    }
}


//ORR
//
/*
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        this.data = d;
        this.next = null;
    }
}
*/
class Solution {
    Node deleteNode(Node head, int x) {
        if (x==1){
            return head.next;
        }
        Node temp = head;
        Node prev=null;
        int count=0;
        while(temp!=null){
            count++;
            if(count==x){
                prev.next=prev.next.next;
                break;
            }
            prev=temp;
            temp=temp.next;
        }
        
        return head;
        
    }
}
