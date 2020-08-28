package src;

import java.util.LinkedList;
import java.util.List;
import src.helpers.File;
import src.helpers.Message;
import src.helpers.Validate;

public class Main {
    private static final File file = new File();

    public static void main(String[] args) {
        String cycle;
        String scenarioFile;
        List<String> list;
        String[] aircraftData;
        
        if(args.length < 1 || args[0].length() < 1){
            Message.error("Scenario file required");
            return;
        }
        
        scenarioFile = args[0];
        list = new LinkedList<String>();
        
        file.setFileName(scenarioFile);
        list.addAll(file.readFile());
        if(list.isEmpty()) return;
        cycle = list.get(0);
        if(!Validate.cycle(cycle)){
            Message.error("First line of scenario must be positive integer");
            return;
        }
        for(int i = 1; i < list.size(); i++)
        {
            aircraftData = file.splitString(list.get(i));
            if(!Validate.aircraftData(aircraftData))
                Message.error("Invalid Aircraft data");
            else
                System.out.println(aircraftData.length);
        }
    }
}
