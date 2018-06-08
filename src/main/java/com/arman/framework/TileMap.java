package com.arman.framework;

import java.awt.*;

public class TileMap {

    private Tile[][] tiles;

    public TileMap(int rows, int cols) {
        this.tiles = new Tile[rows][cols];
    }

    public void setTile(Tile tile, int row, int col) {
        tiles[row][col] = tile;
    }

    public Tile getTile(int row, int col) {
        return tiles[row][col];
    }

    public void draw(Graphics2D g) {
        for (int i = 0; i < tiles.length; i++) {
            for (int j = 0; j < tiles[i].length; j++) {
                g.setColor(tiles[i][j].getColor());
                g.fillRect(j * Tile.SIZE, i * Tile.SIZE, Tile.SIZE, Tile.SIZE);
            }
        }
    }

    public int rows() {
        return tiles.length;
    }

    public int cols() {
        return tiles[0].length;
    }

    public enum Tile {

        FOOD(Color.RED), WALL(Color.GRAY), SNAKE_HEAD(Color.ORANGE), SNAKE_BODY(Color.GREEN), EMPTY(Color.BLACK);

        public static final int SIZE = 20;

        private Color color;

        Tile(Color color) {
            this.color = color;
        }

        public Color getColor() {
            return color;
        }

        public boolean isEmpty() {
            return this == EMPTY;
        }

    }

}
