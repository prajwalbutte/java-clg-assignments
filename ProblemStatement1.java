class Shape{
    int radius = 2;
    int length = 2;
    int breadth = 2;
    
     void area(){
        System.out.println("This is shape parent class");
     }
}

class Circle extends Shape{
    
    @Override void area(){
        double a = 3.14*radius*radius;
        System.out.println("The area of circle is "+a);

    }
}
class Rectangle extends Shape{
    @Override void area(){
        double a = length*breadth;
        System.out.println("The area of rectangle is "+a);
    }
}
public class ProblemStatement1{
    public static void main(String[] args){
        Shape s = new Shape();
        s.area();
        Circle c = new Circle();
        c.area();
        Rectangle r = new Rectangle();
        r.area();

    }
}





