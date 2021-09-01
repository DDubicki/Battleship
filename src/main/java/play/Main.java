package play;

import UI.Display;

public class Main {
    public static void main(String[] args) {
        Battleship battleship = new Battleship();

        // Test
        Display display = new Display();
        display.printGameMenu();
        display.boardingPhase(0);
    }
}
