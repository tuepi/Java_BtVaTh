package array_list.quan_ly_tai_lieu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        String menu = """
//                ===============MENU===============
//                1.             THÊM
//                2.             XÓA
//                3.        HIỂN THỊ TẤT CẢ
//                4.        HIỂN THỊ SÁCH
//                5.        HIỂN THỊ TẠP CHÍ
//                6.         HIỂN THỊ BÁO
//                0.          >>>THOÁT<<<
//                ---------------------------------
//                Nhập lựa chọn >>>
//                """;
//        System.out.println(menu);

        ManageDocument manageDocument = new ManageDocument();

        manageDocument.add(new Book("Hà nội", 12, "Tố Hữu", 3));
        manageDocument.add(new Book("Hà nội", 12, "Tố Hữu", 3));
        manageDocument.add(new Book("Hà nội", 12, "Tố Hữu", 3));
        manageDocument.add(new Journal("Hà Tĩnh", 23, 32, 2));
        manageDocument.add(new Newpaper("Hà Thành", 132, "Duy Hưng"));
        manageDocument.display();

//        manageDocument.findByDocument();

    }
}
