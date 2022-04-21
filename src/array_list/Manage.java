package array_list;

import array_list.quan_ly_tai_lieu.Document;

public interface Manage<T> {
    void add(T t);

    void edit(int id, T t);

    void delete(int id);

    void findByDocument(T t, int id);

    int findById(int id);

    T findObjectByName(int id);

    void display();

    void exit();

}
