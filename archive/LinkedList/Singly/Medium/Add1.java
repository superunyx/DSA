//recursive 
//
// Time - O(N)
//
// space - O(N)
//
//
//
/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    int carry = 1;
    public Node recurse(Node head){
        if(head==null){
            return null;
        }
        head.next = recurse(head.next);
        int sum = head.data+carry;
        head.data=sum%10;
        carry=sum/10;
        return head;
    }
    public Node addOne(Node head) {
        head = recurse(head);
        if(carry==1){
            Node newNode = new Node(1);
            newNode.next = head;
            return newNode;
        }
        return head;
    }
}


// iterative 
//
//
// reverse - n 
// add 1 and traverse - n 
//
// reverse - n 
//
// O(3n)
// space O (1)
