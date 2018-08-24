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
public final class Triangle extends Piece {
    public Triangle(String color){
        setName("Triangle");
        setColor(color);
    }
    public void showMove(int x, int y){
	    System.out.println("X = " + x + "\nY = " + y);
    }
}
