package com.myname.game.tools;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.myname.game.interfaces.Drawable;
import com.myname.game.utils.Constants;

public class MapManager implements Drawable {

    private TiledMap tiledMap;
    public OrthogonalTiledMapRenderer orthogonalTiledMapRenderer;

    public MapManager(AssetManager manager)
    {
        tiledMap = manager.get("World/world.tmx");
        orthogonalTiledMapRenderer = new OrthogonalTiledMapRenderer(tiledMap,1/ Constants.PPM);
    }

    @Override
    public void draw() {
        orthogonalTiledMapRenderer.render();
    }
}
