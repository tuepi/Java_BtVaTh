package abstract_class_and_interface.resizeable_interface;

public class CircleInterface implements IResizeable{
    private double radius = 1;

    public CircleInterface(){
    }

    public CircleInterface(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void resize(double percent) {
        this.setRadius(radius * percent);
        System.out.println(this.getRadius());
    }

}
class TestCircle {
    public static void main(String[] args) {
        CircleInterface[] c = new CircleInterface[2];
        c[0] = new CircleInterface();
        c[1] = new CircleInterface(4);

        System.out.println("Giá trị trước khi đổi: ");
        int i = 1;
        for (CircleInterface a : c) {
            System.out.print("Hình thứ " + i + " có bán kính: ");
            System.out.println(a.getRadius());
            i++;
        }
        System.out.println("Giá trị sau khi thay đổi ngẫu nhiên: ");
        i = 1;
        double resize = Math.floor(Math.random() * 100);

        for (CircleInterface a : c) {
            System.out.print("Hình thứ " + i + " có bán kính: ");
            a.resize(resize);
            i++;
        }


    }
}