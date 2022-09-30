package hw5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomArray {
    public static void main(String[] args) {
        int randomNumber = 10;
        int[] myArray;
        int[] createArray;
        Scanner scanner = new Scanner(System.in);
        System.out.println("I can create random array with numbers fron 0 to " + randomNumber);
        System.out.println("Enter length of array");
        myArray = new int[scanner.nextInt()];

        createArray = new int[myArray.length * 2];
        Random random = new Random();
        for (int i = 0; i <= myArray.length - 1; i++) {
            myArray[i] = random.nextInt(randomNumber);
            createArray[i] = myArray[i];
        }
        System.out.print(Arrays.toString(myArray));
        System.out.println();
        for (int j = myArray.length; j <= (createArray.length - 1); j++) {
            createArray[j] = createArray[j - myArray.length] * 2;
        }
        System.out.println(Arrays.toString(createArray));
    }
}
