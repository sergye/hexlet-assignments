package exercise;

// BEGIN
public class App {
    private static final String ERROR = "Не удалось посчитать площадь";
    private static final String END_CALC = "Вычисление окончено";
    public static void printSquare(Circle circle) {
        int square = 0;
        try {
            square = (int) Math.round(circle.getSquare());
            System.out.println(square);
            System.out.println(END_CALC);
        } catch (NegativeRadiusException e) {
            System.out.println(ERROR);
            System.out.println(END_CALC);
        }
    }
}
// END
