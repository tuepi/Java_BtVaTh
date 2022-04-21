package java_collection_frame.product_manager;

public class Main {
    public static void main(String[] args) {
        ProductManager proM = new ProductManager();
        proM.add(new Product(2, "Thiên", 5));
        proM.add(new Product(5,"Kiên", 2));
        proM.add(new Product(1, "Hưng", 4));
//        proM.sort();
        proM.display();
        System.out.println("---");

        System.out.println(proM.findById(5));
        proM.edit(5, new Product(4,"Kê", 3));
        proM.display();
        System.out.println("---");
        proM.delete(1);
        proM.display();

        System.out.println(proM.findByName("Thiên"));
    }
}
