package com.arman.framework.util;

/**
 * Created by Coen on 2-4-2017.
 */
public class Quaternion {

    private final float a, b, c, d;

    public Quaternion(float a, float b, float c, float d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Quaternion(float r) {
        this(r, 0, 0, 0);
    }

    public float norm() {
        return (float) Math.sqrt(a * a + b * b + c * c + d * d);
    }

    public Quaternion negative() {
        return new Quaternion(-a, -b, -c, -d);
    }

    public Quaternion conjugate() {
        return new Quaternion(a, -b, -c, -d);
    }

    public Quaternion add(float r) {
        return new Quaternion(a + r, b, c, d);
    }

    public static Quaternion add(Quaternion q, float r) {
        return q.add(r);
    }

    public static Quaternion add(float r, Quaternion q) {
        return q.add(r);
    }

    public Quaternion add(Quaternion q) {
        return new Quaternion(a + q.a, b + q.b, c + q.c, d + q.d);
    }

    public static Quaternion add(Quaternion q, Quaternion p) {
        return q.add(p);
    }

    public Quaternion times(float r) {
        return new Quaternion(a * r, b * r, c * r, d * r);
    }

    public static Quaternion times(Quaternion q, float r) {
        return q.times(r);
    }

    public static Quaternion times(float r, Quaternion q) {
        return q.times(r);
    }

    public Quaternion times(Quaternion q) {
        return new Quaternion(
                a * q.a - b * q.b - c * q.c - d * q.d,
                a * q.b + b * q.a + c * q.d - d * q.c,
                a * q.c - b * q.d + c * q.a + d * q.b,
                a * q.d + b * q.c - c * q.b + d * q.a);
    }

    public static Quaternion times(Quaternion q, Quaternion p) {
        return q.times(p);
    }

    public boolean equals(Object object) {
        if (!(object instanceof Quaternion)) {
            return false;
        }
        final Quaternion q = (Quaternion) object;
        if (Float.floatToIntBits(a) != Float.floatToIntBits(q.a)
                || Float.floatToIntBits(b) != Float.floatToIntBits(q.b)
                || Float.floatToIntBits(c) != Float.floatToIntBits(q.c)
                || Float.floatToIntBits(d) != Float.floatToIntBits(q.d)) {
            return false;
        }
        return true;
    }

    public String toString() {
        return String.format("%.2f + %.2fi + %.2fj + %.2fk", a, b, c, d).replaceAll("\\+ -", "- ");
    }

    public String toQuadruple() {
        return String.format("(%.2f, %.2f, %.2f, %.2f)", a, b, c, d);
    }

}
