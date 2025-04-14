package Collections;

public class Dog implements Animal {

    @Override
    public void sound() {
        System.out.println("Dog Bark");
    }

    @Override
    public void eat() {
System.out.println("Dog eats bone");
    }
}
