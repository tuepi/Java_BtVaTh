package ke_thua.point_movablepoint;

public class TestPoiMov {
    public static void main(String[] args) {
        Point p = new Point(1.2f, 2.3f);
        System.out.println(p);

        MovablePoint m = new MovablePoint(3.4f,5.6f);
        System.out.println(m);

        Point m1 = new MovablePoint(2.1f, 3.2f,4.3f, 5.4f);
        System.out.println(m1);

        m1 = new MovablePoint(3f,4f, 5f, 6f);
        System.out.println(m1);

        MovablePoint m2 = new MovablePoint(1.1f,2.2f,3f,4f);
        System.out.println(m2.move());
    }
}
