package src.helpers;

public class Validate {
    public static boolean aircraftData(String[] data){
        try{
            if(data.length != 5)
                return false;
            /*
            if(!lng(Integer.parseInt(data[2])))
                return false;
            if(!lat(Integer.parseInt(data[3])))
                return false;
            if(!height(Integer.parseInt(data[4])))
                return false;
            */
        }catch(Exception e){
            return false;
        }
        return true;
    }

    public static boolean cycle(String cycle){
        Integer new_cycle;
        
        try{
            new_cycle = Integer.parseInt(cycle);
            if(new_cycle > 0)
                return true;
        }catch(Exception e){}
        return false;
    }

    public static boolean lng(int lng){
        if(lng >= 0)
            return true;
        return false;
    }

    public static boolean lat(int lat){
        if(lat >= 0)
            return true;
        return false;
    }

    public static boolean height(int height){
        if(height >= 0 && height <= 100)
            return true;
        return false;
    }
}
