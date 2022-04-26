package text_file.tinh_toan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TongTichMaxMin {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("src\\text_file\\bai_tap_scanner_giai_nghiem_bac_nhat\\inp.txt"));
        List<Integer> list = new ArrayList<>();
        String[] arr = scanner.nextLine().split(";");
        for (int i = 0; i < arr.length; i++) {
            list.add(Integer.parseInt(arr[i]));
        }
        int sum = 0;
        int pof = 1;
        int max = Integer.parseInt(arr[0]);
        int min = Integer.parseInt(arr[0]);

        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
            pof *= list.get(i);
            if (list.get(i) > max){
                max = list.get(i);
            }
            if (list.get(i) < min){
                min = list.get(i);
            }
        }


//        System.out.println("Mảng là: ");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + "\t");
//            sum += Integer.parseInt(arr[i]);
//            pof *= Integer.parseInt(arr[i]);
//            if (Integer.parseInt(arr[i]) > max){
//                max = Integer.parseInt(arr[i]);
//            }
//            if (Integer.parseInt(arr[i]) < min){
//                min = Integer.parseInt(arr[i]);
//            }
//        }
        FileWriter fileWriter = new FileWriter("src\\text_file\\bai_tap_scanner_giai_nghiem_bac_nhat\\rs.txt",true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("Tổng là:  " + sum + "\n");
        bufferedWriter.write("Tích là: " + pof + "\n");
        bufferedWriter.write("Max là: " + max + "\n");
        bufferedWriter.write("Min là: " + min + "\n");

        bufferedWriter.close();
        fileWriter.close();


    }
}
