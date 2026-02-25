class Student {
    String name;
    int age;

    // Default constructor
    Student() {
        name = "Unknown";
        age = 0;
    }

    // Parameterized constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display student details
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class StudentDemoConstructor {
    public static void main(String[] args) {
        // Using default constructor
        Student student1 = new Student();
        System.out.print("Student1 details: ");
        student1.display();

        // Using parameterized constructor
        Student student2 = new Student("Alice", 20);
        System.out.print("Student2 details: ");
        student2.display();
    }
}
