package com.company;

import java.awt.*;

public class Legs {
    private int xp;
    private int yp;
    private int widthP;
    private int heightP;

    public Legs(int xp, int yp, int widthP, int heightP) {

        this.xp = xp;
        this.yp = yp;
        this.widthP = widthP;
        this.heightP = heightP;
    }


    public void paint(Graphics graphics) {
        graphics.setColor(Color.yellow);
        graphics.fillRect(this.xp,this.yp,this.widthP,this.heightP);
    }


}