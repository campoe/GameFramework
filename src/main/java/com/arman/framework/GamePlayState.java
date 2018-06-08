package com.arman.framework;

import java.awt.*;

public abstract class GamePlayState extends GameState {

    private GamePlay gamePlay;

    public GamePlayState(GameStateManager gameStateManager) {
        super(gameStateManager);
    }

    @Override
    public abstract void setup();

    @Override
    public void update(float elapsedTime) {
        handleInput();
        gamePlay.update(elapsedTime);
    }

    @Override
    public void draw(Graphics2D g) {
        super.draw(g);
        gamePlay.draw(g);
    }

    @Override
    public abstract void handleInput();

}
