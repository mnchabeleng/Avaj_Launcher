package src.helpers;

public class Message {
    public static void success(String message){
        System.out.println(ANSI.GREEN + ANSI.BOLD + "Success: " + message + ANSI.DEFAULT);
    }

    public static void error(String message){
        System.out.println(ANSI.RED + ANSI.BOLD + "Error: " + message + ANSI.DEFAULT);
    }
}