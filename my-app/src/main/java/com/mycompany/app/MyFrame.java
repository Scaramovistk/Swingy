package com.mycompany.app;

import java.awt.Font;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.border.Border;

import java.awt.Color;

public class MyFrame extends JFrame
{
	MyFrame()
	{
		this.setTitle("A RPG Game");
		this.setSize(600, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);

		JLabel label = new JLabel();
		Border border = BorderFactory.createLineBorder(new Color(0x000000), 2);

		ImageIcon image = new ImageIcon(getClass().getResource("cypher Simbol.png"));

		label.setText("Templar Warrior Simbol");
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setForeground(new Color(0, 0, 0));
		label.setFont(new Font("Roboto", Font.ITALIC, 20));
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setBounds(0, 0, 250, 250);

		this.setVisible(true);
		this.setLayout(null);
		this.add(label);
		this.setBackground(new Color(0x0F0F0F));
		this.setIconImage(image.getImage());
	}
}