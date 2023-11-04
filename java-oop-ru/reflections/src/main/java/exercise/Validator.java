package exercise;

import java.lang.reflect.Field;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class Validator {
    public static List<String> validate(Address address) {
        List<Field> fields = List.of(address.getClass().getDeclaredFields());
        fields.forEach(field -> field.setAccessible(true));
        return fields.stream()
                .filter(f -> f.isAnnotationPresent(NotNull.class))
                .filter(f -> isValueNull(f, address))
                .map(Field::getName)
                .collect(Collectors.toList());
    }

    private static boolean isValueNull(Field field, Address address) {
        try {
            return field.get(address) == null;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
// END
