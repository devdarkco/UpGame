package com.devdarkco.up.screen;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.devdarkco.up.UpGame;
import com.devdarkco.up.entities.Player;
import com.devdarkco.up.graphics.Debug;
import com.devdarkco.up.util.InputManager;
import com.devdarkco.up.util.Util;

public class TestScreen extends ScreenAdapter {

    public UpGame upGame;

    private SpriteBatch batch;

    private Player player;

    public TestScreen(UpGame upGame) {
        this.upGame = upGame;
        player = new Player(0, 0);
        this.batch = new SpriteBatch();
    }

    @Override
    public void show() {
        super.show();
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        Util.renderColor(1, 0, 0, 1);
        batch.begin();
        player.update(delta);
        player.render(batch);


        Debug.show(batch);

        batch.end();
    }

    @Override
    public void hide() {
        super.hide();
    }

    @Override
    public void dispose() {
        super.dispose();
        batch.dispose();
    }
}
