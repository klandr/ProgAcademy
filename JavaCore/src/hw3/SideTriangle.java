package hw3;

import java.util.Scanner;

public class SideTriangle {
    public static void main(String[] args) {
        int sideA;
        int sideB;
        int sideC;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side a");
        sideA = sc.nextInt();
        System.out.println("Enter side b");
        sideB = sc.nextInt();
        System.out.println("Enter side c");
        sideC = sc.nextInt();
        if (sideA != 0) {
            if (sideB != 0) {
                if (sideC != 0) {
                    if (sideA + sideB > sideC) {
                        if (sideB + sideC > sideA) {
                            if (sideC + sideA > sideB) {
                                System.out.println("Triangle exist");
                            }
                        }
                    } else System.out.println("Triangle don't exist");
                } else System.out.println("c = 0");
            } else System.out.println("b = 0");
        } else System.out.println("a = 0");
    }
}
