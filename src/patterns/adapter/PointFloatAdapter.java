package patterns.adapter;

public class PointFloatAdapter extends PointFloat {
    private PointInteger pointInteger;

    public PointFloatAdapter(double x, double y) {
//        super();
        pointInteger = new PointInteger((int) x, (int) y);
    }

    @Override
    public void draw() {
        System.out.println("x = " + pointInteger.getX() + " y = " + pointInteger.getY());
    }

    /*public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }*/
}
