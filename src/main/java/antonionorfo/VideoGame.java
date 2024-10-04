package antonionorfo;

public class VideoGame {
    public String platform;
    public int DurationOfTheGame;

    public VideoGame(int durationOfTheGame, String platform) {
        DurationOfTheGame = durationOfTheGame;
        this.platform = platform;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public int getDurationOfTheGame() {
        return DurationOfTheGame;
    }

    public void setDurationOfTheGame(int durationOfTheGame) {
        DurationOfTheGame = durationOfTheGame;
    }

    @Override
    public String toString() {
        return "VideoGame{" +
                "platform='" + platform + '\'' +
                ", DurationOfTheGame=" + DurationOfTheGame +
                '}';
    }

}
