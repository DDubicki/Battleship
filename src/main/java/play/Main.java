package play;

import UI.Display;
import squares.Board;
import squares.Square;

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

        for (int y = 0; y < oceanSize; y++) {
            for (int x = 0; x < oceanSize; x++) {
                System.out.print(Display.getObjectSymbol(ocean[y][x]));
            }
            System.out.println();
        }
    }
}
