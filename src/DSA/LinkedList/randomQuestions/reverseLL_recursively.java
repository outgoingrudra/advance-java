package DSA.LinkedList.randomQuestions;

public class reverseLL_recursively {
    Node reverseList(Node head) {
        // code here
        if(head==null || head.next==null) return head ;

        Node newHead = reverseList(head.next);
        Node front = head.next ;
        front.next = head ;
        head.next = null  ;
        return newHead ;

    }
}
