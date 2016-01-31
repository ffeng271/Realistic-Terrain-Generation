package rtg.world.biome.realistic.highlands;

import highlands.api.HighlandsBiomes;

import java.util.Random;

import net.minecraft.world.World;

import rtg.api.biome.BiomeConfig;
import rtg.api.lib.CellNoise;
import rtg.api.lib.OpenSimplexNoise;
import rtg.config.highlands.ConfigHL;
import rtg.world.gen.surface.highlands.SurfaceHLAlps;
import rtg.world.gen.terrain.highlands.TerrainHLAlps;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

public class RealisticBiomeHLAlps extends RealisticBiomeHLBase {
    
    public static BiomeGenBase hlBiome = HighlandsBiomes.alps;
    
    public static Block topBlock = hlBiome.topBlock;
    public static Block fillerBlock = hlBiome.fillerBlock;
    
    public RealisticBiomeHLAlps(BiomeConfig config) {
    
        super(hlBiome, BiomeGenBase.frozenRiver, new TerrainHLAlps(),
            new SurfaceHLAlps(topBlock, fillerBlock, false, null, 0.45f));
        
        this.config = config;
    }

    @Override
    public void rDecorate(World world, Random rand, int chunkX, int chunkY, OpenSimplexNoise simplex, CellNoise cell, float strength, float river) {
        super.rDecorate(world, rand, chunkX, chunkY, simplex, cell, strength, river);
    }

}
