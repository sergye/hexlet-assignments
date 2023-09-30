package exercise;

import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class App {
    public static List<String> buildApartmentsList(List<Home> homes, int number) {
        return homes.stream()
                .sorted(Home::compareTo)
                .map(Object::toString)
                .limit(number)
                .collect(Collectors.toList());
    }
}
// END
