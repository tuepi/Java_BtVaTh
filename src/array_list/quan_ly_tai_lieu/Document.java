package array_list.quan_ly_tai_lieu;

public class Document {
    private int id;
    private String publishingCompany;
    private int releaseNumber;
    private String type;

    public Document() {
    }

    public Document(String publishingCompany, int releaseNumber) {
        this.publishingCompany = publishingCompany;
        this.releaseNumber = releaseNumber;
    }

    public Document(String publishingCompany, int releaseNumber, String authorName, int pageNumber) {
    }

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public String getPublishingCompany() {
        return publishingCompany;
    }

    public void setPublishingCompany(String publishingCompany) {
        this.publishingCompany = publishingCompany;
    }

    public int getReleaseNumber() {
        return releaseNumber;
    }

    public void setReleaseNumber(int releaseNumber) {
        this.releaseNumber = releaseNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return  ", Mã tài liệu = " + id +
                ", Nhà Xuất Bản = '" + publishingCompany + '\'' +
                ", Số bản phát hành = " + releaseNumber;
    }
}
