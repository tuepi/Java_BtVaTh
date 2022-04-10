package ke_thua.doi_tuong_hinh_hoc;

public class Square extends Rectangle{
    public Square(){
    }
    public Square(double side){
        super(side, side);
    }
    public Square(String color, boolean filled, double side){
        super(color, filled, side, side);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }
    public void setWidth(double width) {
        setSide(width);
    }
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "Hình vuông có cạnh = "
                + getSide()
                + ", thuộc lớp: "
                + super.toString();

    }
}
class Test{
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square("yellow", true, 3.5);
        System.out.println(square);
    }
}