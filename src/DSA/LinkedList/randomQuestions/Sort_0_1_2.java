package DSA.LinkedList.randomQuestions;


public class Sort_0_1_2 {
    public Node segregate(Node head) {
        // code here
        Node temp = head ;
        int cnt0 = 0;
        int cnt1 = 0;
        int cnt2 = 0;
        while(temp != null){
            if(temp.data==0) cnt0++;
            else if(temp.data==1) cnt1++;
            else cnt2++;
            temp = temp.next ;

        }
        temp = head ;
        while(cnt0-->0){
            temp.data = 0;
            temp = temp.next ;
        }
        while(cnt1-->0){
            temp.data = 1;
            temp = temp.next ;
        }
        while(cnt2-->0){
            temp.data = 2;
            temp = temp.next ;
        }
        return head ;
    }

}
