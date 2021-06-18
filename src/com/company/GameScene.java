package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class GameScene extends JPanel {
    private Car car;
    private Person[] persons;
    public void run(){

        GameScene gameScene=new GameScene();
    }

    public GameScene(){
        this.setBackground(Color.GRAY);
        this.setDoubleBuffered(true);
        Random random=new Random();
        this.persons=new Person[10];
        for (int i=0;i<persons.length;i++){
           this.persons[i]=new Person(random.nextInt(1400)+400,random.nextInt(600)+200,40,40);
        }
        this.car=new Car();

    }

    public void paint(Graphics g){
        super.paint(g);
        this.GameLoop(g);


            for (int i = 0; i < persons.length; i++) {
                Person person = this.persons[i];
                person.paint(g);
            }
            this.car.paint(g);

    }



    private void GameLoop(Graphics g) {
        new Thread(() -> {
            while (!CarMove.flag) {
                try {
                    repaint();
                    Thread.sleep(25);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
    public Car getCar(){
        return car;
    }
    public Person[] getPerson(){
        return persons;
    }
}
