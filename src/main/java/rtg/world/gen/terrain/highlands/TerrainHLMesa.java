package rtg.world.gen.terrain.highlands;

import rtg.api.biome.TerrainBase;
import rtg.api.lib.CellNoise;
import rtg.api.lib.OpenSimplexNoise;

public class TerrainHLMesa extends TerrainBase
{
	public TerrainHLMesa()
	{
	}

    // this is just supposed to be a really big hill, as a sub-biome
	@Override
	public float generateNoise(OpenSimplexNoise simplex, CellNoise cell, int x, int y, float border, float river)
	{
        float h = simplex.noise2(x / 80f, y / 80f) * 25f;
        h += simplex.noise2(x / 5f, y / 5f) * 1.5f;

        return 120f + h;
	}
}
