package OOPS.inheritance;

class Car{
    String name ;
    int price ;
    Car(String name , int price){
        this.name  = name ;
        this.price = price ;
    }
    public void display(){
        System.out.println("Car : "+name+"- Price : "+price);
    }
}
class BMW extends Car{
    String model ;
    BMW(String model , int price){
        super("BMW",price);
        this.model = model ;
    }
    public void display(){
        System.out.println("Car : "+name+"- Price : "+price+ " MODEL : "+model);
    }

    public String getModel() {
        return model;
    }
}
public class dynamic_method_dispatch {
    public static void main(String[] args) {
        Car b1 = new BMW("A12",55000);
        b1.display();

    }


}
