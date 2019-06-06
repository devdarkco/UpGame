package com.devdarkco.up.graphics;

import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.devdarkco.up.Const;
import com.devdarkco.up.logic.PlayerStats;

public class Debug {

    public static void show(SpriteBatch batch) {
        BitmapFont font = new BitmapFont();

        font.draw(batch, "PlayerSpeed: " + PlayerStats.getSpeed(), 20, Const.H - 20);
    }
}
