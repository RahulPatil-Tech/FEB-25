package Assignment_04;

class ComplexNumber {
    private double real;
    private double imaginary;
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber(double real) {
        this.real = real;
        this.imaginary = 0;
    }

    public ComplexNumber add(ComplexNumber other) {
        double realpart = this.real + other.real;
        double imaginarypart = this.imaginary + other.imaginary;
        return new ComplexNumber(realpart, imaginarypart);  
    }

    public ComplexNumber multiply(ComplexNumber other) {
        double realPart = (this.real * other.real) - (this.imaginary * other.imaginary);
        double imaginaryPart = (this.real * other.imaginary) + (this.imaginary * other.real);
        return new ComplexNumber(realPart, imaginaryPart); 
    }
    
    public void display() {
        System.out.println(this.real + " + " + this.imaginary + "i");
    }
}

public class ComplexNumberMain {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(3, 2);  // 3 + 2i
        ComplexNumber c2 = new ComplexNumber(4, -2); // 4 - 2i
        System.out.print("Complex Number 1: ");
        c1.display();
        System.out.print("Complex Number 2: ");
        c2.display();
        ComplexNumber sum = c1.add(c2);
        System.out.println("Sum of two complex numbers is: ");
        sum.display();
        ComplexNumber product = c1.multiply(c2);
        System.out.println("Product of two complex numbers is: ");
        product.display();
    }
}
