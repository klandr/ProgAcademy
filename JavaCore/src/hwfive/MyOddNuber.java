package hwfive;

public class MyOddNuber {
    public static void main(String[] args) {
        int[] aray = {0, 5, 2, 4, 7, 1, 3, 19};
        int myOdd = 0;
        int myRest;
        System.out.print("We have array [ ");
        for (int i = 0; i <= aray.length - 1; i++) {
            System.out.print(aray[i] + " ");
            myRest = aray[i] % 2;
            if (myRest == 1) {
                myOdd = myOdd + 1;
            }
        }
        System.out.println("]");
        System.out.print("This array  has " + myOdd + " odd numbers");
    }
}
