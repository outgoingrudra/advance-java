package DSA.LinkedList.randomQuestions;

public class LoopLength {
    public Node hasCycle(Node head) {
        Node fast = head ;
        Node slow = head ;
        while(fast != null && fast.next != null){
            slow = slow.next ;
            fast = fast.next.next;
            if(slow==fast) return slow;
        }
        return null ;

    }
    public int lengthOfLoop(Node head) {
        Node ch = hasCycle(head);
        if(ch==null) return 0;
        Node t= ch.next;
        int cnt = 1;
        while(t!= ch){
            cnt++;
            t= t.next;
        }
        return cnt ;
        // code here

    }
}
