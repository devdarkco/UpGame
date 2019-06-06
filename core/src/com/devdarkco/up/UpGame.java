package com.devdarkco.up;

import com.badlogic.gdx.Game;
import com.devdarkco.up.logic.PlayerStats;
import com.devdarkco.up.screen.TestScreen;

public class UpGame extends Game {

    @Override
    public void create() {
        setScreen(new TestScreen(this));

        PlayerStats.loadStats();
    }

    @Override
    public void render() {
        super.render();
    }

    @Override
    public void dispose() {
    }
}
