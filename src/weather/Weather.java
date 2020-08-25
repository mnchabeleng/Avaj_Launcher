package src.weather;

public class Weather {
    private static WeatherType[] weather = WeatherType.values();

    public WeatherType currentWeather(Coordinates coordinates){
        int sumCoordinates = coordinates.getLng() + coordinates.getLat() + coordinates.getHeight();
        return  weather[sumCoordinates % WeatherType.values().length];
    }
}