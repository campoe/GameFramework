package com.arman.framework;

import java.awt.*;

public class GameStateManager {

    private GameState state;

    public GameStateManager() {
        state = new NullState(this);
    }

    public void setState(GameState state) {
        this.state.dispose();
        this.state = state;
    }

    public void update(float elapsedTime) {
        if (state != null) {
            state.update(elapsedTime);
        }
    }

    public void draw(Graphics2D g) {
        if (state != null) {
            state.draw(g);
        } else {
            g.setColor(Color.BLACK);
            g.fillRect(0, 0, GamePanel.WIDTH, GamePanel.HEIGHT);
        }
    }

}
