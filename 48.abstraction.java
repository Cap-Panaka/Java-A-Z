public class Main {
    public static void main(String[] args) {

        //abstract = Used to define abstract classes and methods.
        //           Abstraction is the process of hiding implement details
        //           and  showing only the essential features
        //           Abstract classes CAN'T be instantiated directly
        //          Can contain 'abstract' method (which must be implemented)
        //          Can contain 'concrete' methods (which are inherited)
    Circle circle = new Circle(3);
    Triangle triangle = new Triangle(4,5);
    Rectangle rectangle = new Rectangle(6,7);

    /*circle.display();
    triangle.display();
    rectangle.display();*/

        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());

        /*
28.274333882308138
10.0
42.0*/

    }


}


public abstract class Shape {

    abstract double area(); //ABSTRACT

    void display(){ //CONCRETE
        System.out.println("THis is a shape");

    }
}


public class Circle extends Shape {

    double radius;

    Circle(double radius){
        this.radius = radius;
    }


    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}



public class Triangle extends Shape{
    double base;
    double height;
    Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5*base*height;
    }
}



public class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length*width;
    }
}




















