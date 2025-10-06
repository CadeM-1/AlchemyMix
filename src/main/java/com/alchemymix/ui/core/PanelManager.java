package com.alchemymix.ui.core;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class PanelManager {

    private JPanel container;
    private CardLayout cardLayout;
    private Map<String, JPanel> panels;

    public PanelManager() {
        container = new JPanel();
        cardLayout = new CardLayout();
        container.setLayout(cardLayout);
        panels = new HashMap<>();
    }

    public void addPanel(JPanel panel, String name) {
        container.add(panel, name);
        panels.put(name, panel);
    }

    public void showPanel(String name) {
        cardLayout.show(container, name);
    }

    public JPanel getContainer() {
        return container;
    }

    public JPanel getPanel(String name) {
        return panels.get(name);
    }
}