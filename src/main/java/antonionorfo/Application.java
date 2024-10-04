package antonionorfo;

public class Application {

    public static void main(String[] args) {

        Collezione collezione = new Collezione();

        CollectionOfGame gioco1 = new CollectionOfGame(1, "Super Mario", 1985, 50.0);
        CollectionOfGame gioco2 = new CollectionOfGame(1, "Zelda", 1986, 25.0);
        CollectionOfGame gioco3 = new CollectionOfGame(3, "Pac-Man", 1980, 15.0);
        CollectionOfGame gioco4 = new CollectionOfGame(4, "Donkey Kong", 1981, 75.0);

        collezione.addGame(gioco1);
        collezione.addGame(gioco2);
        collezione.addGame(gioco3);
        collezione.addGame(gioco4);

        
        System.out.println("Stampa dell'intera collezione:");
        System.out.println(collezione);

        System.out.println("Ricerca dei giochi con prezzo inferiore a 30.0:");
        String resultForPrice = collezione.searchGameByPrice(30.0);
        System.out.println(resultForPrice);

        System.out.println("Ricerca dei giochi con prezzo inferiore a 10.0:");
        resultForPrice = collezione.searchGameByPrice(150.0);
        System.out.println(resultForPrice);
    }
}
