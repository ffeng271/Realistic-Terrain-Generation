package rtg.world.biome.realistic.extrabiomes;

import rtg.api.biome.BiomeConfig;
import rtg.config.extrabiomes.ConfigEBXL;
import rtg.world.gen.surface.extrabiomes.SurfaceEBXLGreenHills;
import rtg.world.gen.terrain.extrabiomes.TerrainEBXLGreenHills;
import extrabiomes.api.BiomeManager;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

public class RealisticBiomeEBXLGreenHills extends RealisticBiomeEBXLBase
{	
	public static BiomeGenBase ebxlBiome = BiomeManager.greenhills.get();
	
	public static Block topBlock = ebxlBiome.topBlock;
	public static Block fillerBlock = ebxlBiome.fillerBlock;
	
	public RealisticBiomeEBXLGreenHills(BiomeConfig config)
	{
		super(
			ebxlBiome, BiomeGenBase.river,
			new TerrainEBXLGreenHills(360f, 100f, 0f),
			new SurfaceEBXLGreenHills(topBlock, fillerBlock, false, null, 0.95f)
		);
		
		this.config = config;
	}
}
