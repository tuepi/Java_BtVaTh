package text_file.doc_file_csv;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DocFileVaHienThiFileCSV {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src\\text_file\\doc_file_csv\\countrys.txt");
        Scanner sc = new Scanner(file);
        String[] arr;
        while (sc.hasNext()){
//            arr = sc.nextLine().split(",");
//            System.out.println(arr[2]);
            arr = sc.nextLine().split(" ");
            for (String i : arr) {
                System.out.print(i);
            }
            System.out.println("\n");
        }
    }
}
