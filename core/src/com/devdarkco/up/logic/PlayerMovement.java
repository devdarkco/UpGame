package com.devdarkco.up.logic;

import com.badlogic.gdx.Input;
import com.devdarkco.up.entities.Player;
import com.devdarkco.up.util.InputManager;
import com.devdarkco.up.util.Util;

public class PlayerMovement {

    private Player player;

    public PlayerMovement(Player player) {
        this.player = player;
    }

    public void update() {
        player.getPosition().add(player.getVelocity());
        moveLeft();
        moveRight();
    }

    public void moveLeft() {
        if (InputManager.isPressingKey(Input.Keys.A)) {
            player.setVelocity(-PlayerStats.getSpeed(), player.getVElY());
        }
    }

    public void moveRight() {
        if (InputManager.isPressingKey(Input.Keys.D)) {
            player.setVelocity(PlayerStats.getSpeed(), player.getVElY());
        }
    }
}
