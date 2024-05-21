package com.mycompany.app;

import javax.swing.*;
import javafx.scene.paint.Color;
import javax.swing.JFrame;

public class MyFrame extends JFrame
{
	MyFrame()
	{
		this.setTitle("A RPG Game");
		this.setSize(600, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);

		JLabel label = new JLabel("Hello World");
		this.getContentPane().add(label);
		this.getContentPane().add(label);
		this.getContentPane().add(label);
		this.getContentPane().add(label);

		ImageIcon image = new ImageIcon("~/Desktop/cypher Simbol.png");

		this.setVisible(true);
		this.setIconImage(image.getImage());

		Color c = new Color(250, 250, 250, 0);

		this.getContentPane().setBackground(null);

	}

}