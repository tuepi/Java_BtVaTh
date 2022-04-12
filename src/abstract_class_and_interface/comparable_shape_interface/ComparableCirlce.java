package abstract_class_and_interface.comparable_shape_interface;

import ke_thua.doi_tuong_hinh_hoc.Circle;


public class ComparableCirlce extends Circle implements Comparable<ComparableCirlce>{

    public ComparableCirlce(){
    }
    public ComparableCirlce(String color, boolean filled, double radius) {
        super(color, filled, radius);
    }


    public ComparableCirlce(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(ComparableCirlce o) {
        if (getRadius() > o.getRadius()) return 2;
        else if (getRadius() < o.getRadius()) return -2;
        else return 2;
    }

}
