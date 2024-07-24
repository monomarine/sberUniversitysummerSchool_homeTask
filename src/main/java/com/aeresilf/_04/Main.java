package com.aeresilf._04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
       analyzeFile("src/main/java/com/aeresilf/_04/textfile.txt");
    }

    public static void analyzeFile(String path){
        ArrayList<String> longestLines = new ArrayList<>();
        int maxLineLength = 0;
        int lineCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                lineCount++;
                if (line.length() > maxLineLength) {
                    longestLines.clear();
                    longestLines.add(line);
                    maxLineLength = line.length();
                } else if (line.length() == maxLineLength) {
                    longestLines.add(line);
                }
            }
        } catch (IOException e) {
            System.err.println(STR."невозможно прочесть файл \{path}");
        }

        System.out.println(STR."количество строк в файле: \{lineCount}");
        System.out.println("самая длинная строка в файле:");
        for (String longLine : longestLines) {
            System.out.println(longLine);
        }
    }
}
