package UI;

import squares.Board;
import squares.Square;
import squares.SquareStatus;

public class Display extends Input {
    //░ █ ֍ ▓ ■
    private final String emptySpaceSymbol = "░░░";
    private final String occupiedSpaceSymbol = "░█░";

    public static void printCommunicate(String communicate) {
        System.out.println("***" + communicate + "***");
    }

    public void printGameMenu() {
        System.out.println(Colors.PURPLE + " * * * ");
        System.out.println("Tu-Tu-Tu-Tu. Welcome in Battleships!!!");
        System.out.println(Colors.PURPLE + " * * * ");
        System.out.println("Please provide a first player name: ");
        setFirstPlayer(getPlayerName());
        System.out.println("Please provide a second player name: ");
        setSecondPlayer(getPlayerName());
    }

    public void boardingPhase(int turnCounter) {
        if (turnCounter % 2 == 0) {
            System.out.println(getFirstPlayer() + ", your turn to place ships");
        } else {
            System.out.println(getSecondPlayer() + ", your turn to place ships");
        }
    }

    public void gamePhase() {
    }

    public void printBoard(Board board) {
    }

    public void printGameplay() {
    }

    public void printOutcome() {
    }

    public String getObjectSymbol(Square square) {
        SquareStatus status = square.getSquareStatus();

        if (status == SquareStatus.EMPTY) {
            return Colors.OCEAN + emptySpaceSymbol;
        } else if (status == SquareStatus.SHIP) {
            return Colors.WHITE + occupiedSpaceSymbol;
        } else if (status == SquareStatus.HIT) {
            return Colors.RED + occupiedSpaceSymbol;
        } else if (status == SquareStatus.MISSED) {
            return Colors.YELLOW + occupiedSpaceSymbol;
        } else if (status == SquareStatus.SUNKEN) {
            return Colors.BLUE + occupiedSpaceSymbol;
        } else {
            return emptySpaceSymbol;
        }
    }
}
