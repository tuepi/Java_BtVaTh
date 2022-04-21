package array_list.quan_ly_tai_lieu;

public class Book extends Document{
    private String authorName;
    private int pageNumber;

    public Book() {
    }

    public Book(String publishingCompany, int releaseNumber, String authorName, int pageNumber) {
        super(publishingCompany, releaseNumber);
        this.authorName = authorName;
        this.pageNumber = pageNumber;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    @Override
    public String toString() {
        return  "Book {" +super.toString() +
                "authorName = '" + authorName + '\'' +
                ", pageNumber = " + pageNumber +
                '}';
    }
}
