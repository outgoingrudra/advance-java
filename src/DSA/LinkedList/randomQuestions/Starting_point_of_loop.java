package DSA.LinkedList.randomQuestions;

public class Starting_point_of_loop {
    public int cycleStart(Node head) {
        // code here
        Node slow = head ;
        Node fast = head ;

        while(fast != null && fast.next != null ){
            slow = slow.next ;
            fast = fast.next.next ;
            if(slow==fast){
                slow = head ;
                while(slow!=fast){
                    slow = slow.next ;
                    fast = fast.next ;
                }
                return slow.data;
            }
        }
        return -1;
    }
}
