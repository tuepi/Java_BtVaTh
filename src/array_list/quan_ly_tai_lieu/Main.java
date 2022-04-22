package array_list.quan_ly_tai_lieu;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();

//        manageDocument.add("Book", new Book("Hà nội", 12, "Tố Hữu", 3));
//        manageDocument.add("Book", new Book("Hà nội", 12, "Tố Hữu", 3));
//        manageDocument.add("Book", new Book("Hà nội", 12, "Tố Hữu", 3));
//        manageDocument.add("Journals", new Journal("Hà Tĩnh", 23, 32, 2));
//        manageDocument.add("Journals", new Journal("Hà Tĩnh", 23, 32, 2));
//        manageDocument.add("Journals", new Journal("Hà Tĩnh", 23, 32, 2));
//        manageDocument.add("Journals", new Journal("Hà Tĩnh", 23, 32, 2));
//        manageDocument.add("Newspaper", new Newspaper("Hà Thành", 132, "Duy Hưng"));
//        manageDocument.add("Newspaper", new Newspaper("Hà Thành", 132, "Duy Hưng"));
//        manageDocument.add("Newspaper", new Newspaper("Hà Thành", 132, "Duy Hưng"));
//        manageDocument.add("Newspaper", new Newspaper("Hà Thành", 132, "Duy Hưng"));
//        manageDocument.display();
//
//        System.out.println("Danh sách Sách: ");
//        manageDocument.displayBook();
//        System.out.println("Danh sách Tạp chí: ");
//        manageDocument.displayJournals();
//        System.out.println("Danh sách Báo: ");
//        manageDocument.displayNewspaper();
//        manageDocument.findByDocument();
//        manageDocument.findByJournals();
    }

    static Scanner sc = new Scanner(System.in);
    static ManageDocument manageDocument = new ManageDocument();

    static public void menu() {
        String menu = """
                ===============MENU===============
                1.             THÊM
                2.             XÓA
                3.        HIỂN THỊ TẤT CẢ
                4.        HIỂN THỊ SÁCH
                5.        HIỂN THỊ TẠP CHÍ
                6.         HIỂN THỊ BÁO
                0.          >>>THOÁT<<<
                ---------------------------------
                Nhập lựa chọn >>> 
                """;
        String menuAdd = """
                ===============THÊM===============
                1.             SÁCH
                2.             TẠP CHÍ
                3.             BÁO
                                
                0.       >>>TRỞ LẠI MENU<<<
                ---------------------------------
                Nhập lựa chọn >>> 
                """;

        do {
            System.out.print(menu);
            int choice = Integer.parseInt(sc.nextLine());
            System.out.println("---------------------------------");

            switch (choice) {
                case 1:
                    do {
                        System.out.println(menuAdd);
                        int choiceAdd = Integer.parseInt(sc.nextLine());
                        System.out.println("---------------------------------");
                        switch (choiceAdd) {
                            case 1:
                                addBook();
                                break;
                            case 2:
                                addJournals();
                                break;
                            case 3:
                                addNewspaper();
                                break;
                            case 0:
                                menu();
                                break;
                            default:
                                System.out.print("Vui lòng chọn lại (0 >>> 3): ");
                        }
                    } while (true);

                case 2:
                    System.out.print("Nhập vào Mã tài liệu cần xóa: ");
                    int id = Integer.parseInt(sc.nextLine());
                    manageDocument.delete(id);
                    checkMenu();
                    break;
                case 3:
                    manageDocument.display();
                    checkMenu();
                    break;
                case 4:
                    System.out.println("Danh sách Sách: ");
                    manageDocument.findByBook();
                    checkMenu();
                    break;
                case 5:
                    System.out.println("Danh sách Tạp Chí: ");
                    manageDocument.findByJournals();
                    checkMenu();
                    break;
                case 6:
                    System.out.println("Danh sách Báo: ");
                    manageDocument.findByNewspaper();
                    checkMenu();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Vui lòng chọn lại (0 >>> 6): ");
            }

        } while (true);

    }

    public static boolean checkMenu() {
        System.out.print("Tiếp tục (Y / N) >>> ");
        String choice = sc.nextLine().toLowerCase(Locale.ROOT);
        if (choice.equals("y")) {
            menu();
            return true;
        } else if (choice.equals("n")) {
            return false;
        } else {
            System.out.println("Vui Lòng chọn lại.");
            checkMenu();
            return true;
        }
    }

    public static void addBook() {
        System.out.println("Thêm SÁCH: ");
        System.out.print("Nhập Tên Nhà Xuất Bản: ");
        String publishingCompany = sc.nextLine();
        System.out.print("Nhập Số Bản Phát Hành: ");
        int releaseNumber = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập Tên Tác Giả: ");
        String authorName = sc.nextLine();
        System.out.print("Nhập Số Trang: ");
        int pageNumber = Integer.parseInt(sc.nextLine());
        Document book = new Book(publishingCompany, releaseNumber, authorName, pageNumber);
        manageDocument.add(book);
    }

    public static void addJournals() {
        System.out.println("Thêm TẠP CHÍ: ");
        System.out.print("Nhập Tên Nhà Xuất Bản: ");
        String publishingComp = sc.nextLine();
        System.out.print("Nhập Số Bản Phát Hành: ");
        int releaseNumJour = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập Số Phát Hành: ");
        int issueNumber = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập Tháng Phát Hành: ");
        int releaseMonth = Integer.parseInt(sc.nextLine());

        Document journals = new Journal(publishingComp, releaseNumJour, issueNumber, releaseMonth);
        manageDocument.add(journals);
    }

    public static void addNewspaper() {
        System.out.println("Thêm BÁO: ");
        System.out.print("Nhập Tên Nhà Xuất Bản: ");
        String publishingNews = sc.nextLine();
        System.out.print("Nhập Số Bản Phát Hành: ");
        int releaseNumNews = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập Ngày Phát Hành: ");
        String releaseDay = sc.nextLine();

        Document newspaper = new Newspaper(publishingNews, releaseNumNews, releaseDay);
        manageDocument.add(newspaper);
    }

}
