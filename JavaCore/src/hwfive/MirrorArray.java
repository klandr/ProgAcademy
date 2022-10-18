package hwfive;

import java.util.Arrays;

public class MirrorArray {
    public static void main(String[] args) {
        int[] myArray = {7, 2, 9, 4, 1, 3};
        int buffer;
        int myLength = myArray.length - 1;

        System.out.print(Arrays.toString(myArray) + " --> ");
        for (int i = 0; i <= ((myArray.length - 1) / 2); i++) {
            buffer = myArray[i];
            myArray[i] = myArray[myLength];
            myArray[myLength] = buffer;
            myLength = myLength - 1;
        }
        System.out.println(Arrays.toString(myArray));
    }
}
