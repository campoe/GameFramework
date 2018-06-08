package com.arman.framework.tiles;

import com.arman.framework.GameObject;
import com.arman.framework.geom.Point2D;

import java.awt.*;

/**
 * Created by Coen on 30-3-2017.
 */
public class OutlinedTile extends GameObject {

    // --- Class Variables --- //

    private Color color;
    private float thickness;

    // --- Constructor --- //

    public OutlinedTile(float x, float y, int width, int height, float thickness, Color color) {
        super(x, y, width, height);
        this.color = color;
        this.thickness = thickness;
    }

    public OutlinedTile(Point2D point, int width, int height, float thickness, Color color) {
        this(point.getX(), point.getY(), width, height, thickness, color);
    }

    // --- Methods --- //

    @Override
    public void tick(float elapsedTime) {

    }

    @Override
    public void render(Graphics2D g) {
        g.setColor(new Color(color.getRGB()));
        g.drawRect((int) getX(), (int) getY(), width, height);
    }

}
