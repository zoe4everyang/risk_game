package edu.duke.ece651.risk_game.server;

import java.util.List;

public interface WorldMap {
    public int getNumTerritories();
    public Boolean isConnected(int id1, int id2, int playerId);
    public Boolean isNeighbour(int id1, int id2);
    public List<Integer> getLosers();
    public int getWinner();
    public Boolean checkEnd();
    public List<Territory> getTerritories();
    public void setUnits(List<Integer> palcement);
    public void makeAttack(int playerId, int from, int to, int num);
    public void makeMove(int playerId, int from, int to, int num);
}