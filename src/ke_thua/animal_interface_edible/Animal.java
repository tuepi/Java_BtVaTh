package ke_thua.animal_interface_edible;

public abstract class Animal {
    public abstract String makeSound();
}

interface Edible {
    String howtoEat();
}
class Tiger extends Animal {
    public String makeSound(){
        return "Tao là Hổ đây!";
    }
}

class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Gà gáy Ò...ó...o";
    }

    @Override
    public String howtoEat() {
        return "Làm món gà không lối thoát!!!";
    }
}
abstract class Fruit implements Edible {
    public abstract String howtoEat();
}

class Orange extends Fruit {
    @Override
    public String howtoEat() {
        return "Bóc vỏ bỏ mồm.";
    }
}

class Apple extends Fruit {
    @Override
    public String howtoEat() {
        return "Khới mà ăn.";
    }
}

class AbsAndInterfTest {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();

        for (Animal animal : animals) {
            if (animal instanceof Edible) {
                System.out.println(animal.makeSound() + '\n' + "Cách ăn: " + ((Edible) animal).howtoEat() );
            } else {
                System.out.println(animal.makeSound());
            }
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();

        for (Fruit fruit : fruits) {
            System.out.println(fruit.howtoEat());
        }
    }
}
