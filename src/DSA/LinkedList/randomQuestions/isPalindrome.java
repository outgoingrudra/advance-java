package DSA.LinkedList.randomQuestions;

public class isPalindrome {
    public ListNode reverseList(ListNode head) {
        ListNode temp = head ;
        ListNode prev = null ;
        ListNode front =  null ;

        while(temp != null){
            front = temp.next ;
            temp.next = prev ;
            prev = temp ;
            temp = front ;
        }
        return prev ;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true ;
        ListNode fast = head ;
        ListNode slow = head ;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next ;
            fast = fast.next.next ;
        }
        ListNode second = reverseList(slow.next);
        ListNode first = head ;
        while(second != null){
            if(first.val!=second.val) return false ;
            first= first.next ;
            second = second.next ;
        }
        return true ;
    }
}
