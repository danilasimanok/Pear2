package com.example.test.minigamespear;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

import java.util.LinkedList;

/**
 * Created by Андрей on 19.06.2017.
 */

public abstract class Creature implements Drawable {
    Bitmap bitmap;//это картинка, которой будет рисоваться животное
    int size;//это размер животного
    double r;//радиус твари
    double x,y;//его координаты
    double v,sin,cos;//скорость твари и функции угла, под которым она движется
    Paint paint;//краска, без которой не получится рисовать
    int points;//показывает прогресс игрока на пути к новому размеру и сытность его врага
    abstract void move(Player player);//метод для движения
    /*public void drawBitmap(Canvas canvas){
        float l=C_PNCOBATEJIb.xToP(this.x-this.r),
                t=C_PNCOBATEJIb.yToP(this.y+this.r),
                r=C_PNCOBATEJIb.xToP(this.x+this.r),
                b=C_PNCOBATEJIb.yToP(this.y-this.r);
        RectF dst=new RectF(l,t,r,b);
        canvas.drawBitmap(this.bitmap,null,dst,this.paint);
    }*/
}
