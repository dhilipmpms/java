import java.util.Scanner;

class Shape {

Shape(float length, float breadth) {

float area= length * breadth;

System.out.println("Area of Rectangle = "+ area);

}

Shape(floatside) {

float area= side * side;

System.out.println("Area of Square = "+ area);

}

Shape(double base, double height) {

double area=0.5* base * height;

System.out.println("Area of Triangle = "+ area);

}

}

public class Area {

public static void main(String[] args) {

Scanner sc=new Scanner(System.in);

System.out.print("Enter length of Rectangle: ");

float l=sc.nextFloat();

System.out.print("Enter breadth of Rectangle: ");

float b=sc.nextFloat();

new Shape(l, b);

System.out.println();

System.out.print("Enter side of Square: ");

float s=sc.nextFloat();

new Shape(s);

System.out.println();

System.out.print("Enter base of Triangle: ");

double base=sc.nextDouble();

System.out.print("Enter height of Triangle: ");

double h=sc.nextDouble();

new Shape(base, h);

sc.close();

}

}
