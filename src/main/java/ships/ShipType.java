package ships;

public enum ShipType {
    DESTROYER(1), SUBMARINE(2), BATTLESHIP(3), CRUISER(4), CARRIER(5);

    private final int shipSize;

    ShipType(int shipSize) {
        this.shipSize = shipSize;
    }

    protected int getShipSize() {
        return shipSize;
    }
}
