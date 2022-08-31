package org.example;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileReading {
    public void read(String fileName) {
        try {
            Scanner scanner = new Scanner(new File(fileName));
            new StringBuild().createString(scanner);
            scanner.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
