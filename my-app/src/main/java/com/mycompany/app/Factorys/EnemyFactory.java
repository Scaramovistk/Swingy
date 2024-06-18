package com.mycompany.app.Factorys;

import com.mycompany.app.Enemy.*;

public class EnemyFactory
{
	private static EnemyFactory factory;

	private EnemyFactory() {}

	public static EnemyFactory getInstance()
	{
		if (factory == null)
			factory = new EnemyFactory();
		return (factory);
	}

	public Enemy newEnemy(String p_type, int p_level)
	{
		if (p_type == null || p_level < 0)
			throw new IllegalArgumentException("Invalid argument: Set to null");
		switch(p_type)
		{
			case "Bandit":
				return (new Bandit(p_level));
			case "Dragon":
				return (new Dragon(p_level));
			case "Wolf":
				return (new Wolf(p_level));
			default:
				throw new IllegalArgumentException("Invalid argument: Type dont exist");
		}
	}
}