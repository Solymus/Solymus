package com.github.solymus.entity.hostile;

import com.github.solymus.entity.Entity;

public class Blaze extends Entity {

    /**
     * https://minecraft.fandom.com/wiki/Blaze
     */

    public static final int NETWORK_ID = 43;
    
    @Override
    public int getNetworkId() {
        return NETWORK_ID;
    }
    
}
