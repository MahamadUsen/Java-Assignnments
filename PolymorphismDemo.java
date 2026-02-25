class Shape {
    void area() {
        System.out.println("Calculating area of shape");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void area() {
        double result = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

  
    @Override
    void area() {
        double result = length * width;
        System.out.println("Area of Rectangle: " + result);
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        Shape s1 = new Circle(5);      
        Shape s2 = new Rectangle(4, 6); 

        s1.area();
        s2.area(); 
    }
}
