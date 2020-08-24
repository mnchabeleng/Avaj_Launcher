package src.aircraft;

import src.helpers.Validate;

public class Aircraft {
    protected int id;
    protected String name;
    protected String type;
    protected int lng;
    protected int lat;
    protected int height;
    private static int counter = 0;

    public Aircraft(String name, String type, int lng, int lat, int height){
        setName(name);
        setType(type);
        setLng(lng);
        setLat(lat);
        setHeight(height);
    }

    public void setName(String name){
        this.name = name;
    }

    public void setType(String type){
        this.type = type;
    }

    public void setLng(int lng){
        if(!Validate.lng(lng))
            lng = 0;
        this.lng = lng;
    }

    public void setLat(int lat){
        if(!Validate.lat(lat))
            lat = 0;
        this.lat = lat;
    }

    public void setHeight(int height){
        if(!Validate.height(height))
            height = 100;
        this.height = height;
    }

    public String getName(){
        return this.name;
    }

    public String getType(){
        return this.type;
    }

    public int getLng(){
        return this.lng;
    }

    public int getLat(){
        return this.lat;
    }

    public int getHeight(){
        return this.height;
    }
}