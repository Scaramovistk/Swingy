
public class ArtifactFactory
{
	private static ArtifactFactory factory;

	private ArtifactFactory() {}

	public static ArtifactFactory getInstance()
	{
		if (factory == null)
			factory = new ArtifactFactory();
		return (factory);
	}

	public Artifact newArtifact(String p_type, int p_quality)
	{
		if (p_type == null || p_quality < 0)
			throw new IllegalArgumentException("Invalid argument: Set to null");
		switch(p_type)
		{
			case "Armor":
				return (new Armor(p_level));
			case "Helm":
				return (new Helm(p_level));
			case "Weapon":
				return (new Weapon(p_level));
			default:
				throw new IllegalArgumentException("Invalid argument: Type font exist");
		}
	}
}