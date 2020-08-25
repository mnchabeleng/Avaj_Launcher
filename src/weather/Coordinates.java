package src.weather;

import src.helpers.Validate;

public class Coordinates {
    protected int lng;
    protected int lat;
    protected int height;

    public Coordinates(Coordinates coordinates){
        this.setLng(coordinates.lng);
        this.setLat(coordinates.lat);
        this.setHeight(coordinates.height);
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