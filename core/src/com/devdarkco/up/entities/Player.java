package com.devdarkco.up.entities;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.devdarkco.up.logic.PlayerMovement;
import com.devdarkco.up.logic.PlayerStats;

public class Player extends Entity {

    private Sprite texture;
    private PlayerMovement playerMovement;

    public Player(float x, float y) {
        super(x, y);
        PlayerStats.loadStats();
        this.texture = new Sprite(new Texture("badlogic.jpg"));
        this.playerMovement = new PlayerMovement(this);
    }

    @Override
    public void render(SpriteBatch batch) {
        super.render(batch);
        batch.draw(this.texture, getPosition().x, getPosition().y);
    }

    @Override
    public void update(float delta) {
        super.update(delta);
        this.playerMovement.update();
    }
}
