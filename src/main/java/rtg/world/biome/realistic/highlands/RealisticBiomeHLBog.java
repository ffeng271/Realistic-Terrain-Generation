package rtg.world.biome.realistic.highlands;

import highlands.api.HighlandsBiomes;
import rtg.api.biome.BiomeConfig;
import rtg.world.biome.BiomeBase;
import rtg.world.gen.surface.highlands.SurfaceHLBog;
import rtg.world.gen.terrain.highlands.TerrainHLBog;

import net.minecraft.world.biome.BiomeGenBase;

public class RealisticBiomeHLBog extends RealisticBiomeHLBase
{
    
    public RealisticBiomeHLBog(BiomeConfig config)
    {
        super(
            HighlandsBiomes.bog, BiomeBase.climatizedBiome(BiomeGenBase.river, Climate.WET),
            new TerrainHLBog(),
            new SurfaceHLBog(HighlandsBiomes.bog.topBlock, HighlandsBiomes.bog.fillerBlock));
        
        this.config = config;
    }
}
