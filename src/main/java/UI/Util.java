package UI;

public class Util {

    protected static boolean checkCharAtListOfStrings(char character){
        String [] chars = new String[] {"A", "B", "C", "D", "E", "F", "G", "H", "I", "K"};
        String stringCharacter = String.valueOf(character);
        for (String element : chars) {
            if (stringCharacter.equals(element)) {
                return true;
            }
        }
        return false;
    }
}
