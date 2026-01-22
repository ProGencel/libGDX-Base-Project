package com.myname.game.entitiy.player;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.myname.game.interfaces.Renderable;

public class PlayerInputHandler implements Renderable {

    public PlayerState playerState;

    public PlayerInputHandler()
    {
        playerState = PlayerState.RIGHT;
    }

    @Override
    public void render(float dt) {
        if(Gdx.input.isKeyPressed(Input.Keys.W))
        {

        }
        if(Gdx.input.isKeyPressed(Input.Keys.W))
        {

        }
        if(Gdx.input.isKeyPressed(Input.Keys.W))
        {

        }
        if(Gdx.input.isKeyPressed(Input.Keys.W))
        {

        }
    }
}
