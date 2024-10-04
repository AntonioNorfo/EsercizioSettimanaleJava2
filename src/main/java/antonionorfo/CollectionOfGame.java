package antonionorfo;

public class CollectionOfGame {
    public String title;
    public int yearOfPubblication;
    public double price;
    private int idGame;

    public CollectionOfGame(int idGame, String title, int yearOfPubblication, double price) {
        this.idGame = idGame;
        this.title = title;
        this.yearOfPubblication = yearOfPubblication;
        this.price = Math.min(price, 70);
    }

    public int getIdGame() {
        return idGame;
    }

    public void setIdGame(int idGame) {
        this.idGame = idGame;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYearOfPubblication() {
        return yearOfPubblication;
    }

    public void setYearOfPubblication(int yearOfPubblication) {
        this.yearOfPubblication = yearOfPubblication;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "CollectionOfGame{" +
                "idGame=" + idGame +
                ", title='" + title + '\'' +
                ", yearOfPubblication=" + yearOfPubblication +
                ", price=" + price +
                '}';
    }
}
