package com.bnmit;

/**
 * Hello world!
 */
public class GreatestNumber {
    public int findGreatest(int num1, int num2, int num3) {
        int greatest = num1;
        if (num2 > greatest) {
            greatest = num2;
        }
        if (num3 > greatest) {
            greatest = num3;
        }
        return greatest;
    }

    public static void main(String[] args) { // Fixed 'vod' to 'void'
        GreatestNumber gn = new GreatestNumber(); // Fixed 'Greatst' to 'Greatest'
        int a = 10, b = 25, c = 15;
        int greatest = gn.findGreatest(a, b, c);
        // Added a semicolon and a space for clarity
        System.out.println("The greatest among " + a + ", " + b + ", " + c + " is: " + greatest);
    }
}