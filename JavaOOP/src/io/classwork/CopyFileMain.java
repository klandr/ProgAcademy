package io.classwork;

import io.classwork.CopyFile;

import java.io.File;
import java.io.IOException;

public class CopyFileMain {
    public static void main(String[] args) {
//        File fileIn = new File("C:/Users/And/Pictures/IMG_20221009_235241.jpg");
//        File fileOut = new File("C:/Users/And/Documents/1/" + fileIn.getName());
//        System.out.println(fileIn.getName());
//        System.out.println(fileOut.getName());
//        try {
//            System.out.println(CopyFile.copyFile(fileIn, fileOut));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    File folderIn = new File ("C:/Users/And/Pictures/");
        File folderOut = new File("C:/Users/And/Pictures/Saved Pictures/");

//        try {
//            CopyFile.copyAllMyFiles(folderIn, folderOut);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try {
            String fileType = "pdf";
            CopyFile.copyMyTipeFiles(folderIn,folderOut,fileType);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
