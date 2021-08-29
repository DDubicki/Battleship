package UI;

import Squares.Board;

public class Display extends Input{
    public void printGameMenu() {
        System.out.println(Colors.PURPLE + " * * * ");
        System.out.println("Tu-Tu-Tu-Tu. Welcome in Battleships!!!");
        System.out.println(Colors.PURPLE + " * * * ");
        System.out.println("Please provide a first player name: ");
        setFirstPlayer(getPlayerName());
        System.out.println("Please provide a second player name: ");
        setSecondPlayer(getPlayerName());
    }

    public void boardingPhase(int turnCounter){
        if (turnCounter % 2 == 0){
            System.out.println(getFirstPlayer() + ", your turn to place ships");
        } else {
            System.out.println(getSecondPlayer() + ", your turn to place ships");
        }
    }

    public void gamePhase(){

    }

    public void printBoard(Board board) {
    }

    public void printGameplay() {
    }

    public void printOutcome() {
    }
}
