package com.alchemymix;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main
{
	public static void main(String[] args)
	{
        System.out.println("Starting AlchemyMix...");
        JFrame frame = new JFrame("AlchemyMix");
        frame.setSize(800,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        // Client Icons
        ImageIcon largeIcon = new ImageIcon(Main.class.getResource("/images/icon.png"));

        List<Image> icons = new ArrayList<>();
        icons.add(largeIcon.getImage().getScaledInstance(16, 16, Image.SCALE_SMOOTH));
        icons.add(largeIcon.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH));
        icons.add(largeIcon.getImage().getScaledInstance(48, 48, Image.SCALE_SMOOTH));
        frame.setIconImages(icons);


        frame.setVisible(true);
    }
}

