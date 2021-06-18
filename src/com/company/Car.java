package com.company;

import java.awt.*;

public class Car {

    private Body body;
    private Wheel leftWheel;
    private Wheel rightWheel;
    private Wheel upTarget;
    private Wheel downTarget;



    public void paint(Graphics graphics){
        this.body.paint(graphics);
        this.leftWheel.paint(graphics);
        this.rightWheel.paint(graphics);
        this.upTarget.paint(graphics);
        this.downTarget.paint(graphics);
    }
    public void moveRight(){
        this.body.moveRight();
        this.rightWheel.moveRight();
        this.leftWheel.moveRight();

    }
    public void moveLeft(){
        this.body.moveLeft();
        this.rightWheel.moveLeft();
        this.leftWheel.moveLeft();

    }
    public void moveUp(){
        this.body.moveUp();
        this.rightWheel.moveUp();
        this.leftWheel.moveUp();

    }
    public void moveDown(){
        this.body.moveDown();
        this.rightWheel.moveDown();
        this.leftWheel.moveDown();

    }

    public Car() {
        this.body = new Body(Def.carX, Def.cary, Def.carWidth, Def.carHeight);
        this.leftWheel = new Wheel(body.getX(),
                body.getY() + body.getHeight() - (body.getWidth() / 4 / 2),
                body.getWidth() / 4,
                body.getWidth() / 4);
        this.rightWheel = new Wheel(body.getX() + body.getWidth() - leftWheel.getWidth(),
                leftWheel.getY(),
                leftWheel.getWidth(),
                leftWheel.getHeight());
        this.upTarget = new Wheel(10, 40, 40, 40);
        this.downTarget = new Wheel(1800, 500, 40, 40);
    }

    public Body getBody() {
        return body;
    }


}

