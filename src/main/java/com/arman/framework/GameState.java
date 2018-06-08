package com.arman.framework;

import java.awt.*;

public abstract class GameState {

    protected GameStateManager gameStateManager;

    public GameState(GameStateManager gameStateManager) {
        this.gameStateManager = gameStateManager;
        setup();
    }

    public abstract void setup();

    public abstract void dispose();

    public abstract void update(float elapsedTime);

    public void draw(Graphics2D g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, GamePanel.WIDTH, GamePanel.HEIGHT);
    }

    public abstract void handleInput();

}
