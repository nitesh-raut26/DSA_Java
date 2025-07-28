package OOPs;

// print the sum.difference and product of two complex numbers by creating 

// a class named Complex with seprate methods for each operations whose real 

// and imaginary parts are  entered by the user.

// A complex number is in the form:
// z = a + bi

// If you have two complex numbers:
// 	•	z_1 = a + bi
// 	•	z_2 = c + di

// Then:
// z_1 + z_2 = (a + c) + (b + d)i

class ComplexNumber {
    public static void main(String[] args) {

        // int complex = 2 + 5i;
        // Let z_1 = 3 + 2i, z_2 = 1 + 4i

        Complex c1 = new Complex(3, 2);
        Complex c2 = new Complex(1, 4);
        // Complex sum = c1.add(c2);
        // Complex diff = c1.diff(c2);
        Complex product = c1.product(c2);
        // System.out.println(sum.real + "+" + sum.imag + "i");
        // System.out.println(diff.real + "+" + diff.imag + "i");
        System.out.println(product.real + "+" + product.imag + "i");
        
       
        
    }
}

class Complex {
    double real;
    double imag;

    // Constructor
    Complex(double r, double i) {
        real = r;
        imag = i;
    }

    // Add method
    Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imag + other.imag);
    }

    // Difference method
    Complex diff(Complex other) {
        return new Complex(this.real - other.real, this.imag - other.imag);
    }

    // Product Number
    // (a + bi) * (c + di) = (ac - bd) + (ad + bc)i
      // Let z_1 = 3 + 2i, z_2 = 1 + 4i = (3-8)+(12+2)
    Complex product(Complex other) {
       double realProduct = ((this.real * other.real) - (this.imag * other.imag));
       double imagProduct = ((this.real * other.imag) + (this.imag * other.real));
        // System.out.println(this.imag);
        return new Complex(realProduct , imagProduct);
    }




}