package com.arman.framework;

import com.arman.framework.tiles.Image;
import com.arman.framework.util.Debug;

import java.util.Arrays;

/**
 * Created by Coen on 30-3-2017.
 */
public class Animation {

    private Image[] frames;
    private int frameIndex;
    private float animationDelay;
    private float lastIterationTime;

    public Animation(float animationDelay, Image... frames) {
        this.frames = frames;
        this.frameIndex = 0;
        this.animationDelay = animationDelay;
        this.lastIterationTime = 0;
    }

    public static void main(String[] args) {
        Image i1 = new Image("background.png");
        Image i2 = new Image("TileA2.png");
        Animation animation = new Animation(0.2f, i1);
        Debug.log("Before: " + animation.frames.length);
        animation.addFrame(i2);
        Debug.log("After: " + animation.frames.length);
    }

    public synchronized void addFrame(Image frame) {
        Image[] newFrames = new Image[frames.length + 1];
        System.arraycopy(frames, 0, newFrames, 0, frames.length);
        newFrames[newFrames.length - 1] = frame;
        frames = newFrames;
        Debug.log("Paths: " + Arrays.toString(frames));
    }

    public synchronized void tick(float elapsedTime) {
        if (frames.length > 1) {
            lastIterationTime += elapsedTime;
            if (lastIterationTime >= animationDelay) {
                lastIterationTime = 0;
                frameIndex = ++frameIndex % frames.length;
            }
        }
    }

    public synchronized Image getImage() {
        if (frames.length == 0) {
            return null;
        }
        return frames[frameIndex];
    }

}
