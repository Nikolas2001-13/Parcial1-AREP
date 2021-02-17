package edu.escuelaing.arep.parcial.clima;

import static spark.Spark.*;
public class SparkWebApp {

    private static ApiWeather apiWeather;

    public static void main(String[] args) {
        Gson gson = new Gson();
        port(getPort());
        apiWeather = new ApiWeather();
        get("/clima", (request, response) -> {
            String city = req.queryParams("ciudad");
            String json = "";
            json = getWeather(city);
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
