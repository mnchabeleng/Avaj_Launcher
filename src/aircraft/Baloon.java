package src.aircraft;

import src.helpers.Message;
import src.weather.WeatherTower;
import src.weather.Tower;

public class Baloon extends Aircraft implements Flyable{
    private WeatherTower weatherTower;
    
    public Baloon(String name, Coordinates coordinates){
        super(name, coordinates);
    }

    public void updateConditions(){

    }
    
    public void registerTower(WeatherTower weatherTower){
        this.weatherTower = weatherTower;
        this.weatherTower.register(this);
        Message.success("Tower says: Baloon#" + this.name + "(" + this.id + ")" + " registered to weather tower.");
    }
}