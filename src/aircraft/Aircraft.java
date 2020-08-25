package src.aircraft;

import src.weather.Coordinates;

public class Aircraft {
    protected int id;
    protected String name;
    protected String type;
    protected Coordinates coordinates;
    private static int counter = 0;

    public Aircraft(String name, String type, Coordinates coordinates){
        this.id = nextId();
        this.name = name;
        this.type = type;
        this.coordinates = coordinates;
    }

    public int nextId(){
        return ++(Aircraft.counter);
    }
}