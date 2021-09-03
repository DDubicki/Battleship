package squares;

public class Square {

    private final int coordinateX;
    private final int coordinateY;
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
