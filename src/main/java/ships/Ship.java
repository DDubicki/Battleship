package ships;

import squares.Square;
import squares.SquareStatus;

import java.util.ArrayList;

import static ships.ShipOrientation.VERTICAL;

public class Ship {
    private final ArrayList<Square> shipFields;
    private final ShipType shipType;
    private int shipFirstSquareCoordinateX;
    private int shipFirstSquareCoordinateY;
    private ShipStatus shipStatus;
    private ShipOrientation shipOrientation;

    public Ship(ArrayList<Square> shipFields, ShipType shipType) {
        this.shipFields = shipFields;
        this.shipType = shipType;
        this.shipStatus = ShipStatus.FULL;
    }

    public ArrayList<Square> getShipFields() {
        return shipFields;
    }

    public ShipType getShipType() {
        return shipType;
    }

    public ShipOrientation getShipOrientation() {
        return shipOrientation;
    }

    public void setShipOrientation(ShipOrientation shipOrientation) {
        this.shipOrientation = shipOrientation;
    }

    public void setShipStatus(ShipStatus shipStatus) {
        this.shipStatus = shipStatus;
    }

    public void placeShip() {
        for (int i = 0; i < this.shipType.getShipSize(); i++) {
            if (this.shipOrientation == VERTICAL) {
                new Square(this.shipFirstSquareCoordinateX, this.shipFirstSquareCoordinateY + 1, SquareStatus.SHIP);
            } else {
                new Square(this.shipFirstSquareCoordinateX + 1, this.shipFirstSquareCoordinateY, SquareStatus.SHIP);
            }
        }
    }

}
