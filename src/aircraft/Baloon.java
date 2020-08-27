package src.aircraft;

import src.weather.Coordinates;
import src.weather.WeatherTower;

import java.util.HashMap;

public class Baloon extends Aircraft implements Flyable {
    private WeatherTower weatherTower;

    public Baloon(String name, Coordinates coordinates){
        super(name, coordinates);
    }

    public void updateConditions(){
        String weather = weatherTower.getWeather(this.coordinates);
        HashMap<String, String> messages = new HashMap<String, String>();
        messages.put("SUN", "Baloon SUN!");
        messages.put("RAIN", "Baloon RAIN!");
        messages.put("FOG", "Baloon FOG!");
        messages.put("SNOW", "Baloon SNOW!");

        if(weather.equals("SUN"))
            this.coordinates = new Coordinates(coordinates.getLng() + 2, coordinates.getLat(), coordinates.getHeight() + 4);
        else if(weather.equals("RAIN"))
            this.coordinates = new Coordinates(coordinates.getLng(), coordinates.getLat(), coordinates.getHeight() - 5);
        else if(weather.equals("FOG"))
            this.coordinates = new Coordinates(coordinates.getLng(), coordinates.getLat(), coordinates.getHeight() - 3);
        else if(weather.equals("SNOW"))
            this.coordinates = new Coordinates(coordinates.getLng(), coordinates.getLat(), coordinates.getHeight() - 15);
    }

    public void registerTower(WeatherTower weatherTower){
        this.weatherTower = weatherTower;
        this.weatherTower.register(this);
    }
}