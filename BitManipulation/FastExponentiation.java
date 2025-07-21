package BitManipulation;

// Fast Exponentiation is the in the we do O(n)

// a^n -> a.a.a.a.a.

// but we do here O(logn)
// how to for the N number we convert binary form 
// 3^5 --> 3^101 (a^4 a^2 a)


// similar exponentioation
// modular exponentiation
// a^n % x 


public class FastExponentiation {
    public static int fastExpo(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if ((1 & n) == 1) {
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
        
    }
    public static void main(String[] args) {
        int a = 3, n = 6;
        System.out.println(fastExpo(a, n));
    }
}
