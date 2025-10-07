package com.alchemymix.ui.widgets;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MenuButton extends JButton {

    // Target button size in your virtual resolution (1280x720)
    private static final int BUTTON_WIDTH = 200;
    private static final int BUTTON_HEIGHT = 60;

    // Scaled icons (loaded once)
    private static final ImageIcon NORMAL_ICON = loadAndScaleIcon("/images/button-normal.png");
    private static final ImageIcon HOVER_ICON  = loadAndScaleIcon("/images/button-hover.png");

    public MenuButton(String label) {
        super(label);

        // Base visual setup
        setIcon(NORMAL_ICON);
        setHorizontalTextPosition(SwingConstants.CENTER);
        setVerticalTextPosition(SwingConstants.CENTER);
        setForeground(Color.WHITE);
        setFont(new Font("Segoe UI", Font.BOLD, 18));

        // No default Swing button visuals
        setBorderPainted(false);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setOpaque(false);

        // Center align text over image (for BoxLayout)
        setAlignmentX(Component.CENTER_ALIGNMENT);

        // Hover behavior
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setIcon(HOVER_ICON);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setIcon(NORMAL_ICON);
            }
        });
    }

    private static ImageIcon loadAndScaleIcon(String path) {
        ImageIcon rawIcon = new ImageIcon(MenuButton.class.getResource(path));
        Image scaledImage = rawIcon.getImage().getScaledInstance(
                BUTTON_WIDTH, BUTTON_HEIGHT, Image.SCALE_SMOOTH);
        return new ImageIcon(scaledImage);
    }
}
