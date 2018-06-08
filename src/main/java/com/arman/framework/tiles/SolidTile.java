package com.arman.framework.tiles;

import com.arman.framework.GameObject;

import java.awt.*;

/**
 * Created by Coen on 30-3-2017.
 */
public class SolidTile extends GameObject {

    // --- Class Variables --- //

    private Color color;

    // --- Constructors --- //

    public SolidTile(float x, float y, int width, int height, Color color) {
        super(x, y, width, height);
        this.color = color;
    }

    // --- Methods --- //

    @Override
    public void tick(float elapsedTime) {

    }

    @Override
    public void render(Graphics2D g) {
        g.setColor(new Color(color.getRGB()));
        g.fillRect((int) getX(), (int) getY(), width, height);
    }

}
