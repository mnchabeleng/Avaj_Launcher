package src.helpers;

public class Message {
    public static final String BOLD = "\033[1m";
    public static final String DEFAULT = Message.WHITE + "\033[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String WHITE = "\u001B[37m";

    public static void success(String message){
        System.out.println(Message.GREEN + Message.BOLD + "Success: " + message + Message.DEFAULT);
    }

    public static void error(String message){
        System.out.println(Message.RED + Message.BOLD + "Error: " + message + Message.DEFAULT);
    }
}