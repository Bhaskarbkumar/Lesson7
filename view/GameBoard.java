package view;

import java.awt.Container;
import java.awt.Color;
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameBoard {

    private static final int WIDTH=600;
    private static final int HEIGHT=300;

    private JFrame window;

    private MyCanvas canvas;

    public GameBoard(JFrame window){
            this.window=window;
    }
    
    public void init(){

        Container cp = window.getContentPane();
        cp.add(BorderLayout.CENTER,canvas);
 
        JButton startButton = new JButton("Start");
        JButton quitButton = new JButton("Quit");

        JPanel southPanel = new JPanel();
        southPanel.add(startButton);
        southPanel.add(quitButton);
        cp.add(BorderLayout.SOUTH,southPanel);
 
        canvas.getGameElements().add(new TextDraw("click <start> to Play",100,100,Color.yellow,30));





        
    }
}
