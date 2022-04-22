package array_list.quan_ly_thi_sinh;

import java.util.ArrayList;
import java.util.List;

public class QuanLyThiSinh {
    int sBD = 0;

    List<ThiSinh> thiSinhs = new ArrayList<>();

    public void add(ThiSinh thiSinh){
        thiSinh.setId(sBD++);
        thiSinhs.add(thiSinh);
    }

    public void hienThi() {
        for (ThiSinh ts : thiSinhs
             ) {
            System.out.println(ts);
        }
    }

    public void findById(int id) {
        for (ThiSinh ts : thiSinhs
             ) {
            if (ts.getId() == id){
                System.out.println(ts);
            }
        }
    }
}
