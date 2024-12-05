import java.util.Scanner;

public class EcoSaverController {
    private Player player;
    private Stage currentStage;

    public EcoSaverController(Player player) {
        this.player = player;
    }

    public void startGame() {
        currentStage = new PlantingStage();
        System.out.println("Starting Stage: " + currentStage.getStageName());
        int earnedEcoCoins = currentStage.completeStage();
        player.addEcoCoins(earnedEcoCoins);
        player.addScore(earnedEcoCoins);

        System.out.println("You earned " + earnedEcoCoins + " eco-coins!");
        System.out.println("Total Score: " + player.getScore());
        System.out.println("Total Eco-Coins: " + player.getEcoCoins());
    }
}
n