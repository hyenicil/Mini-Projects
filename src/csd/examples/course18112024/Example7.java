package csd.examples.course18112024;

public class Example7 {
    public static void run() {

        Complex z1 = new Complex(3.4, 7.8);
        Complex z2 = new Complex(9.8, 5.6);
        Complex z;

        z1.print();
        z2.print();

        z = z1.add(z2); //Mantıksal: z1 + z2
        z.print();

        z = z1.add(3.6); // Mantıksal: z1 + 3.6
        z.print();

        z = Complex.add(3.6, z1); //Mantıksal: 3.6 + z1
        z.print();

        z = z1.subtract(z2); //Mantıksal: z1 - z2
        z.print();

        z = z1.subtract(3.6); // Mantıksal: z1 - 3.6
        z.print();

        z = Complex.subtract(3.6, z1); //Mantıksal: 3.6 - z1
        z.print();



        /*    Complex z1 = new Complex(3.4, 7.8);
        Complex z2 = new Complex(9.8, 5.6);
        Complex z;

        z1.print();
        z2.print();

        z = z1.multiply(z2); //Mantıksal: z1 * z2
        z.print();

        z = z1.multiply(3.6); // Mantıksal: z1 * 3.6
        z.print();

        z = Complex.multiply(3.6, z1); //Mantıksal: 3.6 * z1
        z.print();
      */
      }



}

class Complex {

    public double real, imag;

    public Complex() {

    }

    public Complex(double re) {
        real = re;
    }

    public Complex(double re, double im) {
        real = re;
        imag = im;
    }

    public Complex add(double val) {
        return add(real, imag, val,0);
    }

    public Complex add(Complex comp) {
        return add(real,imag, comp.real, comp.imag);
    }
    public static Complex add(double val, Complex comp) {
        return add(val, 0, comp.real, comp.imag);
    }


    public Complex subtract(double val) {
        return subtract(real, imag, val,0);
    }

    public Complex subtract(Complex comp) {
        return subtract(real, imag, comp.real, comp.imag);
    }

    public static Complex subtract(double val, Complex comp) {
        return subtract(val, 0, comp.real, comp.imag);
    }


    public Complex multiply(double val) {
        return multiply(real, imag, val,0);
    }

    public Complex multiply(Complex other) {
        return multiply(real, imag, other.real,other.imag);
    }

    public static Complex multiply(double val, Complex comp) {
        return multiply(val, 0, comp.real, comp.imag);
    }

    public static Complex add(double re1, double im1, double re2, double im2) {
            return new Complex(re1 + re2, im1 + im2);
    }

    public static Complex subtract(double re1, double im1, double re2, double im2) {
           return add(re1, im1, -re2, -im2);
    }

    public static Complex multiply(double re1, double im1, double re2, double im2) {
        return new Complex(re1*re2 - im1*im2, re1*im2 + re2*im1);
    }

    public Complex conjugate() {
        return new Complex(real, -imag);
    }
    public Complex negate() {
        return new Complex(-real, -imag);
    }
    public void inc() {
        ++real;
    }

    public void dec() {
        --real;
    }


    public void print() {
        System.out.printf("%f + %f * i%n", real, imag);
    }

 }

