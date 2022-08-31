package org.example;

import java.io.IOException;
import java.util.HashMap;

public class Counter {
    public void countingLetters(StringBuilder str) throws IOException {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (!hashMap.containsKey(str.charAt(i))) hashMap.put(str.charAt(i), 1);
            else hashMap.put(str.charAt(i), hashMap.get(str.charAt(i)) + 1);
        }
        new FileWrite(hashMap);
    }
}
