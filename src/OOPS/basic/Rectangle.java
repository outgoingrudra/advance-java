package OOPS.basic;



public class Rectangle {
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

    public static void main(String[] args) {
        Rectangle r = new Rectangle(2,3);
        System.out.println("Rectangle Area : "+r.area());
        System.out.println("Rectangle Perimeter : "+r.perimeter());
    }
}
