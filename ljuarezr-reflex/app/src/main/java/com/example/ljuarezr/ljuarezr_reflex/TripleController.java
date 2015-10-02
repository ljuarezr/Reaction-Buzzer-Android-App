package com.example.ljuarezr.ljuarezr_reflex;

/**
 * Created by ljuarezr on 10/2/15.
 */
public class TripleController {
    //Lazy Singleton
    private static TripleBuzzerCounts tripleCounts = null;

    static public TripleBuzzerCounts getTripleCounts(){
        if (tripleCounts == null) {
            tripleCounts = new TripleBuzzerCounts();
        }
        return tripleCounts;
    }

    public void incrementP1(){
        getTripleCounts().incrementP1();
    }

    public void incrementP2(){
        getTripleCounts().incrementP2();
    }

    public void incrementP3(){
        getTripleCounts().incrementP3();
    }


    public void clear(){
        getTripleCounts().clear();
    }
}