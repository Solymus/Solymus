package com.github.solymus.block;

public class BlockFactory {

    public static BlockFactory instance;

    private final Block[] fullList;
    private final int[] mappedStatesId;

    public int[] light;
    public int[] lightFilter;
    public byte[] blocksDirectSkyLight;
    public float[] blastResistance;

    public BlockFactory() {
        this.fullList = new Block[0x400 << Block.INTERNAL_METADATA_BITS];
        this.mappedStatesId = new int[0x400 << Block.INTERNAL_METADATA_BITS];
        this.light = new int[0x400 << Block.INTERNAL_METADATA_BITS];
        this.lightFilter = new int[0x400 << Block.INTERNAL_METADATA_BITS];
        this.blocksDirectSkyLight = new byte[0x400 << Block.INTERNAL_METADATA_BITS];
        this.blastResistance = new float[0x400 << Block.INTERNAL_METADATA_BITS];

    }

    public static BlockFactory getInstance() {
        return instance;
    }

}
