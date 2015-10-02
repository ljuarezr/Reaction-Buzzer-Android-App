package com.example.ljuarezr.ljuarezr_reflex;

/**
 * Created by ljuarezr on 9/28/15.
 */

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
public class SingleBuzz {

    private int delay;

    public void CreateSingleBuzz(int delayTime){
        assertTrue(delayTime > 0);
        delay = delayTime;
    }

    public int getDelay(){
        return this.delay;
    }
}
