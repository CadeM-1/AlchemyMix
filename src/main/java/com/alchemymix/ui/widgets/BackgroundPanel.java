package com.alchemymix.ui.widgets;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class BackgroundPanel extends JPanel {
    private Image background;
    private Image scaledBackground;

    public BackgroundPanel(Image background) {
        this.background = background;
        setLayout(null);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (background != null) {
            int panelWidth = getWidth();
            int panelHeight = getHeight();

            // Only rescale if size changed
            if (scaledBackground == null || scaledBackground.getWidth(this) != panelWidth || scaledBackground.getHeight(this) != panelHeight) {
                scaledBackground = getScaledImage(background, panelWidth, panelHeight);
            }

            g.drawImage(scaledBackground, 0, 0, this);
        }
    }

    // High-quality scaling
    private Image getScaledImage(Image src, int width, int height) {
        BufferedImage resized = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = resized.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Fill entire panel (stretched to fit)
        g2.drawImage(src, 0, 0, width, height, null);
        g2.dispose();
        return resized;
    }

    public void setBackgroundImage(Image background) {
        this.background = background;
        this.scaledBackground = null; // reset so it rescales on next paint
        repaint();
    }
}
