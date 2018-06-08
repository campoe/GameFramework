package com.arman.framework.util;

/**
 * Created by Coen on 5-5-2017.
 */
public class Math {

    public static double PI = 3.14159265358979323846;

    public static double toRadians(double angleDegrees) {
        return (angleDegrees * PI) / 180;
    }

    public static float toRadians(float angleDegrees) {
        return (float) ((angleDegrees * PI) / 180);
    }

    public static int toRadians(int angleDegrees) {
        return (int) ((angleDegrees * PI) / 180);
    }

    public static double toDegrees(double angleRadians) {
        return (angleRadians * 180) / PI;
    }

    public static float toDegrees(float angleRadians) {
        return (float) ((angleRadians * 180) / PI);
    }

    public static int toDegrees(int angleRadians) {
        return (int) ((angleRadians * 180) / PI);
    }

    public static double atan2(float y, float x) {
        return StrictMath.atan2(y, x);
    }

    public static double cos(double angle) {
        return StrictMath.cos(angle);
    }

    public static double sin(double angle) {
        return StrictMath.sin(angle);
    }

    public static double sqrt(double value) {
        return StrictMath.sqrt(value);
    }

}
