package players;

import UI.Communicates;
import UI.Display;
import UI.Input;

public class HumanPlayer extends Player {

    private final String name;

    public HumanPlayer(String name) {
        super(name);
        Display.printCommunicate(Communicates.askPlayerName);
        this.name = Input.getPlayerName();
    }

    @Override
    public void takeShoot() {
        super.takeShoot();
    }
}
