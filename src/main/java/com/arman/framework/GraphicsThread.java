package com.arman.framework;

public class GraphicsThread implements Runnable {

    private boolean running;
    private GamePanel gamePanel;

    public GraphicsThread(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
        running = false;
    }

    public synchronized void start() {
        running = true;
        Thread thread = new Thread(this);
        thread.start();
    }

    public synchronized void stop() {
        running = false;
    }

    public synchronized void run() {
        double time;
        double lastTime = System.nanoTime() / 1000000000.0;
        double passed;
        double delta = 0;
        double rate = 0;
        int frames = 0;
        int fps = 0;
        while (running) {
            boolean render = false;
            time = System.nanoTime() / 1000000000.0;
            passed = time - lastTime;
            lastTime = time;
            delta += passed;
            rate += passed;
            double tickSpeed = 1.0 / 60.0;
            while (delta >= tickSpeed) {
                delta -= tickSpeed;
                render = true;
                //ticks / updates
                gamePanel.update((float) passed);
                if (rate >= 1.0) {
                    rate = 0;
                    fps = frames;
                    frames = 0;
                }
            }
            if (render) {
                //render
                gamePanel.repaint();
                frames++;
            } else {
                try {
                    Thread.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        dispose();
    }

    private void dispose() {

    }

}
