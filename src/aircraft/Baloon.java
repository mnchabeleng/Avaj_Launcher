package src.aircraft;

import java.util.HashMap;

import src.weather.Coordinates;
import src.weather.WaetherTower;
import src.weather.WeatherType;

public class Baloon extends Aircraft {
    public Baloon(String name, String type, Coordinates coordinates){
        super(name, type, coordinates);
    }

    public void updateConditions(){
        HashMap<WeatherType, String> message = new HashMap<WeatherType, String>();
        message.put(WeatherType.FOG, "Baloon FOG!");
        message.put(WeatherType.RAIN, "Baloon RAIN!");
        message.put(WeatherType.SNOW, "Baloon SNOW!");
        message.put(WeatherType.SUN, "Baloon SUN!");
    }

    public void registerTower(WaetherTower waetherTower){

    }
}