package com.arman.framework;

import com.arman.framework.geom.Point2D;

import java.awt.*;

/**
 * Created by Coen on 30-3-2017.
 */
public abstract class GameObject implements Renderable, Tickable, Scalable {

    // --- Class Variables --- //

    protected int width, height;
    protected float x, y;

    // --- Constructors --- //

    public GameObject(float x, float y, int width, int height) {
        this(new Point2D(x, y), width, height);
    }

    public GameObject(Point2D point, int width, int height) {
        this.x = point.getX();
        this.y = point.getY();
        this.width = width;
        this.height = height;
    }

    // --- Abstract Methods --- //

    public abstract void render(Graphics2D g);

    public abstract void tick(float elapsedTime);

    // --- Methods --- //

    public BoundingBox getBounds() {
        return new BoundingBox(x, y, getWidth(), getHeight());
    }

    public void scale(float factor) {
        width *= factor;
        height *= factor;
    }

    public void scale(float widthFactor, float heightFactor) {
        width *= widthFactor;
        height *= heightFactor;
    }

    // --- Getters --- //

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Point2D getPoint() {
        return new Point2D(x, y);
    }

    public void setPoint(Point2D point) {
        this.x = point.getX();
        this.y = point.getY();
    }

    public int getWidth() {
        return width;
    }

    // --- Setters --- //

    public void setWidth(int width) {
        this.width = width;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

}
