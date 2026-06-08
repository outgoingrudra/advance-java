package DSA.LinkedList.randomQuestions;
class Node{
    int data ;
    Node next ;
    Node(int d ){
        data = d;
        next = null;
    }
}
public class add2numbers {
    public Node addTwoLists(Node head1, Node head2) {
        // code here
        Node dummy = new Node(-1) ;
        Node curr = dummy ;
        Node t1 = head1;
        Node t2 = head2;
        int carry  = 0;

        while(t1!= null || t2!= null){
            int sum = carry ;
            if(t1 != null) sum += t1.data ;
            if(t2 != null) sum += t2.data ;

            Node node = new Node(sum%10);
            carry  = sum /10;
            curr.next = node ;
            curr = curr.next ;
            if(t1 != null) t1 = t1.next ;
            if(t2 != null) t2 = t2.next ;


        }
        if(carry!= 0){
            Node node = new Node(carry);
            curr.next = node;
        }
        return dummy.next ;
    }
}
