package com.mycompany.app.Action;

import com.mycompany.app.Enemy.Enemy;
import com.mycompany.app.Hero.Hero;

public class Action
{
	protected Hero	hero;
	protected Enemy	enemy;

	//So this should take a Hero and enemy in the constructor ?
	public Action(Hero p_hero, Enemy p_enemy)
	{
		hero = p_hero;
		enemy = p_enemy;
	}
}