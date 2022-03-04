package com.github.solymus.configuration;

import java.util.LinkedHashMap;

public class ConfigurationSection extends LinkedHashMap<String, Object> {

    public ConfigurationSection() {
        super();
    }

    public ConfigurationSection(String key, Object value) {
        this();
        this.set(key, value);
    }

    public ConfigurationSection(LinkedHashMap<String, Object> defaultValues) {
        this();
    }

    public void set(String key, Object value) {
    }

    // todo: finalize this ...

}
