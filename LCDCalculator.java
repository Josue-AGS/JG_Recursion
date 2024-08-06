//  Name: Josue Gonzalez-Silva
//  Date: 8/2/24
//  Class CS 145
//  Assignment: Recursion
//  Purpose: Method for calculating the Least Common Denominator (LCD) of two integers

public class LCDCalculator {

    // Method that computes the Greatest Common Divisor (GCD)
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    // Method that computes the LCD
    public static int lcd(int denom1, int denom2) {
        // Compute GCD of denom1 and denom2
        int gcdValue = gcd(denom1, denom2);
        // Computes LCD of denom1 and denom2
        return Math.abs(denom1 * denom2) / gcdValue;
    }

    public static void main(String[] args) {
        // Denominators
        int denom1 = 21;
        int denom2 = 11;
        
        // Calculates LCD
        int lcdValue = lcd(denom1, denom2);
        System.out.println("The Least Common Denominator of " + denom1 + " and " + denom2 + " is " + lcdValue);
    }
}
