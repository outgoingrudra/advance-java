package OOPS.inheritance;
class Rectangle {
    private double length ;
    private double bredth ;
    Rectangle(double l , double b){
        length = l;
        bredth = b;

    }
    Rectangle(){
        length = 0;
        bredth = 0;
    }

    public double getLength(){
        return length;
    }

    public double getBredth() {
        return bredth;
    }
    public double area(){
        return length*bredth ;
    }
    public double perimeter(){
        return 2*(length+bredth);
    }
}
class Cuboid extends  Rectangle{
    double height ;
    Cuboid(){
        super();
        height =0;

    }
    Cuboid(double l , double b , double h){
        super(l,b);
        height =h ;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double area() {
        return super.area()*height;
    }

}
public class cuboid_example {
    public static void main(String[] args) {
        Cuboid c = new Cuboid(1,2,3);
        System.out.println(c.area());
    }
}
