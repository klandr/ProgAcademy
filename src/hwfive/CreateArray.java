package hwfive;
import java.util.Scanner;

public class CreateArray {
    public static void main(String[] args) {
        int[] array;
        int mylength;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length of array ");
        mylength = scanner.nextInt();
        array = new int[mylength];
        for (int i = 0; i <= mylength - 1; i++) {
            System.out.println("Enter " + (i + 1) + " number of array");
            array[i] = scanner.nextInt();
        }
        System.out.println("We have array");
        System.out.print("[");
        for (int j = 0; j <= mylength - 1; j++) {
            System.out.print(array[j]);
        }
        System.out.println("]");
    }
}
