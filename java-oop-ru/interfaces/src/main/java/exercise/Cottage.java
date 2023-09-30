package exercise;

// BEGIN
public class Cottage implements Home {
    private static final String MESSAGE = "%d этажный коттедж площадью %.1f метров";
    private final double area;
    private final int floorCount;

    public Cottage(double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public int compareTo(Home another) {
        if (this.getArea() == another.getArea()) {
            return 0;
        }
        return (this.getArea() > another.getArea()) ? 1 : -1;
    }

    public String toString() {
        return String.format(MESSAGE, floorCount, area);
    }
}
// END
