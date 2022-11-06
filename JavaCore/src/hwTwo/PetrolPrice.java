package hwTwo;

import java.util.Scanner;

public class PetrolPrice {
    public static void main(String[] args) {
        double prisePetrol ; // $
        int petrolWaste ; // l per 100km
        int lengthWay ;// km
        double lirTrip;
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the price of petrol, $. (For example 1,2)");
        prisePetrol = sc.nextDouble();
        System.out.println("Write the distance of trip, km. (For example 120)");
        lengthWay = sc.nextInt();
        System.out.println("Write consumption of petrol L/Km. (For example 8)");
        petrolWaste = sc.nextInt();
        System.out.println("Prise of petrol is " + prisePetrol+ " $");
        System.out.println("Our car consumption is " + petrolWaste + " litres per 100 kilometers");
        System.out.println("We are going to drive our car " + lengthWay + " km");
        lirTrip = (lengthWay * petrolWaste)/100;
        System.out.println("For trip in " + lengthWay +" km we need " +lirTrip +" litres petrol");
        System.out.println("that costs " +lirTrip * prisePetrol +" $ ");
    }
}
