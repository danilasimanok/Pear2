package com.example.test.minigamespear;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import java.util.LinkedList;

/**
 * Created by Андрей on 19.06.2017.
 */

public class EvolvingView extends View {
    LinkedList<Enemy>creatures;
    LinkedList<Enemy>delCreatures;
    Player player;
    private boolean PNCOBATEJIb_is_not_settled=true;
    private boolean f=true;
    public static final double mu=0.0005/3;
    private static final int t0=60;
    private int t=0;
    private int[]points;
    private double[]v;

    public EvolvingView(Context context) {
        this(context,null,0);
        this.prepare();
    }

    public EvolvingView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
        this.prepare();
    }

    public EvolvingView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.prepare();
    }

    private void prepare() {
        player=new Player(0.03);
        creatures=new LinkedList<>();
        delCreatures=new LinkedList<>();
        points=new int[50];
        v=new double[50];
        points[0]=1;
        for(int i=2;i<points.length;i++){
            points[i]=points[i-1]*2;
        }
        for(int i=0;i<v.length;i++){
            v[i]=0.002;
        }
    }

    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        //настройка рисователя
        if(PNCOBATEJIb_is_not_settled){
            C_PNCOBATEJIb.newC_PNCOBATEJIb(getWidth(),getHeight());
            PNCOBATEJIb_is_not_settled=false;
        }
        //создание новых врагов
        createEnem();
        //движение персонажей
        player.move(player);
        for(Enemy enemy:creatures)enemy.move(player);
        //убийство вышедших далеко за экран
        checkCreaturesCoordinats();
        //убийство тех, кто стал слишком маленьким
        checkCreaturesSize();
        //удаление умерших животных
        for(Enemy enemy:creatures)if(!enemy.isAlive)delCreatures.add(enemy);
        for(Enemy enemy:delCreatures)creatures.remove(enemy);
        delCreatures.clear();
        //рисование всех
        player.draw(canvas);
        for (Creature creature:creatures)creature.draw(canvas);
        invalidate();
    }

    private void checkCreaturesSize() {
        for(Enemy enemy:creatures)
            if(player.size-enemy.size>3)enemy.isAlive=false;
    }

    private void checkCreaturesCoordinats() {
        for(Enemy enemy:creatures)
            if(Math.abs(enemy.x-player.x)>16||Math.abs(enemy.y-player.y)>9)enemy.isAlive=false;
    }

    private void createEnem() {
        t++;
        if(t==t0){
            Log.d("spawn init","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            t=0;
            double x,y;
            for(int i=player.size-3;i<player.size+3;i++){
                if(i>=0){
                    /*Log.d("spawn iter",""+i);
                    do{
                        x=Math.random()*32-8;
                        y=Math.random()*13.5-4.5;
                        Log.d("spawn tried",x+" "+y);
                    }while ((x>=0&&x<=16)||(y>=0&&y<=9));*/
                    do{
                        x=Math.random()*32-16;
                    }while (x<=8&&x>=-8);
                    x=x+player.x;
                    do{
                        y=Math.random()*18-9;
                    }while (y<=4.5&&y>=-4.5);
                    y=y+player.y;
                    Enemy enemy=new Enemy(points[i],x,y,player.x,player.y,v[i],i+1);
                    creatures.add(enemy);
                }
            }

        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event){
        double x=C_PNCOBATEJIb.pToX(event.getX()),
                y=C_PNCOBATEJIb.pToY(event.getY());
        player.changeDir(x,y);
        for(int i=0;i<60;i++)createEnem();
        if(f) {
            f=false;
        }else{
            player.size=4;
        }
        return super.onTouchEvent(event);
    }
}
