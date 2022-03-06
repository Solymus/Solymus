package com.github.solymus.achievement;

public class Achievement {

    public final String name;
    public final String[] requirements;

    public Achievement(String name, String[] requirements) {
        this.name = name;
        this.requirements = requirements;
    }

    public String getName() {
        return name;
    }

    public String[] getRequirements() {
        return requirements;
    }

}
