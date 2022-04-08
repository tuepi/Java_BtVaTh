package access_modifier.static_property;

public class TestStatic {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setName("Toyota 1");
        car1.setEngine("Skyactiv 1");
        System.out.println(car1.numOfCars + ". Kiểu: {" + car1.getName() + ", " + car1.getEngine() + "}");

        Car car2 = new Car("Toyota 2" , "Skyactiv 2");
        System.out.println(Car.numOfCars);
        System.out.println(car2);

        Car car3 = new Car();
        System.out.println(car3);
        System.out.println(Car.numOfCars);


    }
}
