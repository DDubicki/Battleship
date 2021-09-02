package squares;

public class Board {
    private final int boardSize = 10;
    Square[][] ocean = new Square[boardSize][boardSize];

    public Board() {
        ocean = BoardFactory.initBoard(this);
    }

    public int getOceanSize() {
        return boardSize;
    }

    public Square[][] getOcean() {
        return ocean;
    }

    public boolean isPlacementOk() {
        return false;
    }
}
