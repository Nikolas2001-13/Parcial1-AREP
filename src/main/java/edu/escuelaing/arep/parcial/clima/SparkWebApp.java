package edu.escuelaing.arep.parcial.clima;

import static spark.Spark.*;
import com.google.gson.Gson;

public class SparkWebApp {

    public static void main(String[] args) {
        ApiWeather apiWeather = new ApiWeather();
        Gson gson = new Gson();
        port(getPort());
        get("/clima", (request, response) -> {
            String city = request.queryParams("ciudad");
            String json = apiWeather.getWeather(city);
            return gson.toJson(json);
        });
    }
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set
    }
}
