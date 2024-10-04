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
                System.out.println("Questo gioco  " + newGame.getIdGame() + " e' già presente nella collezione.");
                return false;
            }
        }

        games.add(newGame);
        System.out.println("Il gioco e' aggiunto: " + newGame);
        return true;
    }


    public String toString() {
        return "Qui abbiamo la lista di tutti i giochi presenti. : " +
                games.stream()
                        .map(CollectionOfGame -> CollectionOfGame.getTitle())
                        .collect(Collectors.joining(" "));
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
                .collect(Collectors.joining(","));

        if (resultForPrice.isEmpty()) {
            return "Non ci sono giochi con un prezzo inferiore a " + price;
        } else {
            return "Qui abbiamo la lista di tutti i giochi presenti che hanno un prezzo inferiore a " + price + " : " + resultForPrice;
        }
    }
}

