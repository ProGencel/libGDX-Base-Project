package com.myname.game.entitiy.player;

import com.badlogic.gdx.maps.MapObject;
import com.badlogic.gdx.maps.objects.PointMapObject;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.myname.game.entitiy.EntityFactory;

public class PlayerFactory {

    private float playerBegX;
    private float playerBegY;

    private PointMapObject pointMapObject;

    public PlayerFactory(EntityFactory factory)
    {
        setPlayer(factory);
    }

    public void setPlayer(EntityFactory factory)
    {
        pointMapObject = (PointMapObject) factory.findEntity("Player","EntityReferences");
        try
        {
            playerBegX = pointMapObject.getPoint().x;
            playerBegY = pointMapObject.getPoint().y;

        }catch (Exception e)
        {
            System.out.println("Player cant set \n Error : " +  e);
        }



    }

}
