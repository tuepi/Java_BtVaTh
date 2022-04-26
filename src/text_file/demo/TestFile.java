package text_file.demo;

import java.io.*;
import java.io.File;
import java.util.Scanner;

public class TestFile {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("src\\text_file\\demo\\chiu.txt");
        BufferedReader br = new BufferedReader(fr);
        String s = "";
        String[] numList = br.readLine().split(";");
        for (String i : numList) {
            System.out.println(i);
        }
        br.close();
        fr.close();
    }


    private static void ghifile(String s) throws IOException {
        FileWriter fileWriter = new FileWriter("src\\text_file\\demo\\testfile.txt", true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write(s);
        bufferedWriter.newLine();
        bufferedWriter.close();
        fileWriter.close();
    }
}
