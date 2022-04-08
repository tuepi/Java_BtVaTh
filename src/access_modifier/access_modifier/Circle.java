package access_modifier.access_modifier;

public class Circle {
    private double radius = 1;
    private String color = "red";

    public Circle(){
    }
    public Circle(double r){
        this.radius = r;
    }
    public double getRadius(){
        return this.radius;
    }
    protected double getArea(){
        return Math.PI * this.radius * this.radius;
    }

}
