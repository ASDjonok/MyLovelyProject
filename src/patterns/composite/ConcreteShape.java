package patterns.composite;

public class ConcreteShape implements Shape {
    @Override
    public void draw() {
//        System.out.println("Я є ConcreteShape");
        System.out.println("Я є " + getClass().getSimpleName());
    }
}
