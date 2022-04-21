package array_list.quan_ly_can_bo;

public class Worker extends Cadres{
    private int level;

    public Worker() {
    }

    public Worker(String name, int age, String gender, String address, int level) {
        super(name, age, gender, address);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Công nhân: {" + super.toString() +
                ", Cấp bậc = " + level +
                '}';
    }
}
