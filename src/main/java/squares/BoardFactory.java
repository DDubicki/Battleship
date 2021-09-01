package squares;

import UI.Communicates;
import UI.Display;
import UI.Input;

public class BoardFactory {

    protected static Square[][] initBoard(Board board) {
        Square[][] ocean = board.getOcean();
        int oceanSize = board.getOceanSize();
        for (int y = 0; y < oceanSize; y++) {
            for (int x = 0; x < oceanSize; x++) {
                ocean[y][x] = new Square(x, y, SquareStatus.EMPTY);
            }
        }
        return ocean;
    }

    public void choosePlacementMethod(Board playerBoard) {
        Display.printCommunicate(Communicates.askPlacementMethod);
        int placementMethodCode = Input.getAnswer(1, 2);
        if (placementMethodCode == 0) {
            playerPlacement(playerBoard);
        } else {
            randomPlacement(playerBoard);
        }
    }

    protected Board playerPlacement(Board playerBoard) {
        return null;
    }

    protected Board randomPlacement(Board playerBoard) {
        return null;
    }
}
