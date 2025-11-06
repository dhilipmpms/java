interface Demo {

double PI=3.14159; 

double area(double radius); 

}

class Circle implements Demo {

public double area(double radius) {

return PI * radius * radius;

}

}

public class Calculate {

public static void main(String[] args) {

Circle myCircle=new Circle();

double circleRadius=5.0;

double calculatedArea=myCircle.area(circleRadius);

System.out.println("The area of the circle with radius "+ circleRadius +" is: 

"+ calculatedArea);

}

}
