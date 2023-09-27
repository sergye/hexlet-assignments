package exercise;

// BEGIN
public class Segment {
    private final Point point1;
    private final Point point2;

    public Segment(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public Point getBeginPoint() {
        return point1;
    }

    public Point getEndPoint() {
        return point2;
    }

    public Point getMidPoint() {
        int x = (point2.getX() + point1.getX()) / 2;
        int y = (point2.getY() + point1.getY()) / 2;
        return new Point(x, y);
    }
}
// END
