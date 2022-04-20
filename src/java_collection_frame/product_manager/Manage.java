package java_collection_frame.product_manager;

public interface Manage<T> {
    void add(T t);

    void edit(int id, T t);

    void display();

    void delete(int id);

    T findByName(String name);

    void sort();

    int findById(int id);
}
