package com.alchemymix.ui.widgets;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MenuButton extends JButton {

    // Static shared icons (only loaded once)
    private static final ImageIcon NORMAL_ICON = new ImageIcon(MenuButton.class.getResource("/images/button-normal.png"));
    private static final ImageIcon HOVER_ICON = new ImageIcon(MenuButton.class.getResource("/images/button-hover.png"));


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

        // Center align text over image
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
}
