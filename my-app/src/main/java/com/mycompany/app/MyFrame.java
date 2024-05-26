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

		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.red);
		redPanel.setBounds(0, 0, 250, 250);

		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.blue);
		bluePanel.setBounds(250, 0, 250, 250);

		JLabel icon = new JLabel();
		ImageIcon thumbs = new ImageIcon("/home/gabriel/Desktop/42Cours/Swingy/my-app/src/main/java/com/mycompany/app/cypher Simbol.png");

		label.setText("Templar Warrior Simbol");
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setForeground(new Color(0, 0, 0));
		label.setFont(new Font("Roboto", Font.ITALIC, 20));
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setBounds(0, 0, 250, 250);

		icon.setIcon(thumbs);
		bluePanel.add(icon);

		this.setVisible(true);
		this.setLayout(null);
		this.add(label);
		this.setBackground(new Color(0x0F0F0F));
		this.add(redPanel);
		this.add(bluePanel);
	}
}