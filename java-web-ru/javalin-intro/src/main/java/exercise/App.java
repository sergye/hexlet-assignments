package exercise;

// BEGIN
import io.javalin.Javalin;
// END

public final class App {

    public static Javalin getApp() {

        // BEGIN
        var app = Javalin.create(config -> {
            config.plugins.enableDevLogging();
        });

        // Описываем, что будет происходить при GET запросе на адрес /
        app.get("/", ctx -> ctx.result("Welcome to Javalin!"));
        app.get("/welcome", ctx -> ctx.result("Welcome to Hexlet!"));

        return app;
        // END
    }

    public static void main(String[] args) {
        Javalin app = getApp();
        app.start(7070);
    }
}
