package squares;

import UI.Communicates;
import UI.Display;
import UI.Input;
import players.Player;
import ships.Ship;
import ships.ShipStatus;
import ships.ShipType;

public class BoardFactory {

    public static Square[][] initBoard(Board board) {
        Square[][] ocean = board.getOcean();
        int oceanSize = board.getOceanSize();
        for (int y = 0; y < oceanSize; y++) {
            for (int x = 0; x < oceanSize; x++) {
                ocean[y][x] = new Square(x, y, SquareStatus.EMPTY);
            }
        }
        return ocean;
    }
}
