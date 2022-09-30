package hw3;

import java.util.Scanner;

public class triangleCoordinate {
    public static void main(String[] args) {


        int aX = 3;////
        int aY = 1;////
        int bX = 5;//
        int bY = 5;//
        int cX = 8;
        int cY = 2;
        int oX;// =7;//
        int oY;// =3;//
        int aOx;
        int aOy;
        int aBx;
        int aBy;
        int bOx;
        int bOy;
        int bCx;
        int bCy;
        int cOx;
        int cOy;
        int cAx;
        int cAy;
        Scanner sc = new Scanner(System.in);
        System.out.println("Write Ox");
        oX=sc.nextInt();
        System.out.println("Write Oy");
        oY=sc.nextInt();

//        aOx = oX - aX;
//        aOy = oY - aY;
//        System.out.println(aOx+ " " + aOy);
        System.out.println(aX*oY-aY*oX);
        System.out.println(aX*bY-aY*bX);

        System.out.println(bX*oY-bY*oX);
        System.out.println(bX*cY-bY*cX);

        System.out.println(cX*oY-cY*oX);
        System.out.println(cX*aY-cY*aX);
    }
}
