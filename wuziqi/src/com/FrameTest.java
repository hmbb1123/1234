package com;
import javax.swing.JFrame;
public class FrameTest {
    public static void main(String[] args){
        JFrame myFrame=new JFrame();
        myFrame.setBounds(200,200,300,400);
        myFrame.add(new DrawTest());

        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    }
}
