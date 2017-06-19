package com.example.test.minigamespear;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
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
        player=new Player();
        creatures=new LinkedList<>();
        delCreatures=new LinkedList<>();
    }

    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        if(PNCOBATEJIb_is_not_settled){
            PNCOBATEJIb.newPNCOBATEJIb(getWidth(),getHeight());
            PNCOBATEJIb_is_not_settled=false;
        }
        player.move(player);
        for(Enemy enemy:creatures)enemy.move(player);
        for(Enemy enemy:creatures)if(!enemy.isAlive)delCreatures.add(enemy);
        for(Enemy enemy:delCreatures)creatures.remove(enemy);
        delCreatures.clear();
        player.draw(canvas);
        for (Creature creature:creatures)creature.draw(canvas);
        invalidate();
    }
    @Override
    public boolean onTouchEvent(MotionEvent event){
        double a=Math.atan(4.5/8);
        Enemy enemy1=new Enemy(1000,0,0,0.1*Math.cos(a),0.1*Math.sin(a),1);
        Enemy enemy2=new Enemy(1000,0,0,0.05*Math.cos(a),0.05*Math.sin(a),3);
        creatures.add(enemy1);
        creatures.add(enemy2);
        return super.onTouchEvent(event);
    }
}
