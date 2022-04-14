package quan_ly_xe;

import java.util.Arrays;

public class QuanLyXeHoi implements QuanLy<XeHoi>{

    private XeHoi[] danhSach = new XeHoi[3];
    private XeHoi[] danhSachXoa ;
    private int size = 0;

    @Override
    public void them(XeHoi xeHoi) {
        danhSach[size] = xeHoi;
        size++;
    }

    @Override
    public void sua(String ten, XeHoi xeHoi) {
        if (timKiem(ten) != -1) {
            danhSach[timKiem(ten)] = xeHoi;
        }
        else {
            System.out.println("Không tìm thấy xe cần sửa!!!");
        }
    }

    @Override
    public void xoa(String ten) {
        danhSachXoa = new XeHoi[size - 1];
        int viTri = timKiem(ten);
        if (viTri != -1) {
            for (int i = 0; i < viTri; i++) {
                danhSachXoa[i] = danhSach[i];
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
