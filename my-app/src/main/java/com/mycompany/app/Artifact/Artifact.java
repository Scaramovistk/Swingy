package com.mycompany.app.Artifact;

public abstract class Artifact
{
	protected int attack;
	protected int defense;
	protected int hitPoints;

	public Artifact()
	{
		attack = 0;
		defense = 0;
		hitPoints = 0;
	}

	public abstract int getBuff(); //One function to return the buff to everyone
}