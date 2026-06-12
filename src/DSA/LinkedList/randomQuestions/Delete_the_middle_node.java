package DSA.LinkedList.randomQuestions;

public class Delete_the_middle_node {
    public ListNode deleteMiddle(ListNode head) {
        if(head==null) return null;
        if(head.next==null) return null;
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = null;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            prev = slow;
            slow= slow.next;

        }
        prev.next = prev.next.next;
        return head;

    }
}
