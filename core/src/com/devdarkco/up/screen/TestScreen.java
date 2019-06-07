package com.devdarkco.up.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.devdarkco.up.UpGame;
import com.devdarkco.up.entities.Player;
import com.devdarkco.up.graphics.Assets;
import com.devdarkco.up.graphics.Debug;
import com.devdarkco.up.logic.player.PlayerStats;
import com.devdarkco.up.util.InputManager;
import com.devdarkco.up.util.Util;

public class TestScreen extends ScreenAdapter {

    public UpGame upGame;

    private SpriteBatch batch;

    private Player player;

    private Stage stage;
    private TextButton increaseSpeedModifier;

    public TestScreen(UpGame upGame) {
        this.upGame = upGame;
        player = new Player(0, 0);
        this.batch = new SpriteBatch();
        stage = new Stage();
        increaseSpeedModifier = new TextButton("This is ", Assets.SKIN);
        increaseSpeedModifier.setBounds(20, 100, 100, 75);

        stage.addActor(increaseSpeedModifier);
    }

    @Override
    public void show() {
        super.show();
        Gdx.input.setInputProcessor(stage);
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        Util.renderColor(1, 0, 0, 1);

        stage.draw();
        batch.begin();
        player.update(delta);
        player.render(batch);

        if(increaseSpeedModifier.isPressed()){
            upGame.setScreen(new UpgradeScreen(upGame));
        }

        if(InputManager.justPressedKey(Input.Keys.I)){
            PlayerStats.reset();
            PlayerStats.loadStats();
        }

        Debug.show(batch);

        batch.end();
    }

    @Override
    public void hide() {
        super.hide();
        Gdx.input.setInputProcessor(null);
    }

    @Override
    public void dispose() {
        super.dispose();
        batch.dispose();
    }
}
