package DSA.stack;

class Node{
    Integer value ;
    Node next ;
    Node prev ;

    public Node(Integer value) {
        this.value = value;
    }

    public Node(Integer value, Node next, Node prev) {
        this.value = value;
        this.next = next;
        this.prev = prev;
    }
}
public class MiddleStack {
    Node head  ;
    Node middle ;
    int length  ;
     public MiddleStack(){
           length = 0;
           head = null ;
           middle = null ;
     }
     public void push(int value){
         Node temp = new Node(value);
         if(length ==0){
             head = temp ;
             middle = temp ;
             length++;
             return  ;
         }
         head.next = temp ;
         temp.prev = head ;
         head = head.next ;
         if(length%2==1){
             middle = middle.next;
         }
         length++;

     }

     public int pop() throws Exception{
         if(length==0) throw new Exception("No Element to be Popped !")
         Node toPop = head.prev ;
         int data  = toPop.value ;
         if(length==1){
             head=null;
             middle = null ;
         }
         else{
             head = head.prev ;
             head.next = null ;
             if(length %2 == 0){
                 middle = middle.prev;
             }
         }
         length--;
         return data ;
    }
    public int middleElement() throws  Exception{
         if(length==0) throw new Exception("No middle element Present");
         return middle.value;
    }
}
