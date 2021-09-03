package play;

import UI.Display;
import players.Player;
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

        display.printBoard(ocean, oceanSize);
        //Test3
        Player player = new Player("name");
        player.choosePlacementMethod();
        display.printBoard(player.getPlayerBoard().getOcean(), Board.getBoardSize());

    }
}
