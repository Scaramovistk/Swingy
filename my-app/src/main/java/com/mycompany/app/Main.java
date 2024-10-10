package com.mycompany.app;

public class Main {
	public static void main(String[] args) {
		//Schedule a job for the event-dispatching thread:
		//creating and showing this application's GUI.

		// Program that will do a polymorphism to the certain one

		if (args.length != 1)
			return ; //Exception error ?

		
		if(args[0].equals("CLI"))
		{
			CLI program = new CLI();

			program.exec();
			System.out.print("CLI working first\n");
		}
		else if (args[0].equals("CLI"))
		{
			//Adapt to GUI after CLI is done
		}
		else
		{
			System.out.print("Wrong input\n");
			return;
		}
	}
}
