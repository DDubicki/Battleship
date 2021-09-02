package play;

import UI.Display;
import squares.Board;
import squares.Square;

import static squares.SquareStatus.*;

public class Main {
    public static void main(String[] args) {

//        Battleship battleship = new Battleship();
//
//        // Test
        Display display = new Display();
//        display.printGameMenu();
//        display.boardingPhase(0);


        //Test2
        Board board = new Board();
        Square[][] ocean = board.getOcean();
        int oceanSize = board.getOceanSize();

        ocean[5][5].setSquareStatus(SHIP);
        ocean[7][7].setSquareStatus(HIT);
        ocean[2][2].setSquareStatus(SUNKEN);

        for (int y = 0; y < oceanSize; y++) {
            for (int x = 0; x < oceanSize; x++) {
                System.out.print(Display.getObjectSymbol(ocean[y][x]));
            }
            System.out.println();
        }
    }
}
