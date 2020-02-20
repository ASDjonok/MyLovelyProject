package patterns.composite;

public class Main {
    public static void main(String[] args) {
        ConcreteShape concreteShape = new Line();
//        concreteShape.draw();

        System.out.println("=============");
        Group group = new Group(concreteShape, new Round());
//        group.draw();

        /*group.setShapes(group, concreteShape);
        group.draw();*/

        Group group2 = new Group(group, new Triangle());
        group2.draw();

        System.out.println(":)");
    }
}
