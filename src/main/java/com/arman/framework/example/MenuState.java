package com.arman.framework.example;

import com.arman.framework.GamePanel;
import com.arman.framework.GameState;
import com.arman.framework.GameStateManager;
import com.arman.framework.InputHandler;

import java.awt.*;

public class MenuState extends GameState {

    public static final int START = 0;
    public static final int HELP = 1;
    public static final int OPTIONS = 2;
    public static final int QUIT = 3;

    private int selectedItem;
    private String[] items;
    private Font titleFont;
    private Color titleColor;
    private Font itemsFont;
    private Color itemsColor;
    private Color selectColor;

    public MenuState(GameStateManager gameStateManager) {
        super(gameStateManager);
    }

    public void setup() {
        selectedItem = 0;
        items = new String[]{"Start", "Help", "Options", "Quit"};
        titleFont = new Font("Arial", Font.PLAIN, 56);
        titleColor = Color.YELLOW;
        itemsFont = new Font("Arial", Font.PLAIN, 28);
        itemsColor = Color.WHITE;
        selectColor = Color.GREEN;
    }

    @Override
    public void dispose() {

    }

    public void update(float elapsedTime) {
        handleInput();
    }

    public void draw(Graphics2D g) {
        super.draw(g);
        g.setColor(titleColor);
        GamePanel.drawCenteredString(g, "TITLE", titleFont, new Rectangle(0, 0, GamePanel.WIDTH, 2 * GamePanel.HEIGHT / 3));
        for (int i = 0; i < items.length; i++) {
            if (i == selectedItem) {
                g.setColor(selectColor);
            } else {
                g.setColor(itemsColor);
            }
            GamePanel.drawCenteredString(g, items[i], itemsFont, new Rectangle(0, 100 + i * 40, GamePanel.WIDTH, 2 * GamePanel.HEIGHT / 3));
        }
    }

    public void select() {

    }

    public void handleInput() {
        if (InputHandler.pressedEnter()) {
            select();
        } else if (InputHandler.pressedUp()) {
            selectedItem--;
            selectedItem = (selectedItem < 0) ? items.length - 1 : selectedItem;
        } else if (InputHandler.pressedDown()) {
            selectedItem = ++selectedItem % items.length;
        }
    }

}
