package java_collection_frame;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class SoLanXuatHienCuaTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi cần xét: ");
        String input = scanner.nextLine();
        String[] arr = input.split(" ");
        Map<String, Integer> map = new TreeMap<>();
        int size = 0;
        for (String i : arr) {
            boolean flag = false;
            if (!i.equals("")) {
                size++;
                for (String key : map.keySet()) {
                    if (i.equals(key)) {
                        flag = true;
                        map.put(key, (map.get(key) + 1));
                    }
                }
            }
            if (!flag) {
                map.put(i, 1);
            }

        }
        System.out.println("Hiển thị số lần xuất hiện của từ:");
        for (String key : map.keySet()) {
            System.out.println("'" + key + "' xuất hiện: " + map.get(key) + " lần.");
        }
        System.out.println("Hiển thị phần tử xuất hiện nhiều hơn phân nửa: ");
        int count = 0;
        for (String key : map.keySet()) {
            if (map.get(key) > size / 2) {
                count = 1;
                System.out.println("'" + key + "' xuất hiện: " + map.get(key) + " lần.");
            }
        }
        if (count == 0){
            System.out.println("Không có.");
        }

    }
}
