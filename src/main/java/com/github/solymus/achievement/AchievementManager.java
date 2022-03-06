package com.github.solymus.achievement;

import com.github.solymus.player.Player;

import java.util.HashMap;
import java.util.Map;

public class AchievementManager {

    private static AchievementManager instance;

    public static AchievementManager getInstance() {
        return instance;
    }

    public final Map<String, Achievement> achievementMap;

    public AchievementManager() {
        instance = this;
        this.achievementMap = new HashMap<>();
    }

    public boolean addAchievement(String name, Achievement achievement) {
        if (this.achievementMap.containsKey(name)) return false;
        this.achievementMap.put(name, achievement);
        return true;
    }

    public boolean broadcastAchievement(Player player, String achievementName) {
        if (!this.achievementMap.containsKey(achievementName)) return false;
        // TODO: need Server things here....
        return true;
    }

    public void loadAchievements() {
        // TODO: Load achievements from json/yaml file.
    }

    public void saveAchievements() {
        // TODO: Load achievements to json/yaml file.
    }

}
