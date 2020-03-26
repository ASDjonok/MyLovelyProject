package patterns.adapter;

public class Main {
    public static void main(String[] args) {
        Line line = new Line(new PointFloat(1.1d, 2.2d), new PointFloat(1.2, 2.3)/*, new PointFloatDrawer()*/);
        line.draw();
        Line line2 = new Line(new PointFloatAdapter(1.1d, 2.2d), new PointFloatAdapter(1.2, 2.3)/*, new PointFloatDrawer()*/);
        line2.draw();
    }
}
