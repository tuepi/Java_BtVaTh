package quan_ly_xe;

public interface QuanLy<T>{
    void them(T t);

    void sua(String ten, T t);

    void xoa(String ten);

    int timKiem(String ten);

    void sapXep();

    void inTatCa();
}
