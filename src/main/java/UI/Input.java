package UI;

import java.util.Locale;
import java.util.Scanner;

public class Input {
    private String firstPlayer;
    private String secondPlayer;
    private Input input;

    public String getFirstPlayer() {
        return firstPlayer;
    }
    public String getSecondPlayer() {
        return secondPlayer;
    }

    public void setFirstPlayer(String firstPlayer) {
        this.firstPlayer = firstPlayer;
    }
    public void setSecondPlayer(String secondPlayer) {
        this.secondPlayer = secondPlayer;
    }

    public String getPlayerName() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine().trim();
        return name;
    }

    public char getCoordinateX() {
        Scanner scanner = new Scanner(System.in);
        char coordinateX = scanner.next().toUpperCase(Locale.ROOT).charAt(0);
        boolean isValid = Util.checkCharAtListOfStrings(coordinateX);
        if (isValid){
            return coordinateX;
        }
        return 0;
    }

    public int getCoordinateY() {
        return 0;
    }
}
