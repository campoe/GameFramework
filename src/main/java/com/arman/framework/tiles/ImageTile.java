package com.arman.framework.tiles;

import com.arman.framework.GameObject;
import com.arman.framework.geom.Point2D;

import java.awt.*;

/**
 * Created by Coen on 30-3-2017.
 */
public class ImageTile extends GameObject {

    // --- Class Variables --- //

    private Image image;

    // --- Constructors --- //

    public ImageTile(float x, float y, int width, int height, Image image) {
        super(x, y, width, height);
        this.image = image;
        if (image.getHeight() < height || image.getWidth() < width) {
            setHeight(image.getHeight());
            setWidth(image.getWidth());
        }
    }

    public ImageTile(float x, float y, int width, int height, String path) {
        this(x, y, width, height, new Image(path));
    }

    public ImageTile(Point2D point, int width, int height, Image image) {
        this(point.getX(), point.getY(), width, height, image);
    }

    public ImageTile(Point2D point, int width, int height, String path) {
        this(point.getX(), point.getY(), width, height, path);
    }

    // --- Methods --- //

    @Override
    public void tick(float elapsedTime) {

    }

    @Override
    public void render(Graphics2D g) {
        g.drawImage(image.getBufferedImage(), (int) getX(), (int) getY(), width, height, null);
    }

    public Image getImage() {
        return image;
    }

}
