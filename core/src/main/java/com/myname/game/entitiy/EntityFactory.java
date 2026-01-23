package com.myname.game.entitiy;

import com.badlogic.gdx.maps.MapObject;
import com.badlogic.gdx.maps.objects.PointMapObject;
import com.badlogic.gdx.maps.tiled.TiledMap;

public class EntityFactory {

    private TiledMap tiledMap;

    public EntityFactory(TiledMap tiledMap)
    {
        this.tiledMap = tiledMap;
    }

    public MapObject findEntity(String wantedClass, String wantedLayer)
    {
        for(MapObject object : tiledMap.getLayers().get(wantedLayer).getObjects().getByType(PointMapObject.class))
        {
            String objectType = object.getProperties().get("type", String.class);


            if(wantedClass.equals(objectType))
            {
                return object;
            }
        }

        return null;
    }

}
