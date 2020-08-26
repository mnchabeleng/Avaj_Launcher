package src.helpers;

public class Validate {
    public static boolean aircraftData(String[] data){
        try{
            if(data.length != 5)
                return false;
            if(!lng(Integer.parseInt(data[2])))
                return false;
            if(!lat(Integer.parseInt(data[3])))
                return false;
            if(!height(Integer.parseInt(data[4])))
                return false;
        }catch(Exception e){
            return false;
        }
        return true;
    }
}
