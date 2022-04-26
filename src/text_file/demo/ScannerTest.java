package text_file.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src\\text_file\\demo\\testfile.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNext()){
            System.out.println(sc.nextInt());
        }

    }
}
