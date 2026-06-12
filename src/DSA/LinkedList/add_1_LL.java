package DSA.LinkedList;

public class add_1_LL {
    public static Node reverse(Node head){
        Node temp = head ;
        Node prev=null ;
        while(temp!=null){
            Node front =  temp.next ;
            temp.next = prev ;
            prev = temp;
            temp = front;
        }
        return prev ;
    }
    public Node addOne(Node head) {
        // code here.
        int carry = 1;
        Node heady = reverse(head);
        Node temp = heady ;

        while(carry != 0){
            temp.data += carry ;
            carry = temp.data/10;
            temp.data = temp.data %10 ;
            if(temp.next ==null) break ;
            temp = temp.next ;

        }
        if(carry!=0){
            temp.next = new Node(carry);
        }
        return reverse(heady);
    }
}
