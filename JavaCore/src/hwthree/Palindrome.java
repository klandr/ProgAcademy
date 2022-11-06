package hwthree;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int myNumber;
        int myHalf;
        int turn;
        int turn10;
        int turn100;
        int reverse;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter six-digit number");
        myNumber = sc.nextInt();
        myHalf = myNumber % 1000;
        myNumber = myNumber / 1000;
        turn = (myHalf % 10)*100;//
        turn10 = (myHalf % 100/10)*10;
        turn100 =myHalf%1000/100;
        reverse = turn + turn10 +turn100;
        if (myNumber == reverse) {
            System.out.println(myNumber + " = " + myHalf);
            System.out.println("This number is palindrome");
        }
    }
}
