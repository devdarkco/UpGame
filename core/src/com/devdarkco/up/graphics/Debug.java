package com.devdarkco.up.graphics;

import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.devdarkco.up.Const;
import com.devdarkco.up.logic.player.PlayerStats;

public class Debug {

    public static void show(SpriteBatch batch) {
        BitmapFont font = new BitmapFont();

        font.draw(batch, "PlayerSpeed: " + PlayerStats.getSpeed(), 20, Const.H - 20);
        font.draw(batch, "PlayerHasSprint: " + PlayerStats.hasSprintHability(), 20, Const.H - 40);
        font.draw(batch, "PlayerSprintModifier: " + PlayerStats.getSprintModifier(), 20, Const.H - 60);
        font.draw(batch, "PlayerSpeedIfSprinting: " + (PlayerStats.getSprintModifier()*PlayerStats.getSpeed()), 20, Const.H - 80);
    }
}
