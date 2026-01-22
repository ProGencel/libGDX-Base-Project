package com.myname.game.screens.gameScreen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.myname.game.entitiy.player.Player;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.myname.game.tools.MapManager;

public class DrawGameScreen{

    private MapManager mapManager;
    private Player player;

    private SpriteBatch batch;

    public DrawGameScreen(MapManager mapManager, Player player)
    {
        batch = new SpriteBatch();

        this.mapManager = mapManager;
        this.player = player;
    }

    public void drawGameScreen()
    {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        mapManager.draw(batch);
        player.draw(batch);
    }

}
