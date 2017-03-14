package pl.akademiakodu.zadanie4;

import java.util.List;

/**
 * Created by OskarPraca on 2017-03-14.
 */
public class Game {
     private String name;
     private List<Player> playerList;



    public Game(String name, List<Player> playerList) {
        this.name = name;
        this.playerList = playerList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Player> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(List<Player> playerList) {
        this.playerList = playerList;
    }

    public Player getWinner() {
        int pointsLocal = 0;
        Player playerWinner = null;
        for(Player player : playerList) {
             if(player.getPoints() > pointsLocal) {
                 pointsLocal = player.getPoints();
                 playerWinner = player;
             }
        }
        return playerWinner;
    }
}
