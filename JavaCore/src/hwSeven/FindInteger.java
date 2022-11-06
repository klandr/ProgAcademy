package hwSeven;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FindInteger {
    public static void main(String[] args) {
        int[] myArray = generateArray();
        int number = scan();
        System.out.println(Arrays.toString(myArray));
        System.out.println("Index of number = " + findElement(myArray,number));
    }

    public static int scan(){
        int scanNumber;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number from 0 to 9. I tray to find it in random array");
        scanNumber = sc.nextInt();
        return scanNumber;
    }

    public static int[] generateArray() {
        Random random = new Random();
        int[] randomArray = new int[9];
        for (int j = 0; j <= randomArray.length-1; j++) {
            randomArray[j] = random.nextInt(10);
        }
        return randomArray;
    }

    public static int findElement(int[] array, int findNumber){
        int index = findNumber;
        for (int i= 0; i<array.length-1; i++){
            if (array[i] == findNumber){
                index = i;
                break;
            } else index = -1;
        }
        return index;
    }
}
