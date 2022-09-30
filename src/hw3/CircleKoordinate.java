package hw3;

import java.util.Scanner;

public class CircleKoordinate {
    public static void main(String[] args) {
        int myRadius = 4;
        int coordinateX;
        int coordinateY;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter coordinate X");
        coordinateX = sc.nextInt();
        System.out.println("Enter coordinate Y");
        coordinateY = sc.nextInt();

        if ((coordinateX*coordinateX) + (coordinateY*coordinateY)<=(myRadius*myRadius)){
            System.out.println("Coordinate in the circle area");
        } else System.out.println("Coordinate out of the circle area");

        }
    }
