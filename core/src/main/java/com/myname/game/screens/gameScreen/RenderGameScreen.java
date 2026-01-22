package com.myname.game.screens.gameScreen;

import com.myname.game.tools.GameCamera;
import com.myname.game.tools.MapManager;

public class RenderGameScreen {

    private MapManager mapManager;
    private GameCamera gameCamera;

    public RenderGameScreen(MapManager mapManager, GameCamera gameCamera)
    {
        this.gameCamera = gameCamera;
        this.mapManager = mapManager;
    }

    public void renderGameScreen(float dt)
    {
        mapManager.orthogonalTiledMapRenderer.setView(gameCamera.orthographicCamera);

        gameCamera.orthographicCamera.update();
    }

}
