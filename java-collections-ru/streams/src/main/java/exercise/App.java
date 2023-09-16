package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN
public class App {
    public static long getCountOfFreeEmails(List<String> emailsList) {
        List<String> publicDomains = List.of("gmail.com", "yandex.ru", "hotmail.com");
        return emailsList.stream()
                .map(email -> email.split("@"))
                .map(email -> email[1])
                .filter(publicDomains::contains)
                .count();
    }
}
// END
