package UI;

import java.util.Locale;
import java.util.Scanner;

public class Input {
    private String firstPlayer;
    private String secondPlayer;
    private Input input;
    private static final Scanner scanner = new Scanner(System.in);

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

    public static String getPlayerName() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().trim();
    }

    public static int getCoordinateX() {
        Scanner scanner = new Scanner(System.in);
        char coordinateX = scanner.next().toUpperCase(Locale.ROOT).charAt(0);
        return Util.checkIfCharAtListOfStrings(coordinateX);
    }

    public static int getCoordinateY() {
        Scanner scanner = new Scanner(System.in);
        int coordinateY = scanner.nextInt();
        return Util.checkIfNumberInRange(coordinateY);
    }

    public static int getAnswer(int minValue, int maxValue) {
        String userInput = scanner.next();
        if (Integer.parseInt(userInput) >= minValue && Integer.parseInt(userInput) <= maxValue) {
            return Integer.parseInt(userInput);
        } else {
            Display.printCommunicate(Communicates.wrongValue);
            getAnswer(minValue, maxValue);
        }
        return Integer.parseInt(userInput);
    }
}
