package antonionorfo;

public class GameOfTable extends CollectionOfGame {

    public int numberOfPlayers;
    public int averageDurationOfAGame;

    public GameOfTable(int idGame, String title, int yearOfPubblication, double price, int numberOfPlayers, int averageDurationOfAGame) {
        super(idGame, title, yearOfPubblication, price);
        this.numberOfPlayers = Math.max(2, Math.min(numberOfPlayers, 10));
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
                "} " + super.toString();
    }
}
