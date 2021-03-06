package quan_ly_xe;

import demo.test_oop.XeHoi;

import java.util.Arrays;

public class QuanLyXeMay implements QuanLy<XeMay>{

    private final XeMay[] danhSach = new XeMay[3];
    private XeMay[] danhSachXoa;
    private int size = 0;

    @Override
    public void them(XeMay xeMay) {
        danhSach[size] = xeMay;
        size++;
    }

    @Override
    public void sua(String ten, XeMay xeMay) {
       int viTri = timKiem(ten);
        if (viTri != -1){
            danhSach[viTri] = xeMay;
        } else {
            System.out.println("Không tìm thấy xe cần sửa!!!");
        }

    }

    @Override
    public void xoa(String ten) {
        danhSachXoa = new XeMay[size - 1];
        int viTri = timKiem(ten);
        if (viTri != -1) {
            for (int i = 0; i < viTri; i++) {
                danhSachXoa[i] = danhSach[i];
            }
            for (int i = viTri; i < size - 1; i++) {
                danhSachXoa[i] = danhSach[i + 1];
            }
        } else {
            System.out.println("Không tìm thấy xe cần xóa!!!");
        }
    }

    @Override
    public int timKiem(String ten) {
        for (int i = 0; i < size; i++) {
            if (ten == danhSach[i].getTen()) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void sapXep() {
        Arrays.sort(danhSach);
    }

    @Override
    public void inTatCa() {
        for (int i = 0; i < size; i++) {
            System.out.println(danhSach[i]);
        }
    }

    public void inSauXoa() {
        for (int i = 0; i < danhSachXoa.length; i++) {
            System.out.println(danhSachXoa[i]);
        }
    }
}
