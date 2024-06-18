package com.mycompany.app.Map;

import com.mycompany.app.Hero.Hero;

public class Map
{
	private static Map map;
	private Hero hero;
	private int sideLenght;

	private Map()
	{

	}

	public static Map getInstance()
	{
		if (map == null)
			map = new Map();
		return (map);
	}

	public void generateMap(int p_level)
	{
		//Block it to just be able to generate one map

	}

	private void populateMap()
	{
		createHero();
		

		//Create the map based in the hero level
		//Set the map sodeLenght

		//Populate with enemys
		startGame();
	}

	public void updateConditions()
	{

	}

	public void startGame()
	{

	}

	public void createHero()
	{
		//Pre made heros, create own hero or load it from the txt file
		//how to load it, how to save it, in which format i need to do it
		// if (p_hero == null)
		// 	throw new IllegalArgumentException("Illegal Argument: Hero in the map set to NULL.");
		// hero = p_hero;
	}

	public void finishGame()
	{

	}
}
