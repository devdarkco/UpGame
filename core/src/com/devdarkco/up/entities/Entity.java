package com.devdarkco.up.entities;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class Entity {

    private Vector2 position, velocity;

    public Entity(float x, float y) {
        this.position = new Vector2(x, y);
        this.velocity = Vector2.Zero;
    }

    public void update(float delta){

    }

    public void render(SpriteBatch batch){

    }

    public float getX(){
        return this.position.x;
    }

    public float getY(){
        return this.position.y;
    }

    public Vector2 getPosition() {
        return position;
    }

    public void setPosition(float x, float y){
        this.position.set(x, y);
    }

    public float getVelX(){
        return this.velocity.x;
    }

    public float getVElY(){
        return this.velocity.y;
    }

    public Vector2 getVelocity() {
        return velocity;
    }

    public void setVelocity(float x, float y){
        this.velocity.set(x, y);
    }
}
