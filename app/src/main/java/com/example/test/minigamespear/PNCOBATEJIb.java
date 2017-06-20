package com.example.test.minigamespear;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;

/**
 * Created by Андрей on 19.05.2017.
 */

public class PNCOBATEJIb {
    static boolean horizontal;
    static double sh,otst,w,h;
    public static void newPNCOBATEJIb(double w,double h){
        PNCOBATEJIb.w=w;
        PNCOBATEJIb.h=h;
        PNCOBATEJIb.horizontal=(w/16)>(h/9);
        if(PNCOBATEJIb.horizontal){
            PNCOBATEJIb.sh=(h/9);
            PNCOBATEJIb.otst=(w-PNCOBATEJIb.sh*16)/2;
        }else {
            PNCOBATEJIb.sh=(w/16);
            PNCOBATEJIb.otst=(h-PNCOBATEJIb.sh*9)/2;
        }
    }
    public static float xToP(double x){
        if(PNCOBATEJIb.horizontal)return (float)(PNCOBATEJIb.otst+x*PNCOBATEJIb.sh);
        else return (float)(PNCOBATEJIb.sh*x);
    }
    public static float yToP(double y){
        if(PNCOBATEJIb.horizontal)return (float)(-y*sh+PNCOBATEJIb.h);
        else return (float)(PNCOBATEJIb.h-(PNCOBATEJIb.otst+y*PNCOBATEJIb.sh));
    }
    public static double pToX(float x){
        if(PNCOBATEJIb.horizontal)return (x-PNCOBATEJIb.otst*PNCOBATEJIb.sh);
        else return x/PNCOBATEJIb.sh;
    }
    public static double pToY(float y){
        if(PNCOBATEJIb.horizontal)return (PNCOBATEJIb.h-y)/PNCOBATEJIb.sh;
        else return (PNCOBATEJIb.h-y-PNCOBATEJIb.otst)/PNCOBATEJIb.sh;
    }
    public static float rToP(double r){
        return (float)(r*PNCOBATEJIb.sh);
    }
    public static void draw(Canvas canvas){
        float l,t,r,b;
        Paint paint=new Paint(0xff0000ff);
        if(PNCOBATEJIb.horizontal){
            l=(float) PNCOBATEJIb.otst;
            t=0;
            r=(float)(PNCOBATEJIb.w-PNCOBATEJIb.otst);
            b=(float) PNCOBATEJIb.h;
        }else {
            l=0;
            t=(float)PNCOBATEJIb.otst;
            r=(float)PNCOBATEJIb.w;
            b=(float)(PNCOBATEJIb.h-PNCOBATEJIb.otst);
        }
        canvas.drawRect(l,t,r,b,paint);
    }
    public static float fromRad(double a){
        return (float)(-180*a/Math.PI);
    }
    public static Bitmap rotateBitmap(Bitmap source, float angle){
        Matrix matrix=new Matrix();
        matrix.postRotate(angle);
        return Bitmap.createBitmap(source,0,0,source.getWidth(),source.getHeight(),matrix,true);
    }
    public static Bitmap flipBitmap(Bitmap bitmap){
        Matrix matrix = new Matrix();
        matrix.preScale(-1, 1);
        return Bitmap.createBitmap(bitmap, 0,0 , bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }
}
