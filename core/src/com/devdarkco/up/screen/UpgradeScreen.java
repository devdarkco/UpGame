package com.devdarkco.up.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.devdarkco.up.Const;
import com.devdarkco.up.UpGame;
import com.devdarkco.up.entities.Player;
import com.devdarkco.up.graphics.Assets;
import com.devdarkco.up.graphics.Debug;
import com.devdarkco.up.logic.player.PlayerStats;
import com.devdarkco.up.util.Util;

public class UpgradeScreen extends ScreenAdapter {

    private UpGame game;

    private SpriteBatch batch;

    private Stage stage;
    private TextButton goBack = new TextButton("Back", Assets.SKIN);
    private TextButton addSpeed = new TextButton("Increase Speed", Assets.SKIN);

    public UpgradeScreen(final UpGame game){
        this.game = game;

        batch = new SpriteBatch();

        this.stage = new Stage();
        goBack.setBounds(Const.W - 110, Const.H - 90, 100, 80);
        addSpeed.setBounds(Const.W/2 - 50, Const.H/2 - 40, 100, 80);
        stage.addActor(goBack);
        stage.addActor(addSpeed);

        ClickListener clickListener = new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                super.clicked(event, x, y);
                if(event.getListenerActor() == goBack){
                    game.setScreen(new TestScreen(game));
                } else if(event.getListenerActor() == addSpeed){
                    PlayerStats.setSpeed(PlayerStats.getSpeed()+0.2f);
                    PlayerStats.saveStats();
                }
            }
        };

        goBack.addListener(clickListener);
        addSpeed.addListener(clickListener);
    }

    @Override
    public void show() {
        super.show();
        Gdx.input.setInputProcessor(stage);
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        Util.renderColor(1, 1, 0, 1);
        stage.draw();

        batch.begin();
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
    }
}
