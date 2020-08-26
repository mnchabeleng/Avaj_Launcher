package src.weather;

import src.helpers.Validate;

public class Coordinates {
    private int lng;
    private int lat;
    private int height;

    public Coordinates(int lng, int lat, int height){
        setLng(lng);
        setLat(lat);
        setHeight(height);
    }

    public void setLng(int lng){
        if(lng < 0)
            lng = 0;
        this.lng = lng;
    }

    public void setLat(int lat){
        if(lat < 0)
            lat = 0;
        this.lat = lat;
    }

    public void setHeight(int height){
        if(height > 100)
            height = 100;
        else if(height < 0)
            height = 0;
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