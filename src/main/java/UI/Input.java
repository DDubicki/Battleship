package UI;

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
        return 0;
    }

    public int getCoordinateY() {
        return 0;
    }
}
