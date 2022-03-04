package com.github.solymus.block;

import static com.github.solymus.utils.Utils.isNull;

public abstract class Block {

  public static final Integer INTERNAL_METADATA_BITS = 4;
  public static final Integer INTERNAL_METADATA_MASK = ~(~0 << INTERNAL_METADATA_BITS);

  public BlockIdentifier blockIdentifier;

  public Block() {
  }

}
