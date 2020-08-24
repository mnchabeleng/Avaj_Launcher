package src.aircraft;

import java.util.HashMap;

import src.weather.WeatherType;

public class Baloon extends Aircraft {
    public Baloon(String name, String type, int lng, int lat, int height){
        super(name, type, lng, lat, height);
    }

    public void updateWeather(){
        HashMap<WeatherType, String> message = new HashMap<WeatherType, String>();
        message.put(WeatherType.FOG, "Baloon FOG!");
        message.put(WeatherType.RAIN, "Baloon RAIN!");
        message.put(WeatherType.SNOW, "Baloon SNOW!");
        message.put(WeatherType.SUN, "Baloon SUN!");
    }
}