package com.mycompany.app.Interface;

import com.mycompany.app.Action.Action;

public abstract class Entity
{
	protected String	name;
	protected String	type;
	protected float		level;
	protected int		experience;
	protected int		attack;
	protected int		defense;
	protected int		hitPoints;
	// protected Action	action; //Is it needed to be here ?

	public Entity()
	{

	}

	protected void updateLevel() // Should it be a specific stuff just for the heros ?
	{
		// level*1000+(level-1)ˆ2 * 450. So
		// the necessary experience to level up will follow this pattern:
		// • Level 1 - 1000 XP
		// • Level 2 - 2450 XP
		// • Level 3 - 4800 XP
		// • Level 4 - 8050 XP
		// • Level 5 - 12200 XP
	}

	public abstract void Attack();

	public abstract void Defense();

	public abstract void updateStatus(int p_damage);
}