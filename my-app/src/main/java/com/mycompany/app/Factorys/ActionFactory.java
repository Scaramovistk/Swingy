package com.mycompany.app.Factorys;

import com.mycompany.app.Action.*;
import com.mycompany.app.Enemy.Enemy;
import com.mycompany.app.Hero.Hero;

public class ActionFactory
{
	private static ActionFactory factory;
	private Hero hero;

	private ActionFactory(Hero p_hero) { hero = p_hero; }

	public static ActionFactory getInstance(Hero p_hero)
	{
		if (factory == null)
			factory = new ActionFactory(p_hero);
		return (factory);
	}

	public Action newAction(String p_type, int p_level)
	{
		// Create a enemy here based in the hero level?

		//Exectes the action here inside ? Examble Porcentage of having a enemy in the block
		if (p_type == null || p_level < 0)
			throw new IllegalArgumentException("Invalid argument: Set to null");
		switch(p_type)
		{
			case "Run":
				return (new Run());
			case "Fight":
				return (new Fight(hero, new Enemy()));
			case "Attack":
				return (new Attack());
			case "Defend":
				return (new Defend());
			default:
				throw new IllegalArgumentException("Invalid argument: Type dont exist");
		}
	}
}
