
public class Battle
{
	private Hero hero;
	private Enemy enemy;

	public Battle(Hero p_hero, Enemy p_enemy)
	{
		// Do a check if valid value
		if (p_hero == null || p_enemy == null)
			throw Exception();
		hero = p_hero;
		enemy = p_enemy;
	}

	public void startBattle()
	{
		// make the prompt in a way that can be easly adapted to GUI
	}

	public void finishBattle()
	{
			// If a hero looses a battle, he dies and also looses the mission.
			// If a hero wins a battle, he gains:
			// • Experience points, based on the villain power. Of course, he will level up if he
			// reaches the next level experience.
			// • An artifact, which he can keep or leave. Of course, winning a battle doesn’t guarantee that an artefact will be droped and the quality of the artefact also varies
			// depending on the villain’s strenght.

		// Update Hero conditino
		//If he dies create a new game and finish this one
	}

	public void showResault()
	{
		// Show the last player status / Enemy and how much XP he gained
		//If leveled up show it as well
	}
}