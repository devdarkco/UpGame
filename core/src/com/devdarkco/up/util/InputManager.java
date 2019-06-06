package com.devdarkco.up.util;

import com.badlogic.gdx.Gdx;

public class InputManager {

    public static boolean isPressingKey(int keyCode){
        return Gdx.input.isKeyPressed(keyCode);
    }

    public static boolean justPressedKey(int keyCode){
        return Gdx.input.isKeyJustPressed(keyCode);
    }
}
