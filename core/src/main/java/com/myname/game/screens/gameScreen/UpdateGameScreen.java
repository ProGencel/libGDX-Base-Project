package com.myname.game.screens.gameScreen;

import com.myname.game.entitiy.player.Player;
import com.myname.game.tools.GameCamera;
import com.myname.game.tools.MapManager;

public class UpdateGameScreen {

    private MapManager mapManager;
    private GameCamera gameCamera;
    private Player player;

    public UpdateGameScreen(MapManager mapManager, GameCamera gameCamera, Player player)
    {
        this.gameCamera = gameCamera;
        this.mapManager = mapManager;
        this.player = player;
    }

    public void updateGameScreen(float dt)
    {
        gameCamera.cameraUpdate(player);

        mapManager.orthogonalTiledMapRenderer.setView(gameCamera.orthographicCamera);

        gameCamera.orthographicCamera.update();
    }

}
