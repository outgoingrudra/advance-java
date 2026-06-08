package DSA.LinkedList;
class Node{
    int data ;
    Node next ;
    Node prev ;
    Node(int data , Node next , Node prev){
        this.data = data ;
        this.next = next;
        this.prev = prev ;

    }
    Node(int data){
        this.data = data ;
        next = null ;
        prev = null ;
    }
}
public class DoublyLL {
    private static  Node convert(int arr[]){
        Node head = new Node(arr[0]);
        Node prev = head ;

         for(int x = 1 ; x< arr.length ;x++){
             Node n = new Node(arr[x]);
             prev.next = n ;
             n.prev = prev;
             prev = n;

         }
         return head ;

    }
    private static void print(Node head){
        System.out.print("DBL LL : ");
      while(head != null){
          System.out.print(head.data+" ");
          head = head.next ;
      }
        System.out.println();
    }
    private static  Node deleteHead(Node head){
        if(head==null || head.next== null){
            return null ;
        }
        Node prev = head ;
        head = head.next ;
        head.prev = null;
        prev.next = null ;
        return head ;

    }
    private static Node deleteTail(Node head){
        Node tail = head ;
        while(tail.next != null) tail = tail.next ;
        Node newTail = tail.prev;
        newTail.next = null ;
        tail.prev = null ;
        return head;
    }
    private static Node deleteKthNode(Node head,int k){
        if(head==null) return null ;
        int cnt = 0;
        Node temp = head ;
        while(temp != null){
            cnt++;
            if(cnt==k){
                break ;
            }
            temp = temp.next ;
        }
        Node prev = temp.prev ;
        Node front = temp.next ;

        if(prev==null || front==null) return null ;
        else if(prev==null) return deleteHead(head);
        else if(front==null) return deleteTail(head);

        prev.next = front ;
        front.prev = prev;
        return head;
    }
    private static Node insertBeforeHead(Node head, int val){
        Node newHead = new Node(val);
        head.prev = newHead;
        newHead.next =  head;
        return newHead;
    }
    private  static  Node insertBeforetail(Node head , int val){
        if(head.next ==null) return insertBeforeHead(head,val);
        Node tail = head;
        while(tail.next != null) tail = tail.next ;
        Node prev = tail.prev;
        Node node = new Node(val,tail , prev);
        prev.next = node ;
        tail.prev = node;
        return head;
    }
    private  static Node insertBeforeKthElement(Node head,int k , int val){
        if(k==1) return insertBeforeHead(head,val) ;
        Node temp = head;
        int cnt = 0;
        while(temp != null){
             cnt++;
             if(cnt==k) break ;
             temp = temp.next;
        }
        Node prev = temp.prev;
        Node node = new Node(val,temp , prev);
        prev.next = node ;
        temp.prev = node;
        return head;

    }
    private static Node reverse(Node head){
        if(head==null || head.next == null) return  head ;
        Node prev = null ;
        Node curr = head ;
        while(curr != null){
            prev = curr.prev ;
            curr.prev = curr.next ;
            curr.next = prev;

            curr = curr.prev ;
        }
        return prev.prev ;
    }
    public static void main(String[] args) {
        int arr[] = new int[]{12,12,3,4,5,6};
        Node head = convert(arr);
        print(head);
//      head = deleteHead(head);
//      head = deleteTail(head);
//      head = deleteKthNode(head,3);
//      head = insertBeforeHead(head,100);
//      head = insertBeforetail(head, 100);
//      head = insertBeforeKthElement(head,3,100);
        head = reverse(head);

        print(head);

    }
}
