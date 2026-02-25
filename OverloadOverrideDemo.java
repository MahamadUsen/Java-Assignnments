class Parent {
    // Method to demonstrate overriding
    void greet() {
        System.out.println("Hello from Parent");
    }

    void display(int a) {
        System.out.println("Display with one integer: " + a);
    }

    void display(int a, int b) {
        System.out.println("Display with two integers: " + a + ", " + b);
    }
}

class Child extends Parent {
    @Override
    void greet() {
        System.out.println("Hello from Child");
    }
}

public class OverloadOverrideDemo {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.display(5);       
        parent.display(5, 10);   

        // Method Overriding
        Parent obj = new Child();
        obj.greet();  
    }
}
