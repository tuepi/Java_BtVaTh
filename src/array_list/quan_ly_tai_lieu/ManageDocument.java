package array_list.quan_ly_tai_lieu;

import array_list.Manage;

import java.util.ArrayList;
import java.util.List;

public class ManageDocument implements Manage<Document> {
     List<Document> documents = new ArrayList<>();
    List<Book> books = new ArrayList<>();
    List<Journal> journals = new ArrayList<>();
    List<Newpaper> newpapers = new ArrayList<>();
     int id = 1;
    @Override
    public void add(Document document) {
        document.setId(id++);
        documents.add(document);
    }

    @Override
    public void edit(int id, Document document) {
        if (findById(id) != -1){
            documents.set(findById(id), document);
        }
        else {
            System.out.println("Không có loại tài liệu đó!!");
        }
    }

    @Override
    public void delete(int id) {
        if (findById(id) != -1){
            documents.remove(findById(id));
        }else {
            System.out.println("không có@!");
        }
    }

    @Override
    public void findByDocument(Document document, int id) {
        if (findById(id) != -1){
            System.out.println(documents.get(findById(id)));
        }
    }

    @Override
    public int findById(int id) {
        for (int i = 0; i < documents.size(); i++) {
            if (documents.get(i).getId() == id){
                return i;
            }
        }
        return -1;
    }

    @Override
    public Document findObjectByName(int id) {
        if (findById(id) != -1){
            return documents.get(findById(id));
        } else {
            return null;
        }
    }

    @Override
    public void display() {
        for (int i = 0; i < documents.size(); i++) {
            System.out.println(documents.get(i));
        }
    }

    @Override
    public void exit() {
        System.exit(0);
    }
}
