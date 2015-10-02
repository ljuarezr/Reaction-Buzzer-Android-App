package com.example.ljuarezr.ljuarezr_reflex;

import static junit.framework.Assert.assertTrue;

/**
 * Created by ljuarezr on 9/28/15.
 */
public class  GameBuzz  {
    private int winner;

    public void setWinner(int i){
        assertTrue ((i == 1) || (i == 2) ||
                (i == 3) || (i == 4));
        winner = i;
    }

    public int getWinner(){
        return winner;
    }

}
