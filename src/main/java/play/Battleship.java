package play;

import UI.Communicates;
import UI.Display;

public class Battleship {
    private Game game;

    public void showMainMenu() {
        Display.printCommunicate(Communicates.mainMenu);
    }
}
