package array_list.quan_ly_can_bo;

public class Staff extends Cadres{
    private String job;

    public Staff() {
    }

    public Staff(String name, int age, String gender, String address, String job) {
        super(name, age, gender, address);
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Nhân Viên: {" + super.toString() +
                ", Công Việc = '" + job + '\'' +
                '}';
    }
}
