package rtg.world.gen.terrain.thaumcraft;

import rtg.api.biome.TerrainBase;
import rtg.api.lib.CellNoise;
import rtg.api.lib.OpenSimplexNoise;

public class TerrainTCMagicalForest extends TerrainBase
{
	public TerrainTCMagicalForest()
	{
	}
	
	@Override
	public float generateNoise(OpenSimplexNoise simplex, CellNoise cell, int x, int y, float border, float river)
	{
		float h = simplex.noise2(x / 100f, y / 100f) * 8;
		h += simplex.noise2(x / 30f, y / 30f) * 4;
		h += simplex.noise2(x / 15f, y / 15f) * 2;
		h += simplex.noise2(x / 7f, y / 7f);
		
    	return 70f + (20f * river) + h;
	}
}
