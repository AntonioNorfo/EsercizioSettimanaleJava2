package antonionorfo;

public class Application {

    public static void main(String[] args) {
        Collezione collezione = new Collezione();

        CollectionOfGame gioco1 = new GameOfTable(1, "Risiko", 1935, 35.0, 4, 120);
        CollectionOfGame gioco2 = new CollectionOfGame(4, "Tomb Raider", 1980, 15.0);
        CollectionOfGame gioco3 = new GameOfTable(3, "Dungeons and Dragons", 1995, 40.0, 4, 90);
        CollectionOfGame gioco4 = new CollectionOfGame(5, "Spiderman", 1960, 68.0);
        CollectionOfGame gioco5 = new CollectionOfGame(5, "Spyro", 1480, 91.0); // fatto volutamente per testing
        CollectionOfGame gioco6 = new CollectionOfGame(6, "Dragon ball bodokai tenkaichi", 1990, 20.0);

        collezione.addGame(gioco1);
        collezione.addGame(gioco2);
        collezione.addGame(gioco3);
        collezione.addGame(gioco4);
        collezione.addGame(gioco5);
        collezione.addGame(gioco6);

        CollectionOfGame gameById = collezione.searchGameById(3);
        if (gameById != null) {
            System.out.println("\nIl gioco posizionato nell'id 3 è: " + gameById.getTitle());
        }

        String resultForPrice = collezione.searchGameByPrice(30.0);
        System.out.println("\n" + resultForPrice);


        String resultForPlayers = collezione.searchGameOfTableByNumberOfPlayers(4);
        System.out.println("\n" + resultForPlayers);
    }
}
