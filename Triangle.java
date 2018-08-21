import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.util.Arrays;
import java.io.*;
/*
**  Piece Code
**  1. Plus
**  2. Triangle
**  3. Chevron
**  4. Sun

*/
public class Triangle extends JFrame implements ActionListener{
    JButton[] btn = new JButton[42];
    int[][] board= new int[6][7];

    public static void main(String[] args){
        new Triangle();
    }
    public Triangle(){
        int init_pos = 7;
        JFrame frame = new JFrame("Pea-Air-Know");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(500,500));
        

        

        JPanel gameBoard = new JPanel(new GridLayout(6,0));
        frame.add(gameBoard);

        for(int i = 0; i<6; i++){
            btn[i] = new JButton();
            btn[i].setFocusable(true);
            btn[i].setBackground(new Color(255,255,255));
            gameBoard.add(btn[i]);
            btn[i].addActionListener(this);
        
        }
        btn[37].setIcon(loadImage("RedTriangle.png"));
        board[5][1] = 2;

    }
    private ImageIcon loadImage(String path){
        Image image = new ImageIcon(this.getClass().getResource(path)).getImage();
        Image scaledImage = image.getScaledInstance(132, 132,  java.awt.Image.SCALE_SMOOTH);
        return new ImageIcon(scaledImage);
    }
    public void actionPerformed(ActionEvent evt){
        JButton temp = (JButton)evt.getSource();
        //int x = board[Arrays.asList(btn).indexOf(temp)]
        System.out.println(board[Arrays.asList(btn).indexOf(temp)]);
        //if(board[Arrays.asList(btn).indexOf(temp)]==2){

        //}

    }
    
}