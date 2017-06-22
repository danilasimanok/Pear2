package com.example.test.minigamespear;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;

/**
 * Created by Андрей on 19.06.2017.
 */

public class Enemy extends Creature {
    public boolean isAlive;

    public Enemy(int points, double x, double y, double x1, double y1, double v, int size, Bitmap bitmap) {
        this.points = points;
        this.isAlive = true;
        this.x=x;
        this.y=y;
        this.v=v;
        this.sin=y1-y;
        this.cos=x1-x;
        this.size=size;
        this.paint=new Paint();
        int color=(int)(0xffffff*Math.random());
        paint.setColor(0xff000000+color);
        this.bitmap=bitmap;
        Log.d("spawn enemy","The enemy was added (size="+this.size+").");
    }

    @Override
    public void draw(Canvas canvas) {
        this.r=1+(this.size-Player.size)*0.2;
        double x=this.x-Player.x,y=this.y-Player.y;
        float l=C_PNCOBATEJIb.xToP(x-this.r),
                t=C_PNCOBATEJIb.yToP(y+this.r),
                r=C_PNCOBATEJIb.xToP(x+this.r),
                b=C_PNCOBATEJIb.yToP(y-this.r);
        RectF dst=new RectF(l,t,r,b);
        canvas.drawBitmap(this.bitmap,null,dst,this.paint);
        Log.d("enemy",this.x+" "+this.y+" "+this.r);
    }

    @Override
    public void move(Player player) {
        this.x+=this.v*this.cos;
        this.y+=this.v*this.sin;
        if(getR(Player.x,Player.y)<=(this.r+player.r)){
            if(this.size>player.size)player.suffer();
            else player.eat(this);
            this.isAlive=false;
        }
    }
    private double getR(double x,double y){
        return Math.sqrt((this.x-x)*(this.x-x)+(this.y-y)*(this.y-y));
    }
}
