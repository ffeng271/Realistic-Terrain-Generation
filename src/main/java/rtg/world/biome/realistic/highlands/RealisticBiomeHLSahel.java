package rtg.world.biome.realistic.highlands;

import highlands.api.HighlandsBiomes;
import rtg.api.biome.BiomeConfig;
import rtg.config.highlands.ConfigHL;
import rtg.world.gen.surface.highlands.SurfaceHLSahel;
import rtg.world.gen.terrain.highlands.TerrainHLSahel;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

public class RealisticBiomeHLSahel extends RealisticBiomeHLBase
{
    
    public static BiomeGenBase hlBiome = HighlandsBiomes.sahel;
    
    public static Block topBlock = hlBiome.topBlock;
    public static Block fillerBlock = hlBiome.fillerBlock;
    
    public RealisticBiomeHLSahel(BiomeConfig config)
    {
    
        super(
            hlBiome, BiomeGenBase.river,
            new TerrainHLSahel(),
            new SurfaceHLSahel(topBlock, fillerBlock));
        
        this.config = config;
    }
}
