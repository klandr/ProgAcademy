package hw4;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int factorial;
        long result=1;
        int i;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter factorial n   (4 < n < 16)");
        factorial = sc.nextInt();

        for ( i=1; i <= factorial; i++){
            result = result*i;
        }
        System.out.println(factorial+"! = " +result);
    }
}
