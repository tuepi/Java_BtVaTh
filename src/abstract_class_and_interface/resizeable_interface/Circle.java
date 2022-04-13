package abstract_class_and_interface.resizeable_interface;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {
    }
    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }

    public double getPerimeter(){
        return radius * 2 * Math.PI;
    }

    @Override
    public String toString() {
        return  "Hình tròn có bán kính = "
                + getRadius() + ", "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        this.setRadius(getRadius()*percent);
    }
}
