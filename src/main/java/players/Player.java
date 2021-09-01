package players;

import ships.Ship;

import java.util.List;

public class Player {
    private List<Ship> playerShips;

    public Player() {
    }

    public Player(List<Ship> playerShips) {
        this.playerShips = playerShips;
    }

    public void takeShoot() {
    }

    public boolean isAlive() {
        return false;
    }
}
