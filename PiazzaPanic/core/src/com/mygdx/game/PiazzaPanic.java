package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.Screens.MainMenuScreen;

public class PiazzaPanic extends Game {
    public final int GAME_HEIGHT = 720;
    public final int GAME_WIDTH = 1280;
    public SpriteBatch batch;
    //private FitViewport fit;

    @Override
    public void create() {
        batch = new SpriteBatch();
        //fit = new FitViewport(GAME_WIDTH, GAME_HEIGHT);
        this.setScreen(new MainMenuScreen(this));
    }

    @Override
    public void render() {
        super.render();
    }

    @Override
    public void dispose() {
        batch.dispose();
    }
}
