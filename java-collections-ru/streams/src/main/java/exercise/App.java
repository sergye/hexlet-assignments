package exercise;

import java.util.List;

// BEGIN
public class App {
    public static long getCountOfFreeEmails(List<String> emailsList) {
        List<String> publicDomains = List.of("gmail.com", "yandex.ru", "hotmail.com");
        return emailsList.stream()
                .map(email -> email.split("@")[1])
                .filter(publicDomains::contains)
                .count();
    }
}
// END
