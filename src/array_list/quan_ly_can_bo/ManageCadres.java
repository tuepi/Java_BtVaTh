package array_list.quan_ly_can_bo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManageCadres implements Manage<Cadres> {

    private List<Cadres> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    @Override
    public void add(Cadres cadres) {
        list.add(cadres);
    }

    @Override
    public void edit(String name, Cadres cadres) {
        if (findByName(name) != -1) {
            list.set(findByName(name), cadres);
        } else {
            System.out.println("Không tồn tại Cán Bộ có tên " + name + " trong Danh sách.");
        }
    }

    @Override
    public void delete(String name) {
        if (findByName(name) != -1) {
            list.remove(findByName(name));
        } else {
            System.out.println("Không tồn tại Cán Bộ có tên " + name + " trong Danh sách.");
        }
    }

    @Override
    public int findByName(String name) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public Cadres findCadresByName(String name) {
        if (findByName(name) != -1) {
            return list.get(findByName(name));
        } else {
            System.out.println("Không tồn tại Cán Bộ có tên " + name + " trong Danh sách.");
            return null;
        }
    }

    @Override
    public void display() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    @Override
    public void exit() {
        System.out.print("Nhập 0 để thoát: ");
        sc.nextInt();
        System.exit(0);
    }
}
