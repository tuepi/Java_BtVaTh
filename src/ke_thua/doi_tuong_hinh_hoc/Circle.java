package ke_thua.doi_tuong_hinh_hoc;

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
                + getRadius()
                + ", thuộc lớp: "
                + super.toString();
    }
}
 class CircleTest{
     public static void main(String[] args) {
         Circle circle = new Circle();
         System.out.println(circle);

         circle = new Circle(3.5);
         System.out.println(circle);

         circle = new Circle("nâu", false, 3.5);
         System.out.println(circle);
     }
 }
