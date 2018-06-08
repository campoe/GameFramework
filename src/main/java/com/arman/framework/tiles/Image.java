package com.arman.framework.tiles;

import com.arman.framework.Scalable;
import com.arman.framework.util.ImageLoader;

import java.awt.image.BufferedImage;

/**
 * Created by Coen on 30-3-2017.
 */
public class Image implements Scalable {

    // --- Class Variables --- //

    protected String path;
    protected int width, height;
    protected BufferedImage image;

    // --- Constructors --- //

    public Image(String path) {
        this(ImageLoader.load(path));
        this.path = path;
    }

    private Image(BufferedImage image) {
        this.image = image;
        width = image.getWidth();
        height = image.getHeight();
        this.image.flush();
    }

    // --- Methods --- //

    public void scale(float factor) {
        width *= factor;
        height *= factor;
    }

    public void scale(float widthFactor, float heightFactor) {
        width *= widthFactor;
        height *= heightFactor;
    }

    public String toString() {
        return path;
    }

    // --- Getters --- //

    public int getHeight() {
        return height;
    }

    public BufferedImage getBufferedImage() {
        return image;
    }

    public int getWidth() {
        return width;
    }

    public String getPath() {
        return path;
    }

}
