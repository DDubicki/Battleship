package UI;

import squares.Board;
import squares.Square;
import squares.SquareStatus;

public class Display extends Input {
    //░ █ ֍ ▓ ■
    private static final String emptySpaceSymbol = "░░░";
    private static final String occupiedSpaceSymbol = "███";
    private final char[] coordinateSymbols = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};

    public static void printCommunicate(String communicate) {
        System.out.println("***" + communicate + "***");
    }

    public static String getObjectSymbol(Square square) {
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

    public void printBoard(Square[][] ocean, int oceanSize) {
        printCoordinatesY();
        for (int y = 0; y < oceanSize; y++) {
            for (int x = 0; x < oceanSize; x++) {
                System.out.print(Display.getObjectSymbol(ocean[y][x]));
            }
            System.out.println(" " + Colors.RESET + (y + 1));
        }
    }

    private void printCoordinatesY() {
        for (int i = 0; i < Board.getBoardSize(); i++) {
            System.out.print(" " + coordinateSymbols[i] + " ");
        }
        System.out.println();
    }

    private void printCoordinatesX() {
    }

    public void printGameplay() {
    }

    public void printOutcome() {
    }
}
