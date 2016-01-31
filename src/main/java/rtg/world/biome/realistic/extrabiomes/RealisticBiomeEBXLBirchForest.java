package rtg.world.biome.realistic.extrabiomes;

import rtg.api.biome.BiomeConfig;
import rtg.config.extrabiomes.ConfigEBXL;
import rtg.world.gen.surface.extrabiomes.SurfaceEBXLBirchForest;
import rtg.world.gen.terrain.extrabiomes.TerrainEBXLBirchForest;
import extrabiomes.api.BiomeManager;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

public class RealisticBiomeEBXLBirchForest extends RealisticBiomeEBXLBase
{	
	public static BiomeGenBase ebxlBiome = BiomeManager.birchforest.get();
	
	public static Block topBlock = ebxlBiome.topBlock;
	public static Block fillerBlock = ebxlBiome.fillerBlock;
	
	public RealisticBiomeEBXLBirchForest(BiomeConfig config)
	{
		super(
			ebxlBiome, BiomeGenBase.river,
			new TerrainEBXLBirchForest(63f, 74f, 33f),
			new SurfaceEBXLBirchForest(topBlock, fillerBlock, false, null, 0.95f)
		);
		
		this.config = config;
	}
}
