package com.company;

import javax.swing.*;

public class Main extends JFrame {

    public static void main(String[] args) {

	    Main main =new Main();
	    String instructions = "You need to rich the right circle without running over the human body\n"+"you can use the buttons with the arrows to move\n"+"To start press ok";
        JOptionPane.showMessageDialog(null,instructions);
    }
    public Main(){
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(Def.WINDOW_WIDTH,Def.WINDOW_HEIGHT);
        this.setResizable(true);
        this.setLayout(null);
        this.setTitle("My game");
        GameScene gameScene = new GameScene();
        gameScene.run();
        gameScene.setBounds(0,0,Def.WINDOW_WIDTH,Def.WINDOW_HEIGHT);
        this.add(gameScene);
        this.setLocationRelativeTo(null);
        CarMove carMove=new CarMove(gameScene);
        this.addKeyListener(carMove);
    }

    }





