package array_list.quan_ly_can_bo;

public class Engineers extends Cadres{
    private String trainingIndustry;

    public Engineers() {
    }

    public Engineers(String name, int age, String gender, String address, String trainingIndustry) {
        super(name, age, gender, address);
        this.trainingIndustry = trainingIndustry;
    }

    public String getTrainingIndustry() {
        return trainingIndustry;
    }

    public void setTrainingIndustry(String trainingIndustry) {
        this.trainingIndustry = trainingIndustry;
    }

    @Override
    public String toString() {
        return "Kỹ Sư: {" + super.toString() +
                ", Ngành đào tạo = '" + trainingIndustry + '\'' +
                '}';
    }
}
