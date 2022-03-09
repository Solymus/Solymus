package com.github.solymus.entity;

import org.reflections.Reflections;

public abstract class Entity {

    public static final String[] ENTITY_PACKAGES = {
        "com.github.solymus.entity.hostile",
        "com.github.solymus.entity.neutral",
        "com.github.solymus.entity.passive",
        "com.github.solymus.entity.projectile",
        "com.github.solymus.entity.vechicles"
    };

    public static void registerDefaultEntities() {
        for (String packageName : Entity.ENTITY_PACKAGES) {
            for (Class<? extends Entity> clazz : new Reflections(packageName)
                .getSubTypesOf(Entity.class)) {
                    clazz.getClass(); // To remove unused variable warning
                // TODO: Add this line:
                // TODO: EntityManager.registerEntity(clazz, clazz.getField("NETWORK_ID").getInt(clazz));
            }
        }
    }

    public Entity() {
    }

    public abstract int getNetworkId();

}