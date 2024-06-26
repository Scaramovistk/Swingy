package com.mycompany.app.Factorys;

import com.mycompany.app.Artifact.*;

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
				return (new Armor(p_quality));
			case "Helm":
				return (new Helm(p_quality));
			case "Weapon":
				return (new Weapon(p_quality));
			default:
				throw new IllegalArgumentException("Invalid argument: Type font exist");
		}
	}
}