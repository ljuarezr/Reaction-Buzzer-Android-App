package com.example.ljuarezr.ljuarezr_reflex;

/**
 * Created by ljuarezr on 10/1/15.
 */
public class TripleBuzzerCounts {
    private int p1;
    private int p2;
    private int p3;

    public TripleBuzzerCounts(){
        p1 = 0;
        p2 = 0;
        p3 = 0;
    }

    public void incrementP1(){
        p1 = p1 +1;
    }

    public void incrementP2(){
        p2 = p2 +1;
    }
    public void incrementP3(){
        p3 = p3 +1;
    }
    public void clear(){
        p1 = 0;
        p2 = 0;
        p3 = 0;
    }
}

