package com.example.gameserver;

import java.util.Random;

public class Game {
    Random random = new Random();
    private User user;
    private int randomNumber;

    public Game() {
        initialize();
    }
    public void initialize() {
        randomNumber = random.nextInt(1, 10);
        user = new uniqueUser();
    }
}
