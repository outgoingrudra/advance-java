package Multithreading;

class Hey  implements  Runnable{
    public void run(){
        int i = 1;
        while(true){
            System.out.println("Hello #"+i++);
        }
    }
}
public class basic2 {
    public static void main(String[] args) {
        Hey h = new Hey();
        Thread t = new Thread(h);
        t.start();
        int i = 1;
        while(true){
            System.out.println("World "+i++);
        }
    }
}
