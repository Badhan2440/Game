/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.brickbreaker;
import javax.swing.JFrame;

/**
 *
 * @author paulb
 */
public class MainClass {
    public static void main(String[] args) {
        JFrame ob= new JFrame();
        GamePlay gameplay= new GamePlay();
        ob.setBounds(10,10,700,600);
        ob.setTitle("Brick Breaker Game");
        ob.setResizable(false);
        ob.setVisible(true);
        ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ob.add(gameplay);
        
        
    }
    
}
