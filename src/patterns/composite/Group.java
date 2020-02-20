package patterns.composite;

public class Group implements Shape{
    private Shape[] shapes;

    @Override
    public void draw() {
        System.out.println("Я є Group");
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
