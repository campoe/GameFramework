package com.arman.framework.tiles;

/**
 * Created by Coen on 1-4-2017.
 */
public class Texture extends Image {

    private SpriteSheet sheet;

    public Texture(int row, int col, int width, int height, String path) {
        super(path);
        sheet = new SpriteSheet(path);
        image = sheet.getSubImage(row, col, width, height);
    }

}
