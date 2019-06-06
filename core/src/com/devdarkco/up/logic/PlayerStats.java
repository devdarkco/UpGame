package com.devdarkco.up.logic;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Preferences;

public class PlayerStats {

    private static final String PLAYER_STATS = "player_stats";

    private static float SPEED = 1;
    private static final String SPEED_KEY = "speed";

    public static void saveStats() {
        Preferences preferences = Gdx.app.getPreferences(PLAYER_STATS);

        preferences.putFloat(SPEED_KEY, SPEED);

        preferences.flush();
    }

    public static void loadStats() {
        Preferences preferences = Gdx.app.getPreferences(PLAYER_STATS);

        preferences.getFloat(SPEED_KEY, SPEED);
    }

    public static void setSpeed(float amount) {
        SPEED = amount;
        saveStats();
    }

    public static float getSpeed() {
        return Gdx.app.getPreferences(PLAYER_STATS).getFloat(SPEED_KEY, SPEED);
    }
}
