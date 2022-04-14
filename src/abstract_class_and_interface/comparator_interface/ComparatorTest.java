package abstract_class_and_interface.comparator_interface;

import ke_thua.doi_tuong_hinh_hoc.Circle;

import java.util.Arrays;

public class ComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.4);
        circles[1] = new Circle();
        circles[2] = new Circle("Blue" , true, 4.5);

        System.out.println("Truoc khi sap xep: ");


        for (Circle circle : circles) {
            System.out.println(circle);

        }

        CircleComparator c = new CircleComparator();
        Arrays.sort(circles, c);

        System.out.println("Sau khi sap xep: ");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}
