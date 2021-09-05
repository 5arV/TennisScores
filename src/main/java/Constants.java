import java.util.HashMap;
import java.util.Map;

public class Constants {
    public static Map<Integer, String> pointsMap = new HashMap<>();
    static {
        pointsMap.put(0, "love");
        pointsMap.put(1, "15");
        pointsMap.put(2, "30");
        pointsMap.put(3, "40");
    }
    public static String DEUCE = "deuce";
    public static String ALL = "all";
    public static String ADVANTAGE = "advantage";
    public static String PLAYER1NAME = "player 1";
    public static String PLAYER2NAME = "player 2";
}
