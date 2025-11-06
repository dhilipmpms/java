import java.util.Scanner;

class Shape {

void area(float length, float breadth) {

System.out.println("AREA OF THE RECTANGLE = "+ (length * breadth));

}

void area(float side) {

System.out.println("AREA OF THE SQUARE = "+ (side * side));

}

void area(double base, double height) {

System.out.println("AREA OF THE TRIANGLE = "+ (0.5* base * height));

}

}

public class AREA {

public static void main(String[] args) {

Shape s=new Shape();

Scanner R=new Scanner(System.in);

System.out.println("ENTER THE LENGTH OF THE RECTANGLE:");

float l=R.nextFloat();

System.out.println("ENTER THE BREADTH OF THE RECTANGLE:");

float b=R.nextFloat();

s.area(l, b);

System.out.println("ENTER THE SIDE OF THE SQUARE:");

float side=R.nextFloat();

s.area(side);

System.out.println("ENTER THE HEIGHT OF THE TRIANGLE:");

double h=R.nextDouble();

System.out.println("ENTER THE BASE OF THE TRIANGLE:");

double base=R.nextDouble();

s.area(base, h);

R.close();

}

}
