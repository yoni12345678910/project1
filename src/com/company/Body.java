package com.company;

import java.awt.*;

public class Body {
    private int x;
    private int y;
    private int width;
    private int height;

    public Body(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void moveRight(){
        this.x+=10;
    }
    public void moveLeft(){
        this.x-=10;
    }
    public void moveUp(){
        this.y-=10;
    }
    public void moveDown(){
        this.y+=10;
    }

    public void paint (Graphics graphics){
        graphics.setColor(Color.RED);
        graphics.fillRect(this.x,this.y,this.width,this.height);

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

}
