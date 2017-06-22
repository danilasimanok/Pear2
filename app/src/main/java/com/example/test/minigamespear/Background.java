package com.example.test.minigamespear;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;

/**
 * Created by Андрей on 22.06.2017.
 */

public class Background extends Enemy {
    public static final double R=50;
    public Background(Bitmap bitmap,double x,double y) {
        super(0, x, y, 0, 0, 0, 0, bitmap);
    }

    @Override
    public void move(Player player) {

    }

    @Override
    public void draw(Canvas canvas) {
        double x=this.x-Player.x,y=this.y-Player.y;
        float l=C_PNCOBATEJIb.xToP(x-R),
                t=C_PNCOBATEJIb.yToP(y+R),
                r=C_PNCOBATEJIb.xToP(x+R),
                b=C_PNCOBATEJIb.yToP(y-R);
        RectF dst=new RectF(l,t,r,b);
        canvas.drawBitmap(this.bitmap,null,dst,this.paint);
    }
}
