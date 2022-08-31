package org.example;

import java.io.IOException;
import java.util.Scanner;

public class StringBuild {
    public void createString(Scanner scanner) throws IOException {
        StringBuilder str = new StringBuilder("");
        if (scanner.hasNextLine()) str.append(scanner.nextLine());
        new Counter().countingLetters(str);
    }
}
