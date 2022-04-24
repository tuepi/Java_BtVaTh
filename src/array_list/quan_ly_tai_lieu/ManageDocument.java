package array_list.quan_ly_tai_lieu;

import array_list.Manage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static array_list.quan_ly_tai_lieu.Main.documents;

public class ManageDocument implements Manage<Document> {
    Scanner sc = new Scanner(System.in);
//    static List<Document> documents = new ArrayList<>();
//    List<Book> books = new ArrayList<>();
//    List<Journal> journals = new ArrayList<>();
//    List<Newspaper> newspaper = new ArrayList<>();
    int id = 1;

//    int idBook = 1;
//    int idJournals = 1;
//    int idNewspaper = 1;


    @Override
    //thêm String type
    public void add(Document document) {
        document.setId(id++);
        documents.add(document);

//        if (type.equals("Book")) {
//            document.setId(idBook++);
//            books.add((Book) document);
//        }
//        else if (type.equals("Journals")) {
//            document.setId(idJournals++);
//            journals.add((Journal) document);
//        }
//        else if (type.equals("Newspaper")) {
//            document.setId(idNewspaper++);
//            newspaper.add((Newspaper) document);
////            documents.add((Document)newspaper);
//        }

    }

    @Override
    public void edit(int id, Document document) {
        if (findById(id) != -1) {
            documents.set(findById(id), document);
        } else {
            System.out.println("Không có loại tài liệu đó!!");
        }
    }

    @Override
    public void delete(int id) {
        if (findById(id) != -1) {
            documents.remove(findById(id));
        } else {
            System.out.println("không có!");
        }
    }

    @Override
    public void findByDocument(Document document) {
//        if (findById(id) != -1) {
//            System.out.println(documents.get(findById(id)));
//        }
    }

    public void findByBook() {
        int count = 0;
        if (documents.size() != 0) {
            for (Document d : documents) {
                if (d instanceof Book) {
                    System.out.println(d);
                    count++;
                }

            }
            if (count == 0){
                System.out.println("Không có Sách!!!");
            }
        } else {
            System.out.println("Danh Sách TRỐNG!!!");
        }

    }

    public void findByJournals() {
        int count = 0;
        if (documents.size() != 0) {
            for (Document d : documents) {
                if (d instanceof Journal)
                    System.out.println(d);
                count++;
            }
            if (count == 0){
                System.out.println("Không có Tạp Chí!!!");
            }
        } else {
            System.out.println("Danh Sách TRỐNG!!!");
        }

    }

    public void findByNewspaper() {
        int count = 0;
        if (documents.size() != 0){
            for (Document d : documents) {
                if (d instanceof Newspaper)
                    System.out.println(d);
                    count++;
            }
            if (count == 0){
                System.out.println("Không có Báo!!!");
            }
        } else {
            System.out.println("Danh Sách TRỐNG!!!");
        }

    }

    @Override
    public int findById(int id) {
        for (int i = 0; i < documents.size(); i++) {
            if (documents.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public Document findObjectByName(int id) {
        if (findById(id) != -1) {
            return documents.get(findById(id));
        } else {
            return null;
        }
    }

    @Override
    public void display() {
        if (documents.size() != 0){
            System.out.println("Danh sách Tài Liệu: ");
            for (int i = 0; i < documents.size(); i++) {
                System.out.println(documents.get(i));
            }
        } else {
            System.out.println("Danh Sách TRỐNG!!!");
        }

//        displayBook();
//        displayJournals();
//        displayNewspaper();
    }
//
//    public void displayBook() {
//        for (int i = 0; i < books.size(); i++) {
//            System.out.println(books.get(i));
//        }
//    }
//
//    public void displayJournals() {
//        for (int i = 0; i < journals.size(); i++) {
//            System.out.println(journals.get(i));
//        }
//    }
//
//    public void displayNewspaper() {
//        for (int i = 0; i < newspaper.size(); i++) {
//            System.out.println(newspaper.get(i));
//        }
//    }

    @Override
    public void exit() {
        System.exit(0);
    }
}
