package com.arman.framework;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    public static final int WIDTH = 800;
    public static final int HEIGHT = 600;

    private GameStateManager gameStateManager;

    public GamePanel() {
        GraphicsThread graphicsThread = new GraphicsThread(this);
        this.gameStateManager = new GameStateManager();
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        InputHandler.setComponent(this);
        graphicsThread.start();
    }

    public static void drawCenteredString(Graphics g, String text, Font font, Rectangle rect) {
        FontMetrics metrics = g.getFontMetrics(font);
        int x = rect.x + (rect.width - metrics.stringWidth(text)) / 2;
        int y = rect.y + ((rect.height - metrics.getHeight()) / 2) + metrics.getAscent();
        g.setFont(font);
        g.drawString(text, x, y);
    }

    public void update(float elapsedTime) {
        gameStateManager.update(elapsedTime);
        InputHandler.update();
    }

    @Override
    public void paintComponent(Graphics g) {
        draw((Graphics2D) g);
    }

    private void draw(Graphics2D g) {
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
                RenderingHints.VALUE_TEXT_ANTIALIAS_GASP);
        g.setRenderingHint(RenderingHints.KEY_RENDERING,
                RenderingHints.VALUE_RENDER_QUALITY);
        g.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL,
                RenderingHints.VALUE_STROKE_PURE);
        gameStateManager.draw(g);
    }

}
