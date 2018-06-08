package com.arman.framework.tiles;

import com.arman.framework.util.ImageLoader;

import java.awt.image.BufferedImage;

/**
 * Created by Coen on 30-3-2017.
 */
public class SpriteSheet {

    // --- Class Variables --- //

    private BufferedImage image;

    // --- Constructor --- //

    public SpriteSheet(String path) {
        image = ImageLoader.load(path);
    }

    // --- Methods --- //

    public BufferedImage getSubImage(int row, int col, int width, int height) {
        return image.getSubimage((col * width) - width, (row * height) - height, width, height);
    }

}
