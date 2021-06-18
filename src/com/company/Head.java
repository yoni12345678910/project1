package com.company;

import java.awt.*;

public class Head {
    private int xp;
    private int yp;
    private int widthP;
    private int heightP;

    public Head(int xp, int yp, int widthP, int heightP) {
        this.xp = xp;
        this.yp = yp;
        this.widthP = widthP;
        this.heightP = heightP;
    }


    public void paint(Graphics graphics){

        graphics.setColor(Color.BLACK);
        graphics.fillOval(this.xp,this.yp,this.widthP,this.heightP);

    }


}
