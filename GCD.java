/*
 * Greatest Common Divisor (Euclid's Algorithm)
 * Programmer:  Ava Adams
 * Date:        January 17, 2024
 * Description: This program finds the 
 *  greatest common divisor of two numbers
 */

package Practice;

public class GCD {
    static int gcd(int m, int n) {
        int t;
        while (n != 0) {
            t = m % n;
            m = n;
            n = t;
        }
        return m;
    }

    public static void main(String[] args) {
        int m = 20, n = 50;

        System.out.println("This program determines the greatest common divisior"
                            + " of two integers using Euclid's Algorithm.");
        System.out.println("The greatest common divisor of " + m + " and " + n + " is: "
                            + gcd(m, n));
    }
}
