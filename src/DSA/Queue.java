package DSA;

public class Queue {
    private int arr[] ;
    private int length = -1;
    Queue(){
        arr = new int[100];
    }
    Queue(int size){
        if(size<0  || size> 1000000) size = 100 ;
        arr = new int[size];
    }
    public void offer(int element) throws  Exception{
        if(length == arr.length ) throw new Exception("Memory overflow ");
        arr[++length] = element ;
    }
    public int poll() throws  Exception{
        if(length==-1) throw new Exception("No Element for Poll");
        return arr[length--];
    }


}
