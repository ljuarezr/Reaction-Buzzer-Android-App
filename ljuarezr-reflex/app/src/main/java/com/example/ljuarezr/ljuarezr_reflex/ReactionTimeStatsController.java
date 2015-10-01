package com.example.ljuarezr.ljuarezr_reflex;

import java.util.List;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

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


    public void clearAll(){
        getReactionTimesList().clearAll();
    }

    public void addSingleBuzz(SingleBuzz singleBuzz) {
        getReactionTimesList().addSingleBuzz(singleBuzz);
    }

    public List<SingleBuzz> getLast10 () {
        return getReactionTimesList().getLast10();
    }

    public List<SingleBuzz> getLast100 () {
        return getReactionTimesList().getLast100();
    }

    public List<SingleBuzz> getAllTime() {
        return getReactionTimesList().getAllTime();
    }

}
