import java.util.Scanner;

public class EcoSaverGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to EcoSaver!");
        System.out.print("Enter your name: ");
        String playerName = scanner.nextLine();

        Player player = new Player(playerName);
        EcoSaverController controller = new EcoSaverController(player);

        controller.startGame();
    }
}
