package com.player;

public class Player implements Comparable<Player> {
    private String username;
    private int score;
    private int level;

    public Player(String username, int score, int level) {
        this.level = level;
        this.username = username;
        this.score = score;
    }

    @Override
    public int compareTo(Player other) {
        if (this.score != other.score) {
            return Integer.compare(other.score, this.score);
        } else if (this.level != other.level) {
            return Integer.compare(other.level, this.level);
        } else {
            return this.username.compareTo(other.username);
        }
    }

    @Override
    public String toString() {
        return String.format("%s Score: %d  Level: %d", username, score, level);
    }

}
