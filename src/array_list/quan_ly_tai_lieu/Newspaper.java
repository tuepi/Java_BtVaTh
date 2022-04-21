package array_list.quan_ly_tai_lieu;

public class Newspaper extends Document {
    private String releaseDay;

    public Newspaper() {
    }

    public Newspaper(String publishingCompany, int releaseNumber, String releaseDay) {
        super(publishingCompany, releaseNumber);
        this.releaseDay = releaseDay;
    }

    public String getReleaseDay() {
        return releaseDay;
    }

    public void setReleaseDay(String releaseDay) {
        this.releaseDay = releaseDay;
    }

    @Override
    public String toString() {
        return "Báo {" + super.toString() +
                ", Ngày Phát Hành = " + releaseDay +
                '}';
    }
}
