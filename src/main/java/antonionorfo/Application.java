package antonionorfo;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Collezione collezione = new Collezione();
        Scanner scanner = new Scanner(System.in);
        int choice;

        CollectionOfGame gioco1 = new GameOfTable(1, "Risiko", 1935, 35.0, 4, 120);
        CollectionOfGame gioco2 = new CollectionOfGame(4, "Tomb Raider", 1980, 15.0);
        CollectionOfGame gioco3 = new GameOfTable(3, "Dungeons and Dragons", 1995, 40.0, 4, 90);
        CollectionOfGame gioco4 = new CollectionOfGame(5, "Spiderman", 1960, 68.0);
        CollectionOfGame gioco5 = new CollectionOfGame(5, "Spyro", 1480, 91.0); // fatto volutamente per testing
        CollectionOfGame gioco6 = new CollectionOfGame(6, "Dragon Ball Budokai Tenkaichi", 1990, 20.0);

        collezione.addGame(gioco1);
        collezione.addGame(gioco2);
        collezione.addGame(gioco3);
        collezione.addGame(gioco4);
        collezione.addGame(gioco5);
        collezione.addGame(gioco6);

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Aggiungi gioco");
            System.out.println("2. Cerca gioco per ID");
            System.out.println("3. Cerca gioco per prezzo");
            System.out.println("4. Cerca gioco da tavolo per numero di giocatori");
            System.out.println("5. Rimuovi gioco");
            System.out.println("6. Mostra tutti i giochi");
            System.out.println("0. Esci");
            System.out.print("Scegli un'opzione: ");

            choice = scanner.nextInt(); //scelta.

            switch (choice) {
                case 1:
                    System.out.print("Inserisci un id del gioco: ");
                    int idGame = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Inserisci il titolo del gioco: ");
                    String title = scanner.nextLine();

                    System.out.print("Inserisci l'anno di pubblicazione del gioco: ");
                    int yearOfPubblication = scanner.nextInt();

                    System.out.print("Inserisci il prezzo del gioco: ");
                    double price = scanner.nextDouble();

                    System.out.print("Inserisci numero di giocatori per quanto riguarda i giochi da tavolo: ");
                    int numberOfPlayers = scanner.nextInt();

                    System.out.print("Inserisci durata media di una partita per quanto riguarda i giochi da tavolo: ");
                    int averageDurationOfAGame = scanner.nextInt();

                    CollectionOfGame newGame = new GameOfTable(idGame, title, yearOfPubblication, price, numberOfPlayers, averageDurationOfAGame);
                    collezione.addGame(newGame);
                    break;
                case 2:
                    System.out.print("Inserisci l'id del gioco da cercare: ");
                    int searchId = scanner.nextInt();
                    CollectionOfGame game = collezione.searchGameById(searchId);
                    if (game != null) {
                        System.out.println("Ho trovato il gioco: " + game);
                    } else {
                        System.out.println("Nessun gioco trovato con ID: " + searchId);
                    }
                    break;
                case 3:
                    System.out.print("Inserisci prezzo massimo per il gioco: ");
                    double searchPrice = scanner.nextDouble();
                    System.out.println(collezione.searchGameByPrice(searchPrice));
                    break;
                case 4:
                    System.out.print("Inserisci numero di giocatori: ");
                    int searchPlayers = scanner.nextInt();
                    System.out.println(collezione.searchGameOfTableByNumberOfPlayers(searchPlayers));
                    break;
                case 5:
                    System.out.print("Inserisci l'id del gioco da rimuovere: ");
                    int removeId = scanner.nextInt();
                    collezione.removeGame(removeId);
                    break;
                case 6:
                    System.out.println(collezione);
                    break;
                case 0:
                    System.out.println("Esci.");
                    break;
                default:
                    System.out.println("Qualsiasi altro numero messo in input non sarà considerato valido.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
