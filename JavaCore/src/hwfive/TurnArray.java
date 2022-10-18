package hwfive;

import java.util.Arrays;

public class TurnArray {
    public static void main(String[] args) {
        int[][] myArray = new int[][] {     {1,2,3,4,5,6,7,8},
                                            {1,2,3,4,5,6,7,8},
                                            {1,2,3,4,5,6,7,8},
                                            {1,2,3,4,5,6,7,8},
                                            {1,2,3,4,5,6,7,8},
                                            {1,2,3,4,5,6,7,8},
                                            {1,2,3,4,5,6,7,8},
                                            {1,2,3,4,5,6,7,8} };
        for (int i = 0; i<= myArray.length-1;i++){
            System.out.println(myArray[i]);
        }
        System.out.println(Arrays.toString(myArray));
    }
}
