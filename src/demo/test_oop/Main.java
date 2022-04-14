package demo.test_oop;

public class Main {
    public static void main(String[] args) {
        PhuongTien[] pts = new PhuongTien[2];
        pts[0] = new Oto("Toyota" , "Đen", "Landcuiser", 80000, 5);
        pts[1] = new XeHoi("Honda", "Trắng", "Wave @", 1000, 110);

        for (PhuongTien i : pts
             ) {
            System.out.println("i = " + i);
        }
        
    
    }
}
