package ke_thua.doi_tuong_hinh_hoc;

public class Rectangle extends Shape{
    private double width = 1.0;
    private double length = 3.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Hình chữ nhật có Chiều dài: "
                + getLength() + ", Chiều rộng: "
                + getWidth() + " là một lớp con của: "
                + super.toString();
    }
}
class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(3.5,5.4);
        System.out.println(rectangle);

        rectangle = new Rectangle("hồng", true, 2.3,4.5);
        System.out.println(rectangle);
    }
}