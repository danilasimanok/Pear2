package com.example.test.minigamespear;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Log;

/**
 * Created by Андрей on 19.06.2017.
 */

public class Player extends Creature {
    public static int size=1;
    public static double x=0,y=0;
    private static int limit=10;
    static double plV;
    public Player(double v) {
        this.points=0;
        this.paint=new Paint();
        paint.setColor(0xff00ff00);
        this.r=1;
        this.plV=v;
        this.sin=0;
        this.cos=0;
        this.v=0;
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawCircle(C_PNCOBATEJIb.xToP(0),C_PNCOBATEJIb.yToP(0),C_PNCOBATEJIb.rToP(r),paint);
        Log.d("player","points="+this.points+" size="+Player.size);
    }

    @Override
    public void move(Player p) {
        Player.x+=this.v*this.cos;
        Player.y+=this.v*this.sin;
        if(this.v>0)this.v-=EvolvingView.mu;
        else this.v=0;
    }

    public void suffer() {
        this.size-=3;
        this.points=0;
        if(this.size<=0)this.size=1;
    }

    public void eat(Enemy enemy) {
        this.points+=enemy.points;
        this.updateSize();
    }

    private void updateSize() {
        if(this.points>=this.limit){
            this.points-=this.limit;
            this.size++;
            this.limit=2*this.limit;
        }
    }

    void changeDir(double x,double y){
        double a=y-4.5,b=x-8,c=Math.sqrt(a*a+b*b);
        this.v=this.plV;
        this.sin=a/c;
        this.cos=b/c;
    }
}
