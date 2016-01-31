package rtg.world.gen.terrain.biomesoplenty;

import rtg.api.lib.CellNoise;
import rtg.api.lib.OpenSimplexNoise;
import rtg.world.gen.terrain.TerrainBase;

public class TerrainBOPLushSwamp extends TerrainBase
{
	public TerrainBOPLushSwamp()
	{
	}
	
	@Override
	public float generateNoise(OpenSimplexNoise simplex, CellNoise cell, int x, int y, float border, float river)
	{
		float h = simplex.noise2(x / 180f, y / 180f) * 40f * river;
		h *= h / 35f;
		
		if(h < 1f)
		{
			h = 1f;
		}
		
		if(h < 4f)
		{
			h += (simplex.noise2(x / 50f, y / 50f) + simplex.noise2(x / 15f, y / 15f)) * (4f - h);
		}
		
		return 60f + h;
	}
}
