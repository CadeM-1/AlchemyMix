package com.alchemymix.ui.panels;

import com.alchemymix.ui.core.PanelManager;
import com.alchemymix.ui.widgets.BackgroundPanel;
import com.alchemymix.ui.widgets.MenuButton;

import javax.swing.*;
import java.awt.*;

public class LoginPanel extends BackgroundPanel {
    public LoginPanel(PanelManager manager) {
        super(new ImageIcon(LoginPanel.class.getResource("/images/menubackgrounds.png")).getImage());

        setLayout(new BorderLayout());

        ImageIcon titleImage = new ImageIcon(LoginPanel.class.getResource("/images/title.png"));
        Image scaledTitle = titleImage.getImage().getScaledInstance(580, 250, Image.SCALE_SMOOTH);
        JLabel title = new JLabel(new ImageIcon(scaledTitle));
        title.setHorizontalAlignment(SwingConstants.CENTER);

        JPanel titlePanel = new JPanel(new BorderLayout());
        titlePanel.setOpaque(false);
        titlePanel.setBorder(BorderFactory.createEmptyBorder(50, 0, 0, 0)); // 20px gap from top
        titlePanel.add(title, BorderLayout.CENTER);

        add(titlePanel, BorderLayout.NORTH);

        JPanel contentPanel = new JPanel();
        contentPanel.setOpaque(false);
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));




        MenuButton LoginButton = new MenuButton("START GAME");
        contentPanel.add(LoginButton);

        add(contentPanel);


    }

}
