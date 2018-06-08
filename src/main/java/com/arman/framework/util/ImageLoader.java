package com.arman.framework.util;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by Coen on 30-3-2017.
 */
public class ImageLoader {

    // --- Methods --- //

    private BufferedImage read(String path) {
        BufferedImage image = null;
        try {
            image = ImageIO.read(new FileInputStream("src/main/resources/" + path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return image;
    }

    // --- Static Methods --- //

    public static BufferedImage load(String path) {
        return new ImageLoader().read(path);
    }

}
