import java.util.Scanner;

class Student {
    String name;
    String regNo;
    int[] marks = new int[5];
    int total = 0;

    // Constructor to initialize student details and marks
    Student(String name, String regNo, int[] marks) {
        this.name = name;
        this.regNo = regNo;
        this.marks = marks;

        // Calculate total
        for (int m : marks) {
            total += m;
        }
    }

    void display() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name          : " + name);
        System.out.println("Register No   : " + regNo);
        System.out.print("Marks         : ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println("\nTotal Marks   : " + total);
    }
}

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input student details
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Register Number: ");
        String regNo = sc.nextLine();

        int[] marks = new int[5];
        System.out.println("Enter marks of 5 subjects: ");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        // Create student object
        Student s = new Student(name, regNo, marks);

        // Display student info
        s.display();

        sc.close();
    }
}
