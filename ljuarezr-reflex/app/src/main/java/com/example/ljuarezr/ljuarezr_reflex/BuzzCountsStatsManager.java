package com.example.ljuarezr.ljuarezr_reflex;

/**
 * Created by ljuarezr on 10/1/15.
 */
public class BuzzCountsStatsManager {
    private static DoubleBuzzerCountsList  doubleBuzzerCountsList = null;
    static public DoubleBuzzerCountsList getDoubleBuzzerCountsList() {
        if (doubleBuzzerCountsList == null){
            doubleBuzzerCountsList = new DoubleBuzzerCountsList();
        }
        return doubleBuzzerCountsList;
    }

    private static TripleBuzzerCountsList  tripleBuzzerCountsList = null;
    static public  TripleBuzzerCountsList getTripleBuzzerCountsList() {
        if ( tripleBuzzerCountsList == null){
            tripleBuzzerCountsList = new  TripleBuzzerCountsList();
        }
        return  tripleBuzzerCountsList;
    }

    private static QuadBuzzerCountsList  quadBuzzerCountsList = null;
    static public QuadBuzzerCountsList getQuadBuzzerCountsList() {
        if ( quadBuzzerCountsList == null){
            quadBuzzerCountsList = new  QuadBuzzerCountsList();
        }
        return  quadBuzzerCountsList;
    }
}
