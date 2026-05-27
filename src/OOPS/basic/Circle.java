package OOPS.basic;

class CircleClass{
    double radius ;
    public CircleClass(double r){
        if(r<0) radius= 0;
        else radius = r;

    }
    public double area(){
        return 3.14 * radius * radius ;
    }


}
public class Circle {
    public static void main(String[] args) {
        CircleClass c1 = new CircleClass(10);
        System.out.println(c1.area());
    }
}
