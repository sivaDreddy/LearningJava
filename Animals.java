package Collections;

public class Animals {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();
        dog.eat();
        Animal cow = new Cow();
        cow.sound();
        cow.eat();
    }
}
