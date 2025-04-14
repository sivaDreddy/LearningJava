package Collections;

public class Cow implements Animal {
    @Override
    public void sound() {
        System.out.println("Cow Moo");
    }

    @Override
    public void eat() {
        System.out.println("Cow eats grass");
    }
}
