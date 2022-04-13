package abstract_class_and_interface.resizeable_interface;

public abstract class Shape implements IResizeable{
    private String color = "xanh";
    private boolean filled = true;

    public Shape(){
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Hình " + (isFilled() ? "đã tô màu " + getColor() + "." : "chưa được tô màu.");
    }
}
