package test_abstract_interface;

public interface Manage<T> {
    void add(T t);

    void edit(String name, T t);

    int search(String name);

    void display();
}
