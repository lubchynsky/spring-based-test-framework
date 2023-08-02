package com.lubchynsky.services;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZippedFilesReader {

    public static List<File> unzipFile(File file) throws IOException {
        byte[] buffer = new byte[1024];
        ZipInputStream zis = new ZipInputStream(new FileInputStream(file));
        ZipEntry zipEntry = zis.getNextEntry();

        List<File> unzippedFiles = new ArrayList<>();
        while (zipEntry != null) {
            File newFile = new File(file.getParentFile().getAbsolutePath(), zipEntry.getName());

            FileOutputStream fos = new FileOutputStream(newFile);
            int len;
            while ((len = zis.read(buffer)) > 0) {
                fos.write(buffer, 0, len);
            }
            unzippedFiles.add(newFile);
            fos.close();
            zipEntry = zis.getNextEntry();
        }
        return unzippedFiles;
    }
}
