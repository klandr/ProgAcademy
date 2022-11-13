package io.classwork;

import java.io.*;


public class CopyFile {
    public static long copyFile(File fileIn, File fileOut) throws IOException {
        try (InputStream is = new FileInputStream(fileIn);
             OutputStream os = new FileOutputStream(fileOut)) {
            return is.transferTo(os);
        }
    }

    public static void copyAllMyFiles(File folderIn, File folderOut) throws IOException {
        File[] files = folderIn.listFiles();
        for (int i = 0; i < files.length; i++) {
            if (files[i].isFile()) {
                File fileOut = new File(folderOut, files[i].getName());
                System.out.println(copyFile(files[i], fileOut));

            }
        }
    }

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
                    System.out.println(copyFile(files[i], fileOut));
                }
            }
        }
    }
}
