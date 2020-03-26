package patterns.adapter;

public class Line {
    private PointFloat pointFloat1;
    private PointFloat pointFloat2;
//    private PointDrawInterface pointDrawInterface;

    public Line(PointFloat pointFloat1, PointFloat pointFloat2/*, PointDrawInterface pointDrawInterface*/) {
        this.pointFloat1 = pointFloat1;
        this.pointFloat2 = pointFloat2;
    }

    void draw() {
        pointFloat1.draw();
        pointFloat2.draw();
//        pointDrawInterface.draw();
    }
}
