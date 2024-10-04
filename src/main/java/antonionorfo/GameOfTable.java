package antonionorfo;

public class GameOfTable {

    public int numberOfPlayers;
    public int averageDurationOfAGame;

    public GameOfTable(int numberOfPlayers, int averageDurationOfAGame) {
        this.numberOfPlayers = numberOfPlayers;
        this.averageDurationOfAGame = averageDurationOfAGame;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public int getAverageDurationOfAGame() {
        return averageDurationOfAGame;
    }

    public void setAverageDurationOfAGame(int averageDurationOfAGame) {
        this.averageDurationOfAGame = averageDurationOfAGame;
    }


    @Override
    public String toString() {
        return "GameOfTable{" +
                "numberOfPlayers=" + numberOfPlayers +
                ", averageDurationOfAGame=" + averageDurationOfAGame +
                '}';
    }
}
