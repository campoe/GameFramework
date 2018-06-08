package com.arman.framework.geom;

import java.awt.*;

/**
 * Created by Coen on 5-5-2017.
 */
public class Line2D {

    private float x1, x2, y1, y2;
    private int rgb;

    public Line2D(float x1, float y1, float x2, float y2, int rgb) {
        if (x2 >= x1) {
            this.x1 = x1;
            this.x2 = x2;
        } else {
            this.x1 = x2;
            this.x2 = x1;
        }
        if (y2 >= y1) {
            this.y1 = y1;
            this.y2 = y2;
        } else {
            this.y1 = y2;
            this.y2 = y1;
        }
        this.rgb = rgb;
    }

    public Line2D(float x1, float y1, float x2, float y2, Color color) {
        this(x1, y1, x2, y2, color.getRGB());
    }

    public float getAngle() {
        float angle = (float) Math.toDegrees(Math.atan2(y2 - y1, x2 - x1));
        if (angle < 0) {
            angle += 360;
        }
        return angle;
    }

    public float getX1() {
        return x1;
    }

    public float getX2() {
        return x2;
    }

    public float getY1() {
        return y1;
    }

    public float getY2() {
        return y2;
    }

    public float getWidth() {
        return x2 - x1;
    }

    public float getHeight() {
        return y2 - y1;
    }

}
