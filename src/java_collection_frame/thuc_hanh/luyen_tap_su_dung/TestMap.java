package java_collection_frame.thuc_hanh.luyen_tap_su_dung;

import java.util.*;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Hung", 24);
        hashMap.put("Huy", 25);
        hashMap.put("Kien", 24);
        hashMap.put("Thien", 22);
        System.out.println("Hien thi danh sach: ");
        System.out.println(hashMap);

        System.out.println("In ra những phần tử có Value = 24: ");
        for (String key : hashMap.keySet()) {
            int value = hashMap.get(key);
            if (value == 24) {
                System.out.print(key + " = " + value + "; ");
            }
        }

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
//        treeMap.put("Hung", 24);
//        treeMap.put("Huy", 25);
//        treeMap.put("Kien", 24);
//        treeMap.put("Thien", 22);
        System.out.println("\nIn ra danh sách đã sắp xếp: ");
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println("Hiển thị danh sách LinkedHashMap: ");
        System.out.println(linkedHashMap);
        System.out.println("Hiển thị giá trị có key = Cook");
        System.out.println(linkedHashMap.get("Cook"));
    }
}

