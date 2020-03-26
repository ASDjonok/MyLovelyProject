package patterns.adapter;

public class PointFloat /*implements PointDrawInterface*/{
    private double x;
    private double y;

    public PointFloat(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public PointFloat() {
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

//    @Override
    public void draw() {
        System.out.println("x = " + x + " y = " + y);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
