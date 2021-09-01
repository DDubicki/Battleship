package squares;

import java.util.ArrayList;

public class Square {

    private final int coordinateX;
    private final int coordinateY;
    ArrayList<Square> squaresList;
    private SquareStatus squareStatus;

    public Square(int coordinateX, int coordinateY, SquareStatus squareStatus) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.squareStatus = squareStatus;
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public SquareStatus getSquareStatus() {
        return squareStatus;
    }

    public void setSquareStatus(SquareStatus squareStatus) {
        this.squareStatus = squareStatus;
    }

}
