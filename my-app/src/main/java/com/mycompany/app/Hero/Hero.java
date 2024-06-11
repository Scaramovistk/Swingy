package com.mycompany.app.Hero;

import com.mycompany.app.Artifact.Artifact;

public class Hero extends Entity
{
	protected Action			action;
	protected List<Artifact>	artifacts;

	// If a hero looses a battle, he dies and also looses the mission.
	// If a hero wins a battle, he gains:
	// • Experience points, based on the villain power. Of course, he will level up if he
	// reaches the next level experience.
	// • An artifact, which he can keep or leave. Of course, winning a battle doesn’t guarantee that an artefact will be droped and the quality of the artefact also varies
	// depending on the villain’s strenght.
	//Attack and defence should be a class ?
	public Hero(String uName)
	{
		name = uName;
		level = 0;
		experience = 0;
		//Will initialize the argumetns or leave it for the extended class?
	}

	protected void equipArtifact(Artifact p_artifact)
	{

	}

	public void updateXp(int xp_amount)
	{

	}

	public void movePosition(char direction)
	{
		//Update this in the map not in hero
	}

	public String getName()
	{
		return (name);
	}

	public String getClass()
	{
		return (type);
	}

	public float getLevel()
	{
		return (level);
	}

	public int getExperience()
	{
		return (experience);
	}

	public int getAttack()
	{
		return (attack);
	}

	public int getDefense()
	{
		return (defense);
	}

	public int getHitPoints()
	{
		return (hitPoints);
	}
}
