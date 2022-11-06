package hwSeven;

import java.util.Scanner;

public class DrawQuadrant {
    public static void main(String[] args) {
       int quadSize = scan();
       draw(quadSize);
    }
    public static int scan(){
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("I can create draw a quadrant. Enter number of size");
        size = sc.nextInt();
        return size;
    }

    public static void draw(int quadSize){
        for (int i = 0; i < quadSize; i++){
            for (int j = 0; j < quadSize; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
