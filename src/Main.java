package src;

import src.helpers.File;
import src.helpers.Message;
import src.helpers.Validate;
import src.weather.WeatherProvider;
import src.weather.WeatherTower;
import src.aircraft.AircraftFactory;

import java.util.ArrayList;
import java.util.List;
import java.io.PrintWriter;

public class Main {
    public static int cycle = 0;
    public static PrintWriter printWriter;
    private static final File file = new File();

    public static void main(String[] args) {
        String scenarioFile;
        List<String> list;
        String[] aircraftData;
        
        if(args.length < 1 || args[0].length() < 1){
            Message.error("Scenario file required");
            return;
        }
        
        scenarioFile = args[0];
        list = new ArrayList<String>();
        
        file.setFileName(scenarioFile);
        list.addAll(file.readFile());
        if(list.isEmpty()) return;
        if(!Validate.cycle(list.get(0))){
            Message.error("First line of scenario must be positive integer");
            return;
        }

        WeatherTower weatherTower = new WeatherTower();

        for(int i = 1; i < list.size(); i++)
        {
            aircraftData = file.splitString(list.get(i));
            if(!Validate.aircraftData(aircraftData))
                Message.error("Invalid Aircraft data");
            else{
                try{
                    String type = aircraftData[0];
                    String name = aircraftData[1];
                    int lng = Integer.parseInt(aircraftData[2]);
                    int lat = Integer.parseInt(aircraftData[3]);
                    int height = Integer.parseInt(aircraftData[4]);

                    System.out.println(type + " " + name + " " + lng + " " + lat + " " + height);
                    AircraftFactory.newAircraft(type, name, lng, lat, height);
                }catch(Exception e){
                    Message.error(e.getMessage());
                    return;
                }
            }
        }
    }
}
