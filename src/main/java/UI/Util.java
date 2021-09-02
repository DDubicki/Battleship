package UI;

public class Util {

    protected static char checkIfCharAtListOfStrings(char character) {
        String[] chars = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "K"};
        String stringCharacter = String.valueOf(character);
        for (String element : chars) {
            if (stringCharacter.equals(element)) {
                return character;
            }
        }
        return 0;
    }

    protected static int checkIfNumberInRange(int coordinateY) {
        if (coordinateY >= 0 && coordinateY <= 10) {
            return coordinateY;
        }
        return 0;
    }
}
