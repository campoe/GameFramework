package com.arman.framework.geom;

/**
 * Created by Coen on 31-3-2017.
 */
public class Point2D {

    // --- Constants --- //

    public static final Point2D ORIGIN = new Point2D(0, 0);

    // --- Class Variables --- //

    private float x;
    private float y;

    // --- Constructors --- //

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // --- Methods --- //

    public float distance(Point2D p) {
        float dx = x - p.x;
        float dy = y - p.y;
        return (float) Math.sqrt(dx * dx + dy * dy);
    }

    // --- Getters --- //

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    // --- Setters --- //

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

}
