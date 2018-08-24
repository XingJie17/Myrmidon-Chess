import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.util.Arrays;
import java.io.*;

public final class Triangle extends Piece {
    public Triangle(String color){
        setName("Triangle");
        setColor(color);
    }
    public void showMove(int x, int y){
        System.out.println("X = " + x + "\nY = " + y);
        // One step 
        int s = 1;
        String oneStep1 = (x=x+s) + "," + (y=y+s);
        x=x-s;
        y=y-s;
        String oneStep2 = (x=x+s) + "," + (y=y-s);
        x=x-s;
        y=y+s;
        String oneStep3 = (x=x-s) + "," + (y=y+s);
        x=x+s;
        y=y+s;;
        String oneStep4 = (x=x-s)+ "," + (y=y-s);
        x=x+s;
        y=y+s;

        System.out.println("one step: "+oneStep1);
        System.out.println("one step: "+oneStep2);
        System.out.println("one step: "+oneStep3);
        System.out.println("one step: "+oneStep4+"\n");

        // Two step
        s = 2;
        String twoStep1 = (x=x+s) + "," + (y=y+s);
        x=x-s;
        y=y-s;
        String twoStep2 = (x=x+s) + "," + (y=y-s);
        x=x-s;
        y=y+s;
        String twoStep3 = (x=x-s) + "," + (y=y+s);
        x=x+s;
        y=y+s;;
        String twoStep4 = (x=x-s)+ "," + (y=y-s);
        System.out.println("two step: "+twoStep1);
        System.out.println("two step: "+twoStep2);
        System.out.println("two step: "+twoStep3);
        System.out.println("two step: "+twoStep4);


    }
}
