package com.arman.framework.tiles;

import com.arman.framework.Animation;
import com.arman.framework.GameObject;

import java.awt.*;

/**
 * Created by Coen on 30-3-2017.
 */
public class AnimatedTile extends GameObject {

    // --- Class Variables --- //

    private Animation animation;

    // --- Constructors --- //

    public AnimatedTile(float x, float y, int width, int height, float animationDelay, Image... frames) {
        super(x, y, width, height);
        Image[] newFrames = frames;
        for (Image frame : newFrames) {
            if (frame.getHeight() < this.height) {
                setHeight(frame.getHeight());
            }
            if (frame.getWidth() < this.width) {
                setWidth(frame.getWidth());
            }
        }
        this.animation = new Animation(animationDelay, newFrames);
    }

    @Override
    public void render(Graphics2D g) {
        g.drawImage(animation.getImage().getBufferedImage(), (int) x, (int) y, width, height, null);
    }

    @Override
    public void tick(float elapsedTime) {
        animation.tick(elapsedTime);
    }

    // --- Methods --- //

}
