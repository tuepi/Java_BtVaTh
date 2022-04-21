package array_list.quan_ly_tai_lieu;

public class Newpaper extends Document {
    private String releaseDay;

    public Newpaper() {
    }

    public Newpaper(String publishingCompany, int releaseNumber, String releaseDay) {
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
        return "Newpaper {" + super.toString() +
                "releaseDay = " + releaseDay +
                '}';
    }
}
