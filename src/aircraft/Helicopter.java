package src.aircraft;

import src.weather.Coordinates;
import src.weather.WeatherTower;
import src.Main;

import java.util.HashMap;

public class Helicopter extends Aircraft implements Flyable {
    private WeatherTower weatherTower;

    public Helicopter(String name, Coordinates coordinates){
        super(name, coordinates);
    }

    public void updateConditions(){
        String weather = weatherTower.getWeather(this.coordinates);
        HashMap<String, String> messages = new HashMap<String, String>();
        messages.put("SUN", "Helicopter SUN!");
        messages.put("RAIN", "Helicopter RAIN!");
        messages.put("FOG", "Helicopter FOG!");
        messages.put("SNOW", "Helicopter SNOW!");

        if(weather.equals("SUN"))
            this.coordinates = new Coordinates(coordinates.getLng() + 10, coordinates.getLat(), coordinates.getHeight() + 2);
        else if(weather.equals("RAIN"))
            this.coordinates = new Coordinates(coordinates.getLng() + 5, coordinates.getLat(), coordinates.getHeight());
        else if(weather.equals("FOG"))
            this.coordinates = new Coordinates(coordinates.getLng() + 1, coordinates.getLat(), coordinates.getHeight());
        else if(weather.equals("SNOW"))
            this.coordinates = new Coordinates(coordinates.getLng(), coordinates.getLat(), coordinates.getHeight() - 12);

        Main.printWriter.println("Baloon#" + this.name + "(" + this.id + "): " + messages.get(weather));
        if(this.coordinates.getHeight() == 0){
            this.weatherTower.unregister(this);
            Main.printWriter.println("");
            Main.printWriter.println("");
        }
    }

    public void registerTower(WeatherTower weatherTower){
        this.weatherTower = weatherTower;
        this.weatherTower.register(this);
    }
}
