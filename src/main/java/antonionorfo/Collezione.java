package antonionorfo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Collezione {

    private List<CollectionOfGame> games;

    public Collezione() {
        this.games = new ArrayList<>();
    }

    public boolean addGame(CollectionOfGame newGame) {
        for (CollectionOfGame g : games) {
            if (g.getIdGame() == newGame.getIdGame()) {
                System.out.println("\nIl gioco " + newGame.getTitle() + " è già presente nella collezione.");
                return false;
            }
        }
        games.add(newGame);
        System.out.println("\nAbbiamo aggiunto questo gioco: " + newGame);
        return true;
    }

    public String toString() {
        return "Qui abbiamo la lista di tutti i giochi presenti: " +
                games.stream()
                        .map(CollectionOfGame::getTitle)
                        .collect(Collectors.joining(", "));
    }

    public CollectionOfGame searchGameById(int idGame) {
        for (CollectionOfGame game : games) {
            if (game.getIdGame() == idGame) {
                return game;
            }
        }
        System.out.println("Questo gioco " + idGame + " non è presente nella collezione.");
        return null;
    }

    public String searchGameByPrice(double price) {
        String resultForPrice = games.stream()
                .filter(game -> game.getPrice() < price)
                .map(CollectionOfGame::getTitle)
                .collect(Collectors.joining(", "));

        if (resultForPrice.isEmpty()) {
            return "Non ci sono giochi con un prezzo inferiore a " + price;
        } else {
            return "Giochi con prezzo inferiore a " + price + ": " + resultForPrice;
        }
    }
    // cerco i giochi da tavolo in base al numero di giocatori

    public String searchGameOfTableByNumberOfPlayers(int numberOfPlayers) {
        String resultForPlayers = games.stream()
                .filter(game -> game instanceof GameOfTable) //controllo se è un gioco da tavolo , perche abbiamo anche videoGame. uso instanceof per comparare le classi
                .map(game -> (GameOfTable) game)
                .filter(game -> game.getNumberOfPlayers() == numberOfPlayers)
                .map(GameOfTable -> GameOfTable.getTitle())
                .collect(Collectors.joining(","));

        if (resultForPlayers.isEmpty()) {
            return "Non ci sono giochi da tavolo con " + numberOfPlayers + " giocatori.";
        } else {
            return "Giochi da tavolo per " + numberOfPlayers + " giocatori: " + resultForPlayers;
        }
    }

}
