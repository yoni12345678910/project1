package com.company;

import java.awt.*;

public class Person {
    private Head head;
    private bodyPerson body1;
    private Legs legs;
    private int r;
    private int z;
    private int wi;
    private int he;
    
    public Person (int r,int z,int wi,int he){
        this.body1=new bodyPerson(r,z,wi,he);
        this.head=new Head(r,z-40,wi,he);
        this.legs=new Legs(r+10,z+40,wi/2,he);
        this.r=r;
        this.z=z;
        this.wi=wi;
        this.he=he;
    }



    public void paint(Graphics graphics){
        this.head.paint(graphics);
        this.body1.paint(graphics);
        this.legs.paint(graphics);
    }




    public int getR() {
        return r;
    }

    public int getZ() {
        return z;
    }

    public int getWi() {
        return wi;
    }

    public int getHe() {
        return he;
    }


}
