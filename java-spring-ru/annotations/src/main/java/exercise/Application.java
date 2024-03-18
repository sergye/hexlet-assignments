package exercise;

import exercise.model.Address;
import exercise.annotation.Inspect;
import java.lang.reflect.Method;

public class Application {
    public static void main(String[] args) {
        var address = new Address("London", 12345678);

        // BEGIN
        for (Method method : Address.class.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Inspect.class)) {
                String type = method.getReturnType().getName();
                type = type.contains("String") ? "String" : type;
                System.out.println("Method " + method.getName() + " returns a value of type " + type);
            }
        }

        // END
    }
}
