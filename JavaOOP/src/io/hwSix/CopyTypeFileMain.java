package io.hwSix;

import java.io.File;
import java.io.IOException;

public class CopyTypeFileMain {
    public static void main(String[] args) {
        File folderIn = new File("C:/Users/And/Pictures/");
        File folderOut = new File("C:/Users/And/Pictures/Saved Pictures/");



        try {
            String fileType = "jpg";
            CopyTypeFile.copyMyTipeFiles(folderIn, folderOut, fileType);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
