package abstract_class_and_interface.colorable_shape;

import ke_thua.doi_tuong_hinh_hoc.Rectangle;



public class ColorSquare extends Rectangle implements IColorable {
    @Override
    public void howToColor() {
        System.out.println("Tô màu cả bốn cạnh.");
    }

    public ColorSquare() {
    }

    public ColorSquare(double size) {
        super(size, size);
    }

    public ColorSquare(double width, double length) {
        super(width, length);
    }

    public ColorSquare(String color, boolean filled, double width, double length) {
        super(color, filled, width, length);
    }
}

