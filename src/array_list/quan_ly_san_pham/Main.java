package array_list.quan_ly_san_pham;

import java.util.Scanner;

public class Main {
    static ManageUser manageUser;
    public static void main(String[] args) {
        manageUser = new ManageUser();
        set();
    }
    public static void set(){
        try {
            manageUser.menu();
        } catch (Exception e){
            System.out.println("Nhập sai định dạng.");
            set();
        }
    }
}
