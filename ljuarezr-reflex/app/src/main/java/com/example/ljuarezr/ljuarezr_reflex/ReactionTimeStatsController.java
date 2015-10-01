package com.example.ljuarezr.ljuarezr_reflex;

import java.util.List;

/**
 * Created by ljuarezr on 10/1/15.
 */
public class ReactionTimeStatsController {

    //Lazy Singleton
    private static ReactionTimesList  reactionTimesList = null;
    static public ReactionTimesList getReactionTimesList() {
        if (reactionTimesList == null){
            reactionTimesList = new ReactionTimesList();
        }
        return reactionTimesList;
    }

    public ReactionTimesList chooseMinimum(){
        return getReactionTimesList().
    }



}
