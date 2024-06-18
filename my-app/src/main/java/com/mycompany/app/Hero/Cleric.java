package com.mycompany.app.Hero;

public class Cleric extends Hero
{
	public Cleric(String p_name)
	{
		super(p_name);
		type = "Cleric";
		attack = 3;
		defense = 3;
		hitPoints = 70;
	}

	public void Attack()
	{
		//To attack is it the hero turn ?

		//Enemy life = life - (defense - attack)

		//Update enemy status
	}
	
	public void Defense()
	{
		//To defense is it the enemy turn ?
	
		//hero life = life - (defense - attack)
	
		//Update hero status
	}

	public void updateStatus(int p_damage)
	{
		//Check if damage is valid

		//Check if the damage will not kill the hero

		//Apply damage to the Actual life
	}
}
