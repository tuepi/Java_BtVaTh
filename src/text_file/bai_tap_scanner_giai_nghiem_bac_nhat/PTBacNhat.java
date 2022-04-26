package text_file.bai_tap_scanner_giai_nghiem_bac_nhat;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PTBacNhat {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("src\\text_file\\bai_tap_scanner_giai_nghiem_bac_nhat\\inp.txt"));

        String s = sc.nextLine();
        System.out.println(s);
        String[] arr = s.split(";");
        double a = Integer.parseInt(arr[0]);
        double b = Integer.parseInt(arr[1]);
//        PrintWriter pw = new PrintWriter("src\\text_file\\bai_tap_scanner_giai_nghiem_bac_nhat\\rs.txt");
        FileWriter fileWriter = new FileWriter("src\\text_file\\bai_tap_scanner_giai_nghiem_bac_nhat\\rs.txt",true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        if (a == 0){
            if (b == 0){
                bufferedWriter.write("Phương trình vô số nghiệm.\n");
            } else {
                bufferedWriter.write("Phương trình vô nghiệm.\n");
            }
        } else {
            bufferedWriter.write("Phương trình có nghiệm: " + (-a / b) + "\n");
        }
        bufferedWriter.close();
        fileWriter.close();
    }
}
