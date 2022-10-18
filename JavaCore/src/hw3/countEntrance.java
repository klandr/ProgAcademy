package hw3;

import java.util.Scanner;

public class countEntrance {
    public static void main(String[] args) {
        int floor=9;
        int app=4;
        int entrance = 5;
        int numberApp;
        int countEntrance;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Apartment");
        numberApp = sc.nextInt();

        if (numberApp<0) {
            System.out.println("Wrong number 1");
        } else if(numberApp<=(36)){
            System.out.println("Entrance number 1");
            if (numberApp/4>=9){
                System.out.println("floor 9");
            }
        } else if (numberApp<=72){
            System.out.println("Entrance number 2");
        } else if (numberApp<=108){
            System.out.println("Entrance number 3");
        } else if (numberApp<=144){
            System.out.println("Entrance number 4");
        } else if (numberApp<=180){
            System.out.println("Entrance number 5");
        }else System.out.println("Number of apartment isn't in this house");

    }
}
