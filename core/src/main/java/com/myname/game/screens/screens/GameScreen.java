package com.myname.game.screens.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.GL20;
import com.myname.game.tools.GameCamera;
import com.myname.game.tools.MapManager;


public class GameScreen implements Screen {

    private MapManager mapManager;
    private GameCamera gameCamera;

    public GameScreen(AssetManager assetManager)
    {
        mapManager = new MapManager(assetManager);
        gameCamera = new GameCamera();
    }

    @Override
    public void show() {

    }

    public void draw()
    {
        mapManager.draw();
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        mapManager.orthogonalTiledMapRenderer.setView(gameCamera.orthographicCamera);

        gameCamera.orthographicCamera.update();
        draw();
    }

    @Override
    public void resize(int width, int height) {
        gameCamera.viewportUpdate(width, height);
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
