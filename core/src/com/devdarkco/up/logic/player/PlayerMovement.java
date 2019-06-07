package com.devdarkco.up.logic.player;

import com.badlogic.gdx.Input;
import com.devdarkco.up.entities.Player;
import com.devdarkco.up.util.InputManager;

public class PlayerMovement {

    private Player player;

    private float speed, sprintModifier;
    private boolean hasSprint;

    public PlayerMovement(Player player) {
        this.player = player;
        loadStats();
    }

    public void update() {
        player.getPosition().add(player.getVelocity());
        moveXAxis();
        if(InputManager.justPressedKey(Input.Keys.E)){
            PlayerStats.setHasSprintHability(true);
        }
    }

    public void loadStats(){
        this.speed = PlayerStats.getSpeed();
        this.sprintModifier = PlayerStats.getSprintModifier();
        this.hasSprint = PlayerStats.hasSprintHability();
    }

    public void moveXAxis() {
        if (InputManager.isPressingKey(Input.Keys.A)) {
            if(isSprinting()){
                player.setVelocity((-speed * sprintModifier), player.getVElY());
            } else {
                player.setVelocity(-speed, player.getVElY());
            }
        } else if (InputManager.isPressingKey(Input.Keys.D)) {
            if(isSprinting()){
                player.setVelocity((speed * sprintModifier), player.getVElY());
            } else {
                player.setVelocity(speed, player.getVElY());
            }
        } else {
            player.setVelocity(0, 0);
        }
    }

    public boolean isSprinting(){
        return hasSprint && InputManager.isPressingKey(Input.Keys.SHIFT_LEFT);
    }
}
