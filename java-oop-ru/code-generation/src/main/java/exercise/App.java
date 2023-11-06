package exercise;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

// BEGIN
public class App {
    public static void save(Path path, Car car) throws IOException {
        String stringifiedCar = car.serialize();
        Files.writeString(path,stringifiedCar);
    }

    public static Car extract(Path path) throws IOException {
        String stringifiedCar = Files.readString(path);
        return Car.deserialize(stringifiedCar);
    }
}
// END
