package com.myname.game.tools;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.utils.Disposable;
import com.myname.game.interfaces.Drawable;
import com.myname.game.utils.Constants;

public class MapManager implements Drawable, Disposable {

    private TiledMap tiledMap;
    public OrthogonalTiledMapRenderer orthogonalTiledMapRenderer;

    public MapManager(AssetManager manager)
    {
        tiledMap = manager.get("World/world.tmx");
        orthogonalTiledMapRenderer = new OrthogonalTiledMapRenderer(tiledMap,Constants.PPM);
    }

    @Override
    public void draw(SpriteBatch batch) {
        orthogonalTiledMapRenderer.render();
    }

    @Override
    public void dispose() {
        orthogonalTiledMapRenderer.dispose();
    }
}
