package hwSeven;

import java.util.Arrays;
import java.util.Random;

public class MaxNumber {
    public static void main(String[] args) {
        int[] myArray = generateArray();
        int maxArrayNumber = calculateMaxNumber(myArray);
        System.out.println("max number of array " + Arrays.toString(myArray) + " is " + maxArrayNumber);
    }

    public static int[] generateArray() {
        Random random = new Random();
        int[] randomArray = new int[9];
        for (int j = 0; j <= randomArray.length - 1; j++) {
            randomArray[j] = random.nextInt(10);
        }
        return randomArray;
    }

    public static int calculateMaxNumber(int[] array) {
        int maxNumber = array[0];

        for (int i = 0; i <= array.length - 1; i++) {
            if (maxNumber < array[i]) {
                maxNumber = array[i];
            }
        }
        return maxNumber;
    }
}