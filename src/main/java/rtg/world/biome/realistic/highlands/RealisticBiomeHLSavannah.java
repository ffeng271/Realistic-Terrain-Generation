package rtg.world.biome.realistic.highlands;

import highlands.api.HighlandsBiomes;
import rtg.api.biome.BiomeConfig;
import rtg.config.highlands.ConfigHL;
import rtg.world.biome.BiomeBase;
import rtg.world.gen.surface.highlands.SurfaceHLSavannah;
import rtg.world.gen.terrain.highlands.TerrainHLSavannah;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

public class RealisticBiomeHLSavannah extends RealisticBiomeHLBase
{
    
    public static BiomeGenBase hlBiome = HighlandsBiomes.savannah;
    
    public static Block topBlock = hlBiome.topBlock;
    public static Block fillerBlock = hlBiome.fillerBlock;
    
    public RealisticBiomeHLSavannah(BiomeConfig config)
    {
    
        super(
            hlBiome, BiomeBase.climatizedBiome(BiomeGenBase.river, Climate.HOT),
            new TerrainHLSavannah(),
            new SurfaceHLSavannah(topBlock, fillerBlock));
        
        this.config = config;
    }
}
