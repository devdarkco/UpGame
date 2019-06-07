package com.devdarkco.up.logic.player;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Preferences;

public class PlayerStats {

    private static final String PLAYER_STATS = "player_stats";

    private static float SPEED = 5;
    private static final String SPEED_KEY = "speed";

    //Habilities
    private static boolean HAS_SPRINT_HABILITY = false;
    private static final String HAS_SPRINT_HABILITY_KEY = "has_sprint_hability";
    private static float SPRINT_MODIFIER = 2;
    private static final String SPRINT_MODIFIER_KEY = "speed_modifier";

    public static void saveStats() {
        Preferences preferences = Gdx.app.getPreferences(PLAYER_STATS);

        preferences.putFloat(SPEED_KEY, SPEED);
        preferences.putFloat(SPRINT_MODIFIER_KEY, SPRINT_MODIFIER);
        preferences.putBoolean(HAS_SPRINT_HABILITY_KEY, HAS_SPRINT_HABILITY);

        preferences.flush();
    }

    public static void reset() {
        Preferences preferences = Gdx.app.getPreferences(PLAYER_STATS);

        preferences.putFloat(SPEED_KEY, 5);
        preferences.putFloat(SPRINT_MODIFIER_KEY, 2);
        preferences.putBoolean(HAS_SPRINT_HABILITY_KEY, false);

        preferences.flush();
    }

    public static void loadStats() {
        Preferences preferences = Gdx.app.getPreferences(PLAYER_STATS);

        preferences.getFloat(SPEED_KEY, SPEED);
        preferences.getFloat(SPRINT_MODIFIER_KEY, SPRINT_MODIFIER);
        preferences.getBoolean(HAS_SPRINT_HABILITY_KEY, HAS_SPRINT_HABILITY);
    }

    public static void setSpeed(float amount) {
        SPEED = amount;
    }

    public static float getSpeed() {
        return Gdx.app.getPreferences(PLAYER_STATS).getFloat(SPEED_KEY, SPEED);
    }

    public static float getSprintModifier() {
        return Gdx.app.getPreferences(PLAYER_STATS).getFloat(SPRINT_MODIFIER_KEY, SPRINT_MODIFIER);
    }

    public static void setSprintModifier(float sprintModifier) {
        SPRINT_MODIFIER = sprintModifier;
    }

    public static void setHasSprintHability(boolean has){
        HAS_SPRINT_HABILITY = has;
    }

    public static boolean hasSprintHability(){
        return Gdx.app.getPreferences(PLAYER_STATS).getBoolean(HAS_SPRINT_HABILITY_KEY, HAS_SPRINT_HABILITY);
    }
}
