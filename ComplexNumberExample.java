class Complex {
    double real;      
    double imaginary; 

    Complex(double r, double i) {
        real = r;
        imaginary = i;
    }

    void display() {
        if (imaginary >= 0)
            System.out.println(real + " + " + imaginary + "i");
        else
            System.out.println(real + " - " + (-imaginary) + "i");
    }

    Complex add(Complex c) {
        return new Complex(real + c.real, imaginary + c.imaginary);
    }

    Complex subtract(Complex c) {
        return new Complex(real - c.real, imaginary - c.imaginary);
    }
}

public class ComplexNumberExample {
    public static void main(String[] args) {
        Complex c1 = new Complex(3, 4);   
        Complex c2 = new Complex(1, -2);  

        System.out.print("First Complex Number: ");
        c1.display();

        System.out.print("Second Complex Number: ");
        c2.display();

        // Adding
        Complex sum = c1.add(c2);
        System.out.print("Sum: ");
        sum.display();

        // Subtracting
        Complex diff = c1.subtract(c2);
        System.out.print("Difference: ");
        diff.display();
    }
}
