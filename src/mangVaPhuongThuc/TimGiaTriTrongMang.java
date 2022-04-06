package mangVaPhuongThuc;

import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        while (x != -1){
            System.out.printf("Nhập tên sinh viên cần tìm : ");
            String inp = scanner.nextLine();
            boolean check = false;
            for (int i = 0; i < students.length; i++) {
                if (students[i].equals(inp)) {
                    System.out.println("Vị trí của " + inp + " trong mảng là " + i);
                    check = true;
                    break;
                }
            }
            if (check == false) {
                System.out.println("Không có sinh viên " + inp + " trong mảng.");
            }
//            x = 0;
        }
    }

}
