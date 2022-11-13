package hwEight;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class WriteToFileMain {
    public static void main(String[] args) {
        File file01 = new File("write.txt");
        try (PrintWriter pw = new PrintWriter("write.txt")) {
            pw.println("Hello Word");
        } catch (IOException e) {
            e.printStackTrace();
        }
        File file10 = new File("array.txt");
//        int[] myArray = new int[]{1, 5, 9, 8, 7, 6, 4, 3};
//        saveArrayToFile(file10, myArray);
        String text = loadStringFromFile(file10);
        System.out.println(text);
        String text1 = loadStringFromFile(file01);
        System.out.println(text1);
    }

    public static void saveArrayToFile(File file, int[] array) {
        try (PrintWriter myPrintWriter = new PrintWriter("array.txt")) {
            myPrintWriter.println(Arrays.toString(array));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static String loadStringFromFile(File file){
        String result = "";
        try (Scanner sc = new Scanner(file)){
            for (;sc.hasNextLine();){
                result += sc.nextLine() + System.lineSeparator();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        return result;
    }
}
