package com.example.ljuarezr.ljuarezr_reflex;

import java.util.ArrayList;
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

    public List<Integer> getMin() throws EmptyReactionTimesListException{;
        List<Integer> mins = new ArrayList<>();
        mins.add(getReactionTimesList().getMin(getReactionTimesList().getLast10()));
        mins.add(getReactionTimesList().getMin(getReactionTimesList().getLast100()));
        mins.add(getReactionTimesList().getMin(getReactionTimesList().getAllTime()));
        return mins;
    }

    public List<Integer> getMax() throws EmptyReactionTimesListException{;
        List<Integer> maxs = new ArrayList<>();
        maxs.add(getReactionTimesList().getMin(getReactionTimesList().getLast10()));
        maxs.add(getReactionTimesList().getMin(getReactionTimesList().getLast100()));
        maxs.add(getReactionTimesList().getMin(getReactionTimesList().getAllTime()));
        return maxs;
    }

    public List<Integer> getAvg() throws EmptyReactionTimesListException{;
        List<Integer> avgs = new ArrayList<>();
        avgs.add(getReactionTimesList().getMin(getReactionTimesList().getLast10()));
        avgs.add(getReactionTimesList().getMin(getReactionTimesList().getLast100()));
        avgs.add(getReactionTimesList().getMin(getReactionTimesList().getAllTime()));
        return avgs;
    }

    public List<Integer> getMed() throws EmptyReactionTimesListException{;
        List<Integer> meds = new ArrayList<>();
        meds.add(getReactionTimesList().getMin(getReactionTimesList().getLast10()));
        meds.add(getReactionTimesList().getMin(getReactionTimesList().getLast100()));
        meds.add(getReactionTimesList().getMin(getReactionTimesList().getAllTime()));
        return meds;
    }

}
