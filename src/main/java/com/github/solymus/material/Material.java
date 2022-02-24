package com.github.solymus.material;

import com.github.solymus.material.info.MaterialInfo;
import com.github.solymus.utils.Utils;

import static com.github.solymus.utils.Utils.isNull;

public abstract class Material {

    private final MaterialInfo materialInfo;

    public Material() {
        this.materialInfo = this.getClass().getAnnotation(MaterialInfo.class);
        if (isNull(this.materialInfo))
            throw new NullPointerException(
                    String.format("The Material [%s] needs an annotation of type com.github.solymus.material.info.MaterialInfo.class!",
                            this.getClass().getSimpleName()));
    }

    public MaterialInfo getMaterialInfo() {
        return materialInfo;
    }

}
