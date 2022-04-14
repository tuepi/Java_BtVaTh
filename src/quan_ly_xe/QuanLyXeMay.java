package quan_ly_xe;

public class QuanLyXeMay implements QuanLy<XeMay>{

    private XeMay[] danhSach = new XeMay[3];
    private int size = 0;

    @Override
    public void them(XeMay xeMay) {
        danhSach[size] = xeMay;
        size++;
    }

    @Override
    public void sua(String name, XeMay xeMay) {
       int viTri = timKiem(name);
        if (viTri != -1){
            danhSach[viTri] = xeMay;
        } else {
            System.out.println("Không tìm thấy!!!");
        }

    }

    @Override
    public void xoa(String name) {
        int viTri = timKiem(name);
        if (viTri != -1) {
            danhSach[viTri] = null;
        } else {
            System.out.println("Không tìm thấy!!!");
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

    }

    @Override
    public void inTatCa() {
        for (int i = 0; i < size; i++) {
            System.out.println(danhSach[i]);
        }
    }
}
