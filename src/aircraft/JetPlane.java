package src.aircraft;

import src.weather.Coordinates;
import src.weather.WeatherTower;

import java.util.HashMap;

public class JetPlane extends Aircraft implements Flyable {
    private WeatherTower weatherTower;

    public JetPlane(String name, Coordinates coordinates){
        super(name, coordinates);
    }

    public void updateConditions(){
        String weather = weatherTower.getWeather(this.coordinates);
        HashMap<String, String> messages = new HashMap<String, String>();
        messages.put("SUN", "JetPlane SUN!");
        messages.put("RAIN", "JetPlane RAIN!");
        messages.put("FOG", "JetPlane FOG!");
        messages.put("SNOW", "JetPlane SNOW!");

        if(weather == "SUN")
            this.coordinates = new Coordinates(coordinates.getLng(), coordinates.getLat() + 10, coordinates.getHeight() + 5);
        else if(weather == "RAIN")
            this.coordinates = new Coordinates(coordinates.getLng(), coordinates.getLat() + 5, coordinates.getHeight());
        else if(weather == "FOG")
            this.coordinates = new Coordinates(coordinates.getLng(), coordinates.getLat() + 1, coordinates.getHeight());
        else if(weather == "SNOW")
            this.coordinates = new Coordinates(coordinates.getLng(), coordinates.getLat(), coordinates.getHeight() - 7);
    }

    public void registerTower(WeatherTower weatherTower){
        this.weatherTower = weatherTower;
        this.weatherTower.register(this);
    }
}