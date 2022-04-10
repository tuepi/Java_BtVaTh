package ke_thua.circle_cylinder;

public class Circle {
    private double radius;
    private String color;

    public Circle(){
    }
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * getRadius() * getRadius();
    }

    @Override
    public String toString() {
        return "Hình tròn {Bán kính: " + getRadius() + ", Màu sắc: " + getColor() + ", Diện tích :" + getArea() + "}";
    }


}

class Cylinder extends Circle{
    private double height;

    public Cylinder() {
    }
     public Cylinder(double height) {
        this.height = height;
     }

     public Cylinder(double height, double radius, String color){
        super(radius, color);
        this.height = height;
     }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return super.getArea() * getHeight();
    }

    @Override
    public String toString() {
        return "Hình trụ thuộc lớp: " + super.toString() + " với Chiều cao: " + getHeight() + " có Thể tích = " + getVolume();
    }
}

