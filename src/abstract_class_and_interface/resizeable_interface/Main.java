package abstract_class_and_interface.resizeable_interface;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle());
        shapes.add(new Rectangle());
        shapes.add(new Square());

//        Shape[] shapes = new Shape[3];
//        shapes[0] = new Circle();
//        shapes[1] = new Rectangle();
//        shapes[2] = new Square();
        System.out.println("Trước khi thay đổi: ");
        for (Shape i : shapes) {
            System.out.println(i.toString());
            if (i instanceof Circle) {
                System.out.println("Diện tích trước khi thay đổi: " + ((Circle) i).getArea());
            }
            else if (i instanceof Rectangle) {
                System.out.println("Diện tích trước khi thay đổi:" + ((Rectangle) i).getArea());

            }
            else {
                System.out.println("Lỗi!!!");
            }
        }
        System.out.println("Sau khi thay đổi: ");
        int rd = (int)Math.round(Math.random()*100);
        System.out.println("Random = " + rd);
        for (Shape i : shapes) {
            System.out.println(i.toString());
            if (i instanceof Circle) {
                i.resize(rd);
                System.out.println("Diện tích sau khi thay đổi: " + ((Circle) i).getArea());
            }
            else if (i instanceof Rectangle) {
                if (i instanceof Square) {
                    ((Square) i).howToColor();
                }
                i.resize(rd);
                System.out.println("Diện tích sau khi thay đổi: " + ((Rectangle) i).getArea());

            }
            else {
                System.out.println("Lỗi!!!");
            }
        }
    }
}
