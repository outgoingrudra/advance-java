package DSA.LinkedList.randomQuestions;

public class Rotate_LL {
    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null || k == 0)
            return head;

        ListNode temp = head;
        int len = 1;

        while (temp.next != null) {
            len++;
            temp = temp.next;
        }

        k = k % len;

        if (k == 0)
            return head;

        temp.next = head; // make circular

        int steps = len - k;
        ListNode newTail = head;

        while (steps > 1) {
            newTail = newTail.next;
            steps--;
        }

        head = newTail.next;
        newTail.next = null;

        return head;
    }
}
