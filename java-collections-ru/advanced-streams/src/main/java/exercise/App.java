package exercise;

import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.stream.Stream;

// BEGIN
public class App {
    public static String getForwardedVariables(String conf) {
        String[] confArray = conf.split(System.lineSeparator());
        return  Arrays.stream(confArray)
                .filter(param -> param.startsWith("environment"))
                .map(line -> line.replaceAll("environment=", ""))
                .map(line -> line.replace("\"", ""))
                .flatMap(line -> Stream.of(line.split(",")))
                .filter(param -> param.startsWith("X_FORWARDED_"))
                .map(line -> line.replace("X_FORWARDED_", ""))
                .collect(Collectors.joining(","));
    }
}
//END
