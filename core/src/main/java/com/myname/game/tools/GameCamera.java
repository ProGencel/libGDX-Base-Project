package com.myname.game.tools;

import static com.myname.game.utils.Constants.*;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;


public class GameCamera {

    public OrthographicCamera orthographicCamera;

    private Viewport viewport;

    public GameCamera()
    {
        orthographicCamera = new OrthographicCamera(20,20*((float) SCREEN_HEIGHT /SCREEN_WIDTH));
        orthographicCamera.position.set     //Kamerayi ortalamak icin
            (orthographicCamera.viewportWidth/2f,orthographicCamera.viewportHeight/2f,0);

        orthographicCamera.update();

        viewport = new FitViewport(SCREEN_WIDTH,SCREEN_HEIGHT);
    }

    public void viewportUpdate(int width,int height)
    {
        viewport.update(width, height);
    }
}
