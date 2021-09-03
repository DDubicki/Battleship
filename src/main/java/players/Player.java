package players;

import UI.Communicates;
import UI.Display;
import UI.Input;
import ships.Ship;
import ships.ShipType;
import squares.Board;
import squares.BoardFactory;
import squares.Square;
import squares.SquareStatus;

import java.util.List;

public class Player {
    private String name;
    private List<Ship> playerShips;
    private Board playerBoard = new Board();

    public Player(String name) {
        this.name = name;
    }

    public Player(List<Ship> playerShips) {
        this.playerShips = playerShips;
    }

    public void takeShoot() {
    }

    public boolean isAlive() {
        return false;
    }

    public void choosePlacementMethod() {
        Display.printCommunicate(Communicates.askPlacementMethod);
        int placementMethodCode = Input.getAnswer(1, 2);
        if (placementMethodCode == 0) {
            playerPlacement(playerBoard);
        } else {
            randomPlacement(playerBoard);
        }
    }

    protected void playerPlacement(Board playerBoard) {
        Display.printCommunicate("insert ship phase");
        Ship destroyer = new Ship(ShipType.DESTROYER);
//        Ship submarine = new Ship(ShipType.SUBMARINE);

        Display.printCommunicate("select column");
        int coordinateX = Input.getCoordinateX();
        Display.printCommunicate("select row");
        int coordinateY = Input.getCoordinateY();
        Square[][] playerOcean = playerBoard.getOcean();
        playerOcean[coordinateY][coordinateX] = new Square(coordinateX, coordinateY, SquareStatus.SHIP);

    }

    protected void randomPlacement(Board playerBoard) {
    }

    public List<Ship> getPlayerShips() {
        return playerShips;
    }

    public void setPlayerShips(List<Ship> playerShips) {
        this.playerShips = playerShips;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Board getPlayerBoard() {
        return playerBoard;
    }

    public void setPlayerBoard(Board playerBoard) {
        this.playerBoard = playerBoard;
    }
}
