package com.mycompany.app.Action;
import com.mycompany.app.Enemy.Enemy;
import com.mycompany.app.Hero.Hero;

public class Attack extends Action
{
	//Turn in class Action and each action will derivate for this ?
	public Attack(Hero p_hero, Enemy p_enemy)
	{
		super(p_hero, p_enemy);
		//which engages him in a battle with the villain
	}
}

