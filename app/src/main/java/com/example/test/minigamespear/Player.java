package com.example.test.minigamespear;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Log;

/**
 * Created by Андрей on 19.06.2017.
 */

public class Player extends Creature {
    public static int size=1;
    public static double x=8,y=4.5;
    public Player() {
        this.points=0;
        this.paint=new Paint();
        paint.setColor(0xff00ff00);
        this.r=1;
        this.vx=0;
        this.vy=0;
    }

    @Override
    public void draw(Canvas canvas) {
        float x=PNCOBATEJIb.xToP(this.x),
                y=PNCOBATEJIb.yToP(this.y),
                r=PNCOBATEJIb.rToP(this.r);
        canvas.drawCircle(x,y,r,paint);
        Log.d("player's points",this.points+"");
    }

    @Override
    public void move(Player p) {
        this.x+=this.vx;
        this.y+=this.vy;
    }

    public void suffer() {
        this.size-=3;
        this.points=0;
        if(this.size<=0)this.size=1;
    }

    public void eat(Enemy enemy) {
        this.points+=enemy.points;
        enemy.isAlive=false;
    }
}
