package abstract_class_and_interface.resizeable_interface;

public class Square extends Rectangle implements IColorable{
    public Square(){
    }
    public Square(double side){
        super(side, side);
    }
    public Square(String color, boolean filled, double side){
        super(color, filled, side, side);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }
    public void setWidth(double side) {
        super.setWidth(side);
    }
    public void setLength(double side) {
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "Hình vuông có cạnh = "
                + getSide()
                + ", thuộc lớp: "
                + super.toString();

    }

    @Override
    public void howToColor() {
        System.out.println("Hình vuông tô màu hết 4 cạnh.");
    }
}
