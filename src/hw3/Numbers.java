package hw3;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myNumber;
        int myHundred;
        int myThousand;
        int myTen;
        int myOne;
        System.out.println("Enter 4-digits number of ticket");
        myNumber = sc.nextInt();
        myThousand = myNumber / 1000;
        myHundred = myNumber / 100 % 10;
        myTen = myNumber / 10 % 10;
        myOne = myNumber % 10;

        if (myThousand + myHundred == myTen + myOne) {
            System.out.println(myThousand + " + " + myHundred + " = " + myTen + " + " + myOne);
            System.out.println("Ticket number is happy");
        } else {
            System.out.println(myThousand + " + " + myHundred + " != " + myTen + " + " + myOne);
            System.out.println("Unhappy ticket number");
        }

    }
}
