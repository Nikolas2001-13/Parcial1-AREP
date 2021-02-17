package edu.escuelaing.arep.parcial.clima;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.*;
import java.net.*;



public class ApiWeather {

    /**
     * Metodo que genera el json al introducir la ciudad y llave especifica
     * @param city tipo String
     * @return json con la informacion del clima en esa ciudad
     * @throws Exception
     */
    public String getWeather(String city) throws Exception{
        private String key = "5f69fcdcf0d46474fcb513e8dab75a65";
        URL clima = new URL("/api.openweathermap.org/data/2.5/weather?q=" + city+"&appid="+key);
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(clima.openStream()))) {
            String inputLine = null;
            while ((inputLine = reader.readLine()) != null) { System.out.println(inputLine);
            }
        } catch (IOException x) {
            System.err.println(x);
        }
}