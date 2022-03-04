package com.github.solymus.configuration;

import java.io.File;
import java.io.InputStream;
import java.util.LinkedHashMap;

public class Configuration {

    protected ConfigurationType configurationType;
    protected ConfigurationSection configurationSection;

    private ConfigurationType type = ConfigurationType.DETECT;

    private boolean isCorrect = false;
    private File file;

    /**
     * Constructor for Configuration instance with undefined file object
     *
     * @param type - Configuration Type
     */
    public Configuration(ConfigurationType type) {
        this.type = type;
        this.isCorrect = true;
        this.configurationSection = new ConfigurationSection();
    }

    public Configuration() {
        this(ConfigurationType.YAML);
    }

    public Configuration(String file) {
        this(file, ConfigurationType.DETECT);
    }

    public Configuration(File file) {
        this(file.toString(), ConfigurationType.DETECT);
    }

    public Configuration(String file, ConfigurationType type) {
        this(file, type, new ConfigurationSection());
    }

    public Configuration(File file, ConfigurationType type) {
        this(file.toString(), type, new ConfigurationSection());
    }

    @Deprecated
    public Configuration(String file, ConfigurationType type, LinkedHashMap<String, Object> defaultValues) {
        this(file, type, new ConfigurationSection(defaultValues));
    }

    @Deprecated
    public Configuration(File file, ConfigurationType type, LinkedHashMap<String, Object> defaultValues) {
        this(file.toString(), type, new ConfigurationSection(defaultValues));
    }

    public Configuration(String file, ConfigurationType type, ConfigurationSection defaultValues) {
        this.load(file, type, defaultValues);
    }

    public Configuration(File file, ConfigurationType type, ConfigurationSection defaultValues) {
        this.load(file.toString(), type, defaultValues);
    }

    public void reload() {
        this.configurationSection.clear();
        this.isCorrect = false;
        if (this.file == null)
            throw new IllegalStateException("Failed to load Configuration file. File Object is undefined.");
        this.load(this.file.toString(), this.type);
    }

    public boolean load(String file, ConfigurationType type) {
        return this.load(file, type, new ConfigurationSection());
    }

    public boolean load(String file) {
        return this.load(file, ConfigurationType.DETECT);
    }

    private boolean load(String file, ConfigurationType type, ConfigurationSection defaultValues) {
        return true;
    }

    public boolean load(InputStream stream) {
        return true;
    }

}
