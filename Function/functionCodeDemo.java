package Function;


public class functionCodeDemo {

    // Method is that which is written in the class always 
    // and function is also same so both are same in Java
    public static void printHelloWorld() {
        System.out.println("hello World");
    }

    public static int calculateSum(int a, int b) { // here it is received it is called the terms called parameters or formal parameters
        int sum = a + b;
        System.out.println("sum is :" + sum);
        return sum;
    }

    // This is a function overloading becuase it is depends on the only no of difference of parameters and datatypes of parameters not the return type
    // public static float calculateSum(float a, float b) {
    //     return a + b;
    // }

    public static boolean isPrime(int n) {
        // boolean isPrime = true;
        // corner case
        if (n <= 1)
            return false;
        if (n == 2) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        // return isPrime;
        return true;
    }
    
    // print all Primes in a range
    public static void printRage(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    



    public static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    // call by value
    public static void swapNumber(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a " + a);
        System.out.println("b " + b);
    }

    // find product of a and b

    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void main(String[] args) {

        /* 
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSum(a, b); // where I have the value is called the terms is called arguments or actual parameters
        System.out.println(sum);
        printHelloWorld();
        


        */
         
        System.out.println(isPrime(1)+"isprime");
        // call by value
        // swap
        // swap value exchange
        int a = 5;
        int b = 10;
        swapNumber(a, b);
        int prod = multiply(a, b);
        System.out.println(prod);
        System.out.println(fact(4));

        printRage(20);

        // Binomial Coeffecient
        // ncr = n!/r!*(n-r)!

        System.out.println("Binomial Coefficient :" + fact(4) / (fact(2) * fact(4 - 2)));

        // int temp = a;
        // a = b;
        // b = temp;

        // important Note 

        // java always call by value means always do copy of the value not change in the original value.
        // that means we pass the a and b in the swapNumber so that it chnages in the a and b that function does change in the main function of a and b;
        // here is the stack frame have original value same and stack frame of swapNumber function have omitted when is is return so all the variables have been deleted.
        // So does not change in another function of the variable it will remains same.
        System.out.println("a " + a);
        System.out.println("b " + b);

    }
}
