package array_list.quan_ly_can_bo;

public interface Manage<T> {
    void add(T t);

    void edit(String name, T t);

    void delete(String name);

    int findByName(String name);

    T findCadresByName(String name);

    void display();

    void exit();

}
