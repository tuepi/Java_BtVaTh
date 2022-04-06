package LopVaDoiTuong;

import java.util.Scanner;

public class Rectangle {
    double width, height;

    public Rectangle(){
    }

    public Rectangle(double width,double height) {
        this.width = width;
        this.height = height;
    }

    double getArea() {
        return this.width * this.height;
    }

    double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display(){
        return "Rectangle{ width = " + width + ", height = " + height + "}";
    }

//    public void hien() {
//        System.out.println("Chu vi là " + getPerimeter());
//        System.out.println("Diện tích là: " + getArea());
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        double width = scanner.nextDouble();
        System.out.print("Nhập chiều rộng: ");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("Hình chữ nhật của bạn " + rectangle.display());
        System.out.println("Chu vi của HCN là: " + rectangle.getPerimeter());
        System.out.println("Diện tích của HCN là: " + rectangle.getArea());

//        rectangle.hien();
    }
}
