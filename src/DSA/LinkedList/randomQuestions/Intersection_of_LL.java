package DSA.LinkedList.randomQuestions;

public class Intersection_of_LL {
    public static ListNode Collision(ListNode h1 , ListNode h2 , int steps){
        while(steps-->0){
            h1= h1.next;
        }
        while(h1 !=null){
            if(h1==h2) return h1;
            else{
                h1= h1.next ;
                h2 = h2.next ;
            }
        }
        return null;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode t1 = headA;
        ListNode t2 = headB;
        int l1 =0 , l2= 0;
        while(t1 != null){
            l1++;
            t1= t1.next;
        }
        while(t2!=null){
            l2++;
            t2= t2.next ;
        }
        if(l1>l2)
            return Collision(headA,headB, l1-l2);
        else
            return Collision(headB,headA,l2-l1);

    }
}
