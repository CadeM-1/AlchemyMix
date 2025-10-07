package com.alchemymix;

import com.alchemymix.ui.core.PanelManager;
import com.alchemymix.ui.panels.LoginPanel;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main
{
	public static void main(String[] args)
	{
        SwingUtilities.invokeLater(() -> {
            System.out.println("Starting AlchemyMix...");
            JFrame frame = new JFrame("AlchemyMix");
            frame.setSize(1280,720);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            frame.setResizable(false);

            // Client Icons
            ImageIcon largeIcon = new ImageIcon(Main.class.getResource("/images/icon.png"));

            List<Image> icons = new ArrayList<>();
            icons.add(largeIcon.getImage().getScaledInstance(16, 16, Image.SCALE_SMOOTH));
            icons.add(largeIcon.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH));
            icons.add(largeIcon.getImage().getScaledInstance(48, 48, Image.SCALE_SMOOTH));
            frame.setIconImages(icons);

            PanelManager panelManager = new PanelManager();

            LoginPanel loginPanel = new LoginPanel(panelManager);

            panelManager.addPanel(loginPanel, "LOGIN");

            frame.setContentPane(panelManager.getContainer());

            panelManager.showPanel("LOGIN");

            frame.setVisible(true);
        });
    };
}

