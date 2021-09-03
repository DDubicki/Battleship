package UI;

import squares.Board;

public class Util {

    protected static int checkIfCharAtListOfStrings(char character) {
        char[] chars = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'K'};
        String stringCharacter = String.valueOf(character);
        for (int i = 0; i < Board.getBoardSize(); i++){
            if (character == chars[i]){
                return i;
            }
        }
//        for (String element : chars) {
//            if (stringCharacter.equals(element)) {
//                return character;
//            }
//        }
        return -1;
    }

    protected static int checkIfNumberInRange(int coordinateY) {
        if (coordinateY >= 0 && coordinateY <= 10) {
            return coordinateY;
        }
        return 0;
    }
}
