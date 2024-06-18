package com.mycompany.app.Artifact;

public class Helm extends Artifact
{
	public Helm(int p_level)
	{
		super();

		//Apply a function to git a level according to the level gaven
		hitPoints = 100;
	}

	@Override
	public int getBuff() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getBuff'");
	}
}
