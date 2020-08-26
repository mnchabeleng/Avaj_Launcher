package src.aircraft;

import src.weather.WeatherTower;

interface Flyable {
    public void updateConditions();
    public void registerTower(WeatherTower weatherTower);
}