package com.mycompany.app;

import javax.swing.*;

import javafx.scene.paint.Color;        

public class App {
	/**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("The Best Game You Can Play");
		frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Close the app when close button
		frame.setResizable(false);


        //Add the ubiquitous "Hello World" label.
        JLabel label = new JLabel("Hello World");
        frame.getContentPane().add(label);
        frame.getContentPane().add(label);
        frame.getContentPane().add(label);
        frame.getContentPane().add(label);

		ImageIcon image = new ImageIcon("~/Desktop/cypher Simbol.png");

        frame.setVisible(true);
		frame.setIconImage(image.getImage());
		// frame.getContentPane().setBackground(new Color(250, 0, 0));


        //Display the window.
        // frame.pack();
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
