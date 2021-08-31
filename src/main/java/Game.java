public class Game {
    public String switchPlayer(String actualPlayer, String firstPlayer, String secondPlayer) {
        if (actualPlayer.equals(firstPlayer)){
            return secondPlayer;
        }
        return firstPlayer;
    }

    public void makePlayerMove(char coordinateX, int coordinateY) {
    }
}
