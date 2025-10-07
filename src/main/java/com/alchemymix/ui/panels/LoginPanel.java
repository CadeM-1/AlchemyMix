package com.alchemymix.ui.panels;

import com.alchemymix.ui.core.PanelManager;
import com.alchemymix.ui.widgets.BackgroundPanel;
import com.alchemymix.ui.widgets.MenuButton;

import javax.swing.*;
import java.awt.*;

public class LoginPanel extends BackgroundPanel {
    public LoginPanel(PanelManager manager) {
        super(new ImageIcon(LoginPanel.class.getResource("/images/menubackgrounds.png")).getImage());


        setLayout(new GridBagLayout());

        JPanel contentPanel = new JPanel();
        contentPanel.setOpaque(false);
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));

        ImageIcon titleImage = new ImageIcon(LoginPanel.class.getResource("/images/title.png"));
        Image scaledTitle = titleImage.getImage().getScaledInstance(350, 200, Image.SCALE_SMOOTH);
        JLabel title = new JLabel(new ImageIcon(scaledTitle));
        title.setAlignmentX(Component.CENTER_ALIGNMENT);


        contentPanel.add(title);

        MenuButton LoginButton = new MenuButton("LOGIN");
        contentPanel.add(LoginButton);

        add(contentPanel);


    }

}
