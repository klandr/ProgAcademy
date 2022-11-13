package io.classwork;

import java.io.File;
import java.io.IOException;

public class CopyFileMain {
    public static void main(String[] args) {
        File fileIn = new File("C:/Users/And/Pictures/IMG_20221009_235241.jpg");
        File fileOut = new File("C:/Users/And/Documents/1/" + fileIn.getName());
        System.out.println(fileIn.getName());
        System.out.println(fileOut.getName());
        try {
            System.out.println(CopyFile.copyFile(fileIn, fileOut));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
