package com.myname.game.entitiy.player;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.Disposable;
import com.myname.game.entitiy.GameEntity;
import com.myname.game.interfaces.Drawable;

public class Player extends GameEntity implements Drawable, Disposable {

    private Texture texture;
    private TextureRegion textureRegion;


    public Player(AssetManager manager) {
        super(manager);

        texture = manager.get("Player/PlayerIdle.png");
        textureRegion = new TextureRegion(texture);
    }

    @Override
    public void draw(SpriteBatch batch) {

        batch.begin();

        batch.draw(textureRegion,10,10);

        batch.end();
    }

    @Override
    public void dispose() {
        texture.dispose();
    }
}
