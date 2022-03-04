package com.github.solymus.block;

import com.github.solymus.block.tile.Tile;

public class BlockIdentifier {

    private final int blockId;
    private final int itemId;
    private final int variant;

    private Class<? extends Tile> tileClasses;

    public BlockIdentifier(int blockId, int itemId, int variant, Class<? extends Tile> tileClasses) {
        this.blockId = blockId;
        this.itemId = itemId;
        this.variant = variant;
        this.tileClasses = tileClasses;
    }

    public int getBlockId() {
        return blockId;
    }

    // falta um metodo

    public int getItemId() {
        return itemId;
    }

    public int getVariant() {
        return variant;
    }

    public Class<? extends Tile> getTileClasses() {
        return tileClasses;
    }
}
