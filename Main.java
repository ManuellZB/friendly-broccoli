import java.util.Scanner;

public class EcoSaverGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to EcoSaver!");
        System.out.print("Enter your name: ");
        String playerName = scanner.nextLine();

        Player player = new Player(playerName);
        PlayerDAO playerDAO = new PlayerDAO();
        playerDAO.savePlayer(player);

        System.out.println("Hello, " + player.getName() + "! Let's save the planet!");
        System.out.println("1. Play Stage");
        System.out.println("2. Exit");
        System.out.print("Choose an option: ");

        int choice = scanner.nextInt();
        if (choice == 1) {
            PlantingStage stage = new PlantingStage();
            int ecoCoins = stage.completeStage();
            player.addEcoCoins(ecoCoins);
            player.addScore(ecoCoins);
            System.out.println("Stage complete! You now have " + player.getEcoCoins() + " eco-coins.");
        } else {
            System.out.println("Goodbye!");
        }
    }
}
