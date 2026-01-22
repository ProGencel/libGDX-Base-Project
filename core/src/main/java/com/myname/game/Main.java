package com.myname.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.myname.game.screens.screens.GameScreen;

public class Main extends Game {

    private AssetManager assetManager;
    private TmxMapLoader mapLoader;

    @Override
    public void create() {
        assetManager = new AssetManager();
        mapLoader = new TmxMapLoader();

        loadAssets();

        setScreen(new GameScreen(assetManager));
    }

    private void loadAssets()
    {
        assetManager.setLoader(TiledMap.class,mapLoader);
        assetManager.load("World/world.tmx", TiledMap.class);

        assetManager.finishLoading();
    }
}
