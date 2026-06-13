package DSA.LinkedList.randomQuestions;
class DNode {
    int data;
    DNode next;
    DNode prev;

    DNode(int x) {
        data = x;
        next = null;
        prev = null;
    }

}


public class delete_all_keys_in_dll {
    static DNode deleteAllOccurOfX(DNode head, int x) {
        // code here
        DNode temp = head ;
        while(temp != null ){
            if(temp.data ==x){
                if(temp==head) head = temp.next ;
                DNode prev = temp.prev;
                DNode next = temp.next ;
                if(prev != null ) prev.next = next ;
                if(next != null ) next.prev = prev ;
                temp = next ;
            }
            else {
                temp = temp.next ;
            }
        }
        return head ;
    }
}
