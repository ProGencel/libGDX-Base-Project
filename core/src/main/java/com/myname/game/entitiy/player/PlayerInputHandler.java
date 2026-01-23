package com.myname.game.entitiy.player;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.myname.game.interfaces.UpdateAble;
import com.myname.game.utils.Constants;

public class PlayerInputHandler implements UpdateAble {

    public PlayerState playerState;
    private Player player;

    public PlayerInputHandler(Player player)
    {
        playerState = PlayerState.RIGHT;
        this.player = player;
    }

    @Override
    public void update(float dt) {
        if(Gdx.input.isKeyPressed(Input.Keys.W))
        {
            player.getPosition().y += Constants.PLAYER_SPEED * dt;
        }
        if(Gdx.input.isKeyPressed(Input.Keys.S))
        {
            player.getPosition().y -= Constants.PLAYER_SPEED * dt;
        }
        if(Gdx.input.isKeyPressed(Input.Keys.A))
        {
            player.getPosition().x -= Constants.PLAYER_SPEED * dt;
        }
        if(Gdx.input.isKeyPressed(Input.Keys.D))
        {
            player.getPosition().x += Constants.PLAYER_SPEED * dt;
        }
    }
}
