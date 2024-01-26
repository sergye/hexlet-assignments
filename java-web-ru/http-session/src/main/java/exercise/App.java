package exercise;

import io.javalin.Javalin;
import java.util.List;
import java.util.Map;

public final class App {

    private static final List<Map<String, String>> USERS = Data.getUsers();

    public static Javalin getApp() {

        var app = Javalin.create(config -> {
            config.plugins.enableDevLogging();
        });

        // BEGIN
        app.get("/users", ctx -> {
            int page = ctx.queryParamAsClass("page", Integer.class).getOrDefault(0);
            int per = ctx.queryParamAsClass("per", Integer.class).getOrDefault(0);
            if (page > 0 || per > 0) {
                ctx.json(USERS.subList(page * per - per, page * per));
            } else {
                ctx.json(USERS.subList(0, 5));
            }

        });

        // END

        return app;

    }

    public static void main(String[] args) {
        Javalin app = getApp();
        app.start(7070);
    }
}
