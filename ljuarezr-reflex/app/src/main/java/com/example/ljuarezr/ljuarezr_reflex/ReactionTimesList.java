package com.example.ljuarezr.ljuarezr_reflex;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

/**
 * Created by ljuarezr on 9/28/15.
 */
public class ReactionTimesList {

    private List<SingleBuzz> reactionStatList = new ArrayList<SingleBuzz>();

    public void clearall(){
        reactionStatList.clear();
        assertEquals(0, reactionStatList.size());
    }

    public void addSingleBuzz(SingleBuzz singleBuzz) {
        reactionStatList.add(singleBuzz);
        assertTrue(reactionStatList.contains(singleBuzz));
    }

    public List<SingleBuzz> getLast10 () {
        //Two cases:
        //Case 1. the list has 10 or more items
        //Then just get the last ten items
        if (reactionStatList.size() >= 10) {
            List<SingleBuzz> last10list;
            last10list = reactionStatList.subList((reactionStatList.size() - 10),
                    (reactionStatList.size() - 1));
            //want to return an ArrayList, not a List!!
            return last10list;
        } else {
            //Case 2. the list has less than 10 items (even 0)
            //Return the list as is, if we add 0s to fill the missing values,
            //we would skew the final stat values
            return reactionStatList;
        }
    }

    public List<SingleBuzz> getLast100() {
        //Two cases:
        //Case 1. the list has 10 or more items
        //Then just get the last 100 items
        if (reactionStatList.size() >= 100) {
            List<SingleBuzz> last100list;
            last100list = reactionStatList.subList((reactionStatList.size() - 100),
                    (reactionStatList.size() - 1));
            //want to return an ArrayList, not a List!!
            return last100list;
        } else {
            //Case 2. the list has less than 100 items (even 0)
            //Return the list as is, if we add 0s to fill the missing values,
            //we would skew the final stat values
            return reactionStatList;
        }
    }

    public List<SingleBuzz> getAllTime(){
        return reactionStatList;
    }




}
