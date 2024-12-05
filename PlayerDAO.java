import java.util.HashMap;
import java.util.Map;

public class PlayerDAO {
    private static final Map<String, Player> players = new HashMap<>();

    public void savePlayer(Player player) {
        players.put(player.getName(), player);
    }

    public Player loadPlayer(String name) {
        return players.getOrDefault(name, null);
    }
}
