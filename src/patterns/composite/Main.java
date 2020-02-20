package patterns.composite;

public class Main {
    public static void main(String[] args) {
        ConcreteShape concreteShape = new Line();
        concreteShape.draw();
        System.out.println(":)");
    }
}
