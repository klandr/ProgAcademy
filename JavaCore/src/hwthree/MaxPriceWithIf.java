package hwthree;

import java.util.Scanner;

public class MaxPriceWithIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1;
        int number2;
        int number3;
        int maxNumber=0;
        System.out.println("Enter number1");
        number1 = sc.nextInt();
        System.out.println("Enter number2");
        number2 = sc.nextInt();
        System.out.println("Enter number3");
        number3 = sc.nextInt();

        if (number1 >=number2) {
            if (number1 >= number3) {
                maxNumber = number1;
            }
        }
        if(number2 >= number1){
            if(number2>=number3){
                maxNumber = number2;
            }
        }
        if(number3>=number1){
            if(number3>=number2){
                maxNumber = number3;
           }
        }
        System.out.println("Max price= " + maxNumber);
    }
}
