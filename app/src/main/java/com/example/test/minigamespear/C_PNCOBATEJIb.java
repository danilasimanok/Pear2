package com.example.test.minigamespear;

/**
 * Created by Андрей on 21.06.2017.
 */

public class C_PNCOBATEJIb extends PNCOBATEJIb {
    static double x0,y0,sh;
    public static void newC_PNCOBATEJIb(float w,float h){
        double wSh=w/16,
                hSh=h/9;
        C_PNCOBATEJIb.sh=Math.min(wSh,hSh);
        C_PNCOBATEJIb.x0=w/2;
        C_PNCOBATEJIb.y0=h/2;
    }
    public static float xToP(double x){
        return (float)(x*sh+x0);
    }
    public static float yToP(double y){
        return (float)(y0-y*sh);
    }
    public static float rToP(double r){
        return (float)(r*sh);
    }
    public static double pToX(float x){
        return (x-x0)/sh;
    }
    public static double pToY(float y){
        return (y0-y)/sh;
    }
    public static double pToR(float r){
        return r/sh;
    }
}
