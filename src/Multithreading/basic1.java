package Multithreading;

class Hello extends Thread{
    public void run(){
        int i = 1;
        while(true){
            System.out.println("Hello #"+i++);
        }
    }
}

public class basic1 extends  Thread {
    public static void main(String[] args) {
        Hello h = new Hello();
        h.start();
        int i = 1;
        while(true){
            System.out.println("World "+i++);
        }
    }

}
