package com.mycompany.app.Hero;

public class Hero
{
	String	name;
	String	type;
	float	level;
	int		experience;
	int		attack;
	int		defense;
	int		hitPoints;

	//Attack and defence should be a class ?
	public Hero(String uName)
	{
		name = uName;
		level = 0;
		experience = 0;
		//Will initialize the argumetns or leave it for the extended class?
	}

	public void Attack()
	{

	}

	public void Defense()
	{

	}

	public void updateStatus()
	{
		
	}

	public void Fight()
	{
		//which engages him in a battle with the villain
	}

	public void Run()
	{
		//which gives him a 50If the odds aren’t on his side, he must fight the villain.
	}

}
