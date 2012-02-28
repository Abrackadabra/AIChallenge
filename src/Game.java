import java.util.*;

//2/27/12 5:06 PM
//by Abrackadabra

public class Game {
    Map map;
    ArrayList<Player> players = new ArrayList<Player>();

    Game(String map, String[] players, String[] names) throws MyException {
        this.map = new Map(map);
        for (int i = 0; i < players.length; i++) {
            Player player;
            try {
                player = new Player(players[i], names[i]);
            } catch (MyException e) {
                player = null;
            }
            if (player != null)
                this.players.add(player);
        }
        for (Player player : this.players)
            player.feedMap(this.map);
    }
}