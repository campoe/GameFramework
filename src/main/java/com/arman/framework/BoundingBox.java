package com.arman.framework;

import com.arman.framework.geom.Point2D;

import java.awt.*;

/**
 * Created by Coen on 4-4-2017.
 */
public class BoundingBox extends Rectangle {

    public BoundingBox(Point2D p, Point2D q) {
        this(p.getX(), p.getY(), q.getX(), q.getY());
    }

    public BoundingBox(float x, float y, float width, float height) {
        super((int) x, (int) y, (int) width, (int) height);
    }

    public boolean contains(Point2D p) {
        return p.getX() >= x && p.getX() <= (x + width) && p.getY() >= y && p.getY() <= (y + height);
    }

    public boolean intersects(BoundingBox b) {
        if (b.width <= 0 || b.height <= 0 || width <= 0 || height <= 0) {
            return false;
        }
        return ((b.width + b.x) > x) &&
                ((b.height + b.y) > y) &&
                ((width + x) > b.x) &&
                ((height + y) > b.y);
    }

    public float area() {
        return width * height;
    }

    public Point2D getCenter() {
        return new Point2D(x + width / 2, y + height / 2);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

}
