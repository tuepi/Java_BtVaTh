package abstract_class_and_interface.comparable_shape_interface;

import java.lang.reflect.Array;
import java.util.Arrays;
public class ComparableTest {
    public static void main(String[] args) {
        ComparableCirlce[] circles = new ComparableCirlce[3];
        circles[0] = new ComparableCirlce(3.6);
        circles[1] = new ComparableCirlce();
        circles[2] = new ComparableCirlce("vang", true, 3);

        System.out.println("Truoc khi sap xep: ");
        for (ComparableCirlce circle:
             circles) {
            System.out.println(circle);
        }
        Arrays.sort(circles);
        System.out.println("Sau khi sap xep: ");
        for (ComparableCirlce circle : circles
             ) {
            System.out.println(circle);
        }
    }
}
