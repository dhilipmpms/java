class Student {
    String name;
    int age;

    // Constructor with no arguments
    Student() {
        name = "Unknown";
        age = 0;
    }

    // Constructor with one argument
    Student(String n) {
        name = n;
        age = 18;  // default age
    }

    // Constructor with two arguments
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ConstructorOverloadingExample {
    public static void main(String[] args) {
        Student s1 = new Student();                  
        Student s2 = new Student("Dhilip");          
        Student s3 = new Student("Arun", 22);       

        s1.display();
        s2.display();
        s3.display();
    }
}
