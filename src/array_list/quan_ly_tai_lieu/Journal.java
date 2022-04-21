package array_list.quan_ly_tai_lieu;

public class Journal extends Document{
    private int issueNumber;
    private int releaseMonth;

    public Journal(int issueNumber, int releaseMonth) {
        this.issueNumber = issueNumber;
        this.releaseMonth = releaseMonth;
    }

    public Journal( String publishingCompany, int releaseNumber, int issueNumber, int releaseMonth) {
        super(publishingCompany, releaseNumber);
        this.issueNumber = issueNumber;
        this.releaseMonth = releaseMonth;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public int getReleaseMonth() {
        return releaseMonth;
    }

    public void setReleaseMonth(int releaseMonth) {
        this.releaseMonth = releaseMonth;
    }

    @Override
    public String toString() {
        return  "Journal {" + super.toString() +
                "issueNumber = " + issueNumber +
                ", releaseMonth = " + releaseMonth +
                '}';
    }
}
