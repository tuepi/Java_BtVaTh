package java_collection_frame.product_manager;

public class Main {
    public static void main(String[] args) {
        ProductManager proM = new ProductManager();
        proM.add(new Product(1, "Thiên", 2));
        proM.add(new Product(2, "Thiên", 2));
        proM.display();
    }
}
