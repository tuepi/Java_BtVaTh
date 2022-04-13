package abstract_class_and_interface.resizeable_interface;

public class Rectangle extends Shape {
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

    @Override
    public void resize(double percent) {
        this.setLength(this.getLength()*percent);
        this.setWidth(this.getWidth()*percent);
    }
}
