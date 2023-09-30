package exercise;

// BEGIN
public class Flat implements Home {
    private static final String MESSAGE = "Квартира площадью %.1f метров на %d этаже";
    private final double area;
    private final double balconyArea;
    private final int floor;

    public Flat(double area, double balconyArea, int floor) {
        this.area = area;
        this.balconyArea = balconyArea;
        this.floor = floor;
    }

    @Override
    public double getArea() {
        return area + balconyArea;
    }

    @Override
    public int compareTo(Home another) {
        if (this.getArea() == another.getArea()) {
            return 0;
        }
        return (this.getArea() > another.getArea()) ? 1 : -1;
    }

    public String toString() {
        return String.format(MESSAGE, getArea(), floor);
    }
}
// END
