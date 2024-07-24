package com.aeresilf._05;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String sourceFile1path = "src/main/java/com/aeresilf/_05/1.txt";
        String sourceFile2path = "src/main/java/com/aeresilf/_05/2.txt";

        String data1 = readFile(sourceFile1path);
        String data2 = readFile(sourceFile2path);

        try{
            writeAllToNewFile(data1, data2);
        } catch (IOException exception){
            System.out.println(exception.getMessage());
        }


    }
    public static void writeAllToNewFile(String data1, String data2) throws IOException {
        String path = "src/main/java/com/aeresilf/_05/result.txt";

        try(FileWriter fw = new FileWriter(path)){
            fw.write(STR."текст из первого файла:\n\{data1}");
            fw.write(STR."\n\nтекст из второго файла:\n\{data2}");
        } catch (IOException ex){
            System.err.println(STR."невозможно записать данные в файл \{path}");
        }
    }

    public static String readFile(String path){
        StringBuilder sb = new StringBuilder();
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
           String line;

            while((line = br.readLine())!= null){
                sb.append(line);
                sb.append("\n");
            }
        }catch (IOException exception) {
            System.out.println(STR."не удалось прочесть файл \{path}");
        }
        return sb.toString();
    }
}
