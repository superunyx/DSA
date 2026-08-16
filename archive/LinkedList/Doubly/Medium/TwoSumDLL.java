
/*

Definition for singly Link List Node
class Node
{
    int data;
    Node next,prev;

    Node(int x){
        data = x;
        next = null;
        prev = null;
    }
}

You can also use the following for printing the link list.
Node.printList(Node node);
*/

class Solution {
    public static Node tail(Node head){
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        return temp;
    }
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target,
                                                                      Node head) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Node p1 = head;
        Node p2 = tail(head);
        if(head==null || head.next==null){
            return result;
        }
        while(p1!=null && p2!=null && p1!=p2 && p2.next!=p1){
            if(p1.data+p2.data==target){
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(p1.data);
                pair.add(p2.data);
                result.add(pair);
                p1=p1.next;
                p2=p2.prev;
            }
            else if(p1.data+p2.data>target){
                p2=p2.prev;
            }
            else{
                p1=p1.next;
            }
        }
        return result;
        
    }
}
