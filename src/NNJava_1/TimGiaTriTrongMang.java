package NNJava_1;

import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tên cần tìm:");
        String inp = scanner.nextLine();
//        String a = "Ko";
        Boolean tonTai = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(inp)) {
                System.out.println("Số thứ tự của " + inp + " trong mảng là : " + (i+1));
//            a = "Có";
                tonTai = true;
            }
        }
//        if (a == "Ko") {
//            System.out.println("Không có tên trong mảng.");
//        }
        if (!tonTai) {
            System.out.println("Không có tên " + inp + " trong mảng.");
        }
    }
}
