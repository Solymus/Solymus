package com.github.solymus.block;

import static com.github.solymus.utils.Utils.isNull;

import com.github.solymus.block.info.BlockInfo;

public abstract class Block {

  private BlockInfo blockInfo;

  public Block() {
    this.blockInfo = this.getClass().getAnnotation(BlockInfo.class);

    if (isNull(this.blockInfo))
      throw new NullPointerException(
          String.format("The block %s needs an annotation of type com.github.solymus.block.info.BlockInfo.class!",
              this.getClass().getSimpleName()));

  }

  public BlockInfo getBlockInfo() {
    return this.blockInfo;
  }

}
