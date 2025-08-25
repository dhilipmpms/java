import java.io.*;

public class Complex {
    double real;
    double imag;

    // Constructor
    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    // Function to add two complex numbers
    public static Complex add(Complex n1, Complex n2) {
        Complex temp = new Complex(0.0, 0.0);
        temp.real = n1.real + n2.real;
        temp.imag = n1.imag + n2.imag;
        return temp;
    }

    public static void main(String[] args) {
        Complex n1 = new Complex(2.3, 4.5);
        Complex n2 = new Complex(3.4, 5.0);
        Complex temp;

        // Call add function
        temp = add(n1, n2);

        // Display result
        System.out.printf("Sum = %.1f + %.1fi\n", temp.real, temp.imag);
    }
}
