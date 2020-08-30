package src.helpers;

import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File {
    private String fileName;

    public File(){
    }

    public File(String fileName){
        setFileName(fileName);
    }

    public void setFileName(String fileName){
        this.fileName = fileName;
    }

    public String getFileName(){
        return this.fileName;
    }

    public List<String> readFile(){
        List<String> list = new ArrayList<String>(); 
        try {
            FileReader fileReader = new FileReader(this.fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String currentLine;

            while((currentLine = bufferedReader.readLine()) != null)
                list.add(currentLine);
                
            bufferedReader.close();
            Message.success("Loaded ./" + this.fileName);
        }catch(IOException e){
            Message.error("Failed to load scenario file");
        }
        return list;
    }

    public String[] splitString(String s){
        return s.split("\\s+");
    }
}
