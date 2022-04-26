package xu_ly_ngoai_le_debug.menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\uD83D\uDE33");
        String menu = """
                    ============MENU================
                    1. 💋HIỂN THỊ DANH SÁCH
                    2. 💋THÊM
                    3. 💋SỬA
                    4. 💋XÓA
                    5. 💋THOÁT
                """;
        boolean check = false;
        while (!check) {

            try {
                System.out.println();
                System.out.println(menu);
                System.out.print("Nhập lựa chọn >>> ");
                int choice = sc.nextInt();
//                set(choice);
                if (choice < 1 || choice > 5){
                    throw new Exception();
                }
                switch (choice) {
                    case 1:
                        System.out.println("Danh sách là: ");
                        break;
                    case 2:
                        System.out.println("Thêm: ");
                        break;
                    case 3:
                        System.out.println("Sửa: ");
                        break;
                    case 4:
                        System.out.println("Xóa: ");
                        break;
                    case 5:
                        System.exit(5);
                        break;
                }
            } catch (Exception e) {
                System.err.println("\uD83D\uDE35\u200D\uD83D\uDCAB Nhập sai định dạng!!! \uD83D\uDE35\u200D\uD83D\uDCAB");
                sc.nextLine(); //tránh lặp khi nhập chữ.
            }
        }
    }

//    public static void set(int c) throws Exception {
//        if (c < 1 || c > 5) throw new Exception();
//    }
}
