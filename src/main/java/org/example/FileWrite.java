package org.example;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

public class FileWrite {
    public FileWrite(HashMap<Character, Integer> hashMap) throws IOException {
        File file = new File("output.txt");
        if (!file.exists()) file.createNewFile();
        PrintWriter pw = new PrintWriter(file);
        pw.println(hashMap);
        pw.close();
    }
}
