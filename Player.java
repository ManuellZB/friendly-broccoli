import java.io.Serializable;

public class Player implements Serializable {
    private String name;
    private int score;
    private int ecoCoins;

    public Player(String name) {
        this.name = name;
        this.score = 0;
        this.ecoCoins = 0;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void addScore(int points) {
        this.score += points;
    }

    public int getEcoCoins() {
        return ecoCoins;
    }

    public void addEcoCoins(int coins) {
        this.ecoCoins += coins;
    }

    public void deductEcoCoins(int coins) {
        this.ecoCoins -= coins;
    }
}
