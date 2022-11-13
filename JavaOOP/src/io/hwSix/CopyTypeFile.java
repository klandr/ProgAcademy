package io.hwSix;

import java.io.*;

public class CopyTypeFile {
    public static void copyMyTipeFiles(File folderIn, File folderOut, String fileType) throws IOException {
        File[] files = folderIn.listFiles();
        String typeOfArrayFile;
        String[] types;
        for (int i = 0; i < files.length; i++) {
            if (files[i].isFile()) {
                typeOfArrayFile = files[i].getName();
                System.out.println(typeOfArrayFile);
                types = typeOfArrayFile.split("[_.]");
                if (types[types.length - 1].equals(fileType)) {
                    File fileOut = new File(folderOut, files[i].getName());
                    System.out.println(copyMyFile(files[i], fileOut));
                }
            }
        }
    }
    //method below was written on the lesson I just use it
    public static long copyMyFile(File fileIn, File fileOut) throws IOException {
        try (InputStream is = new FileInputStream(fileIn);
             OutputStream os = new FileOutputStream(fileOut)) {
            return is.transferTo(os);
        }
    }
}
