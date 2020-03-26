package patterns.adapter;

public class PointInteger {
    private int x;
    private int y;

    public PointInteger(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    /*public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }*/

    // @Override
    public void draw() {
        System.out.println("x = " + x + "y = " + y);
    }

}
