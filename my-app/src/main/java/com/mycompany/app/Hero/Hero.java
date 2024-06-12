package Hero;
import Artifact;

public class Hero extends Entity
{
	protected Action			action;
	protected List<Artifact>	artifacts;
	protected int				xpToNextLevel;

	//Attack and defence should be a class ?
	public Hero(String uName)
	{
		name = uName;
		level = 0;
		experience = 0;
		artifacts = new LinkedList<>();
		//Will initialize the argumetns or leave it for the extended class?
	}

	protected void equipArtifact(Artifact p_artifact)
	{
		if (p_artifact == null || artifacts.contains(p_artifact))
			throw IllegalArgumentException("Illegal Argument: Given artifact is null or alredy equiped.");
		artifacts.add(p_artifact);
	}

	public void updateXp(int xp_earned)
	{
		if (xp_earned < 0)
			throw IllegalArgumentException("Illegal Argument: XP need to be higher than 0.");
		if ((experience + xp_earned) >= xpToNextLevel)
			updateLevel();
		experience =+ xp_earned;
	}

	public void movePosition(char direction)
	{
		//Does a need accest to a map here  or just it as a Singleton will work?
		switch (direction)
		{
			case("N"):
				//Move to the North
			break;
			case("S"):
				//Move to the South
			break;
			case("E"):
				//Move to the East
			break;
			case("W"):
				//Move to the West
			break;
		}
		//Update this in the map not in hero ?
	}

	public String getName() { return (name); }

	public String getClass() { return (type); }

	public float getLevel() { return (level); }

	public int getExperience() { return (experience); }

	public int getAttack() { return (attack); }

	public int getDefense() { return (defense); }

	public int getHitPoints() { return (hitPoints); }
}
