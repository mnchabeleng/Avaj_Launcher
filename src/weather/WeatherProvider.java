package src.weather;

public class WeatherProvider {
    private static WeatherProvider weatherProvider = new WeatherProvider();
    private static String[] weather = {"RAIN", "FOG", "SUN", "SNOW"};

    private WeatherProvider(){}

    public static WeatherProvider getProvider(){
        return WeatherProvider.weatherProvider;
    }

    public String getCurrentWeather(Coordinates coordinates){
        int sumCoordinates = coordinates.getLng() + coordinates.getLat() + coordinates.getHeight();
        return weather[sumCoordinates % weather.length];
    }
}