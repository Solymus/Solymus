package com.github.solymus.configuration;

import java.util.Map;
import java.util.TreeMap;

public enum ConfigurationType {

    DETECT(0),
    JSON(1),
    YAML(2),
    SERIALIZED(3),
    PROPERTIES(4),
    ENUMERATION(5);

    private final Integer type;
    private static final Map<String, ConfigurationType> format = new TreeMap<>();

    static {
        format.put("json", ConfigurationType.JSON);
        format.put("yaml", ConfigurationType.YAML);
        format.put("serialized", ConfigurationType.SERIALIZED);
        format.put("properties", ConfigurationType.PROPERTIES);
        format.put("enumeration", ConfigurationType.ENUMERATION);
    }

    ConfigurationType(Integer type) {
        this.type = type;
    }

    public static Map<String, ConfigurationType> getFormat() {
        return format;
    }

    public Integer getType() {
        return type;
    }
}
