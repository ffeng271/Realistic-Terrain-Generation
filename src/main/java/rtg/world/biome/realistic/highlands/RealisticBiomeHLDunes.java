package rtg.world.biome.realistic.highlands;

import highlands.api.HighlandsBiomes;
import rtg.api.biome.BiomeConfig;
import rtg.world.gen.surface.highlands.SurfaceHLDunes;
import rtg.world.gen.terrain.highlands.TerrainHLDunes;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

public class RealisticBiomeHLDunes extends RealisticBiomeHLBase
{
    public static BiomeGenBase hlBiome = HighlandsBiomes.dunes;
    
    public static Block topBlock = hlBiome.topBlock;
    public static Block fillerBlock = hlBiome.fillerBlock;
    
    public RealisticBiomeHLDunes(BiomeConfig config)
    {
    
        super(
            hlBiome, BiomeGenBase.river,
            new TerrainHLDunes(),
            new SurfaceHLDunes(topBlock, fillerBlock));
        
        this.config = config;
    }
}
