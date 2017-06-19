package com.example.test.minigamespear;

import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * Created by Андрей on 19.06.2017.
 */

public class Enemy extends Creature {
    public boolean isAlive;
    /*
    public int size;//это размер животного
    public double x,y;//его координаты
    private double vx,vy;//его скорость вдоль каждой из координатных осей
    * */

    public Enemy(int points, double x, double y, double vx, double vy, int size) {
        this.points = points;
        this.isAlive = true;
        this.x=x;
        this.y=y;
        this.vx=vx;
        this.vy=vy;
        this.size=size;
        this.paint=new Paint();
        paint.setColor(0xffff0000);
    }

    @Override
    public void draw(Canvas canvas) {
        this.r=1+(this.size-Player.size)*0.2f;
        float x=PNCOBATEJIb.xToP(this.x-getPlayerXOffest(Player.x)),
                y=PNCOBATEJIb.yToP(this.y-getPlayerYOffest(Player.y)),
                r=PNCOBATEJIb.rToP(this.r);
        canvas.drawCircle(x,y,r,this.paint);
    }

    @Override
    public void move(Player player) {
        this.x+=this.vx;
        this.y+=this.vy;
        if(getR2(player.x,player.y)<=(r*r+player.r*player.r))
            if(this.size>player.size)player.suffer();
            else player.eat(this);
    }
    private double getR2(double x,double y){
        return (this.x-x)*(this.x-x)+(this.y-y)*(this.y-y);
    }
    private double getPlayerXOffest(double x){
        return x-8;
    }
    private double getPlayerYOffest(double y){
        return y-4.5;
    }
}
