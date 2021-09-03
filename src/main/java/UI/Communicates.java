package UI;

public class Communicates {
    public static String askPlayerName = "Please provide player name";
    public static String askPlacementMethod = "Please provide a placing method\n 1 for manual\n 2for auto";
    public static String wrongValue = "Wrong value, please provide a valid number";
    public static String mainMenu = "main menu text";

    public static String insertShip(int shipSize) {
        return "Please insert your ship, select coordinate of first square and orientation." + "\nCurrent ship size is " + shipSize;
    }
}
