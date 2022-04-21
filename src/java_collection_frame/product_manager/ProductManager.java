package java_collection_frame.product_manager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ProductManager implements Manage<Product>{

    List<Product> products = new ArrayList<>();
//    int count = 1;

    @Override
    public void add(Product product) {
//        product.setId(count++);
        products.add(product);
    }

    @Override
    public int findById(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id){
                return i;
            }
        }
        return -1;
    }
    @Override
    public void edit(int id, Product product) {
        if (findById(id) != -1){
            products.set(findById(id), product);
        }else {
            System.out.println("Không có!!");
        }

    }

    @Override
    public void display() {
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i));
        }
    }

    @Override
    public void delete(int id) {
        if (findById(id) != -1){
            products.remove(findById(id));
        }
    }

    @Override
    public Product findByName(String name) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equals(name)){
                return products.get(i);
            }
        }
        return null;
    }

    @Override
    public void sort() {
        Collections.sort(products);
    }


}
