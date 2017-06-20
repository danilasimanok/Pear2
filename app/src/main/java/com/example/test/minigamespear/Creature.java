package com.example.test.minigamespear;

import android.graphics.Paint;

import java.util.LinkedList;

/**
 * Created by Андрей on 19.06.2017.
 */

public abstract class Creature implements Drawable {
    int size;//это размер животного
    double r;//радиус твари
    double x,y;//его координаты
    double v,sin,cos;//скорость твари и функции угла, под которым она движется
    Paint paint;//краска, без которой не получится рисовать
    int points;//показывает прогресс игрока на пути к новому размеру и сытность его врага
    abstract void move(Player player);//метод для движения
}
