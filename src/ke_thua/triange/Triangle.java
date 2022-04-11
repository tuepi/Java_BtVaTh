package ke_thua.triange;

import ke_thua.doi_tuong_hinh_hoc.Shape;

public class Triangle extends Shape {
    private double side1, side2, side3;

    public Triangle(){
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getPerimeter(){
        return this.side1 + this.side2 + this.side3;
    }


    public double getHeight(){
        double p = getPerimeter() / 2;
        return 2 * Math.sqrt(p * (p - side1) * (p - side2) * (p - side3)) / side1;
    }

    public double getArea(){
        return side1 * getHeight() / 2;
    }

    @Override
    public String toString() {
        return "Tam giác {" + side1 + ", " + side2 + ", " + side3 + "}" + '\n'
                + "Thuộc lớp: " + super.toString() + '\n' + "Có Diện tích = " + getArea()
                + ", Chu vi = " + getPerimeter();
    }
}
