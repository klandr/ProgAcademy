package hw2;

import static java.lang.Math.sqrt;

public class AreaTriangle {
    public static void main(String[] args) {

        double sideA = 0.3;
        double sideB = 0.4;
        double sideC = 0.5;
        double heronS;
        double area;

        System.out.println("We have the triangle with sides");
        System.out.println("a = " + sideA);
        System.out.println("b = " + sideB);
        System.out.println("c = " + sideC);
        System.out.println("We should find area of triangle using the Heron formula");
        System.out.println("Heron formula is: ");
        System.out.println("Area of triangle A = sqrt( S* (S-a) * (S-b) * (S-c) )");
        System.out.println("           Where S = a + b + c / 2");
        heronS = (sideA + sideB + sideC) / 2;
        System.out.println("           S = " + heronS);
        area = sqrt(heronS * (heronS - sideA) * (heronS - sideB) * (heronS - sideC));
        System.out.printf("Area of triangle = " + "%.3f",area);
    }
}
