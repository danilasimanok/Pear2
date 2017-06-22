package com.example.test.minigamespear;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/**
 * Created by Андрей on 22.06.2017.
 */

public class Background implements Drawable {
    private static Bitmap BITMAP;
    private static RectF DST;
    private static Rect SRC;
    private static final Paint PAINT=new Paint(0xff000000);

    public static void setBackground(Bitmap bitmap){
        BITMAP=bitmap;
        DST=new RectF(C_PNCOBATEJIb.xToP(-8),C_PNCOBATEJIb.yToP(4.5),C_PNCOBATEJIb.xToP(8),C_PNCOBATEJIb.yToP(-4.5));
        SRC=new Rect(0,0,160,90);
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawBitmap(BITMAP,SRC,DST,PAINT);
    }

    public static void move(){
        SRC.left+=(int)Player.x;
        SRC.top-=(int)Player.y;
    }
}
