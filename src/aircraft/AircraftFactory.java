package src.aircraft;

import src.weather.Coordinates;

public class AircraftFactory {
    public static Flyable newAircraft(String type, String name, int lng, int lat, int height){
        Coordinates coordinates = new Coordinates(lng, lat, height);
        if(type.toLowerCase().equals("JetPlane"))
            return new JetPlane(name, coordinates);
        else if(type.toLowerCase().equals("Helicopter"))
            return new Helicopter(name, coordinates);
        else if(type.toLowerCase().equals("Baloon"))
            return new Baloon(name, coordinates);
        return null;
    }
}