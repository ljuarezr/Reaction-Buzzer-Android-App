package com.example.ljuarezr.ljuarezr_reflex;

/**
 * Created by ljuarezr on 10/2/15.
 */

public class QuadController {

    //Lazy Singleton
    private static QuadBuzzerCounts quadCounts = null;

    static public QuadBuzzerCounts getQuadCounts(){
        if (quadCounts == null) {
            quadCounts = new QuadBuzzerCounts();
        }
        return quadCounts;
    }

    public void incrementP1(){
        getQuadCounts().incrementP1();
    }

    public void incrementP2(){
        getQuadCounts().incrementP2();
    }

    public void incrementP3(){
        getQuadCounts().incrementP3();
    }

    public void incrementP4(){
        getQuadCounts().incrementP4();
    }

    public void clear(){
        getQuadCounts().clear();
    }
}
