package com.devdarkco.up.util;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;

public class Util {

    public static void renderColor(float r, float g, float b, float alpha){
        Gdx.gl.glClearColor(r, g, b, alpha);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    }

    public static void log(String text){
        Gdx.app.log("LOG", text);
    }
}
