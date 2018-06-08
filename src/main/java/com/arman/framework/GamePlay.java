package com.arman.framework;

import java.awt.*;

public abstract class GamePlay {

    protected int timePassed;

    public GamePlay() {

    }

    public void update(float elapsedTime) {
        this.timePassed += elapsedTime;
    }

    public abstract void draw(Graphics2D g);

}
