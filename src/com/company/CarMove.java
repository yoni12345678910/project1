package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class CarMove implements KeyListener {

    private Car car;
    private Person person[];
    private Graphics g;
    public static boolean flag =false;


    public CarMove(GameScene gameScene) {
        this.car = gameScene.getCar();
        this.person = gameScene.getPerson();
    }

    public void keyTyped(KeyEvent e) {

    }


    public void keyPressed(KeyEvent e) {
        if (collision0(car, person) || collision1(car, person) || collision2(car, person) || collision3(car, person) || collision4(car, person) || collision5(car, person) || collision6(car, person) || collision7(car, person)||collision8(car, person)||collision9(car, person)) {
            this.flag=true;
            JOptionPane.showMessageDialog(null,"Game over");

        }

        if (collision11(car)) {
           this.flag=true;
            JOptionPane.showMessageDialog(null,"You won");

        }
        int key = e.getKeyCode();
        switch (key) {
            case KeyEvent.VK_RIGHT:
                this.car.moveRight();
                break;
            case KeyEvent.VK_LEFT:
                this.car.moveLeft();
                break;
            case KeyEvent.VK_UP:
                this.car.moveUp();
                break;
            case KeyEvent.VK_DOWN:
                this.car.moveDown();
                break;
        }
    }

    public void keyReleased(KeyEvent e) {

    }



        private boolean collision0 (Car car, Person[]person){

                Rectangle carRec = new Rectangle(car.getBody().getX(), car.getBody().getY(), car.getBody().getWidth(), car.getBody().getHeight());
                Rectangle persRec = new Rectangle(person[0].getR(), person[0].getZ(), person[0].getWi(), person[0].getHe());
                if (carRec.intersects(persRec)) {
                    return true;
                } else return false;
            }


    private boolean collision1(Car car, Person[] person) {
        Rectangle carRec = new Rectangle(car.getBody().getX(), car.getBody().getY(), car.getBody().getWidth(), car.getBody().getHeight());
        Rectangle persRec = new Rectangle(person[1].getR(), person[1].getZ(), person[1].getWi(), person[1].getHe());
        if (carRec.intersects(persRec) ){
            return true;
        } else return false;

    }

    private boolean collision2(Car car, Person[] person) {
        Rectangle carRec = new Rectangle(car.getBody().getX(), car.getBody().getY(), car.getBody().getWidth(), car.getBody().getHeight());
        Rectangle persRec = new Rectangle(person[2].getR(), person[2].getZ(), person[2].getWi(), person[2].getHe());
        if (carRec.intersects(persRec)){
            return true;
        } else return false;

    }

    private boolean collision3(Car car, Person[] person) {
        int i = 3;
        Rectangle carRec = new Rectangle(car.getBody().getX(), car.getBody().getY(), car.getBody().getWidth(), car.getBody().getHeight());
        Rectangle persRec = new Rectangle(person[i].getR(), person[i].getZ(), person[i].getWi(), person[i].getHe());
        if (carRec.intersects(persRec)){
            return true;
        } else return false;

    }

    private boolean collision4(Car car, Person[] person) {
        int i = 4;
        Rectangle carRec = new Rectangle(car.getBody().getX(), car.getBody().getY(), car.getBody().getWidth(), car.getBody().getHeight());
        Rectangle persRec = new Rectangle(person[i].getR(), person[i].getZ(), person[i].getWi(), person[i].getHe());
        if (carRec.intersects(persRec)){
            return true;
        } else return false;

    }

    private boolean collision5(Car car, Person[] person) {
        int i = 5;
        Rectangle carRec = new Rectangle(car.getBody().getX(), car.getBody().getY(), car.getBody().getWidth(), car.getBody().getHeight());
        Rectangle persRec = new Rectangle(person[i].getR(), person[i].getZ(), person[i].getWi(), person[i].getHe());
        if (carRec.intersects(persRec) ){
            return true;
        } else return false;

    }

    private boolean collision6(Car car, Person[] person) {
        int i = 6;
        Rectangle carRec = new Rectangle(car.getBody().getX(), car.getBody().getY(), car.getBody().getWidth(), car.getBody().getHeight());
        Rectangle persRec = new Rectangle(person[i].getR(), person[i].getZ(), person[i].getWi(), person[i].getHe());
        if (carRec.intersects(persRec)){
            return true;
        } else return false;

    }

    private boolean collision7(Car car, Person[] person) {
        int i = 7;
        Rectangle carRec = new Rectangle(car.getBody().getX(), car.getBody().getY(), car.getBody().getWidth(), car.getBody().getHeight());
        Rectangle persRec = new Rectangle(person[i].getR(), person[i].getZ(), person[i].getWi(), person[i].getHe());
        if (carRec.intersects(persRec)){
            return true;
        } else return false;

    }

    private boolean collision8(Car car, Person[] person) {
        int i = 8;
        Rectangle carRec = new Rectangle(car.getBody().getX(), car.getBody().getY(), car.getBody().getWidth(), car.getBody().getHeight());
        Rectangle persRec = new Rectangle(person[i].getR(), person[i].getZ(), person[i].getWi(), person[i].getHe());
        if (carRec.intersects(persRec)){
            return true;
        } else return false;

    }

    private boolean collision9(Car car, Person[] person) {
        int i = 9;
        Rectangle carRec = new Rectangle(car.getBody().getX(), car.getBody().getY(), car.getBody().getWidth(), car.getBody().getHeight());
        Rectangle persRec = new Rectangle(person[i].getR(), person[i].getZ(), person[i].getWi(), person[i].getHe());

        if (carRec.intersects(persRec) ){
            return true;
        } else return false;

    }


    private boolean collision11(Car car) {
        Rectangle carRec = new Rectangle(car.getBody().getX(), car.getBody().getY(), car.getBody().getWidth(), car.getBody().getHeight());
        Rectangle wheelRec = new Rectangle(1800, 500, 40, 40);
        boolean collision2 = carRec.intersects(wheelRec);
        return collision2;
    }


}
