package myrmidonChess;

/** NOT DONE **/

//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//import java.util.Random;
import java.util.ArrayList;
//import java.util.Arrays;
//import java.io.*;
public class Sun extends Piece  
{
	private String type;
    private String color;
	public Sun(String color)
	{
		this.setType("Sun");
        this.setColor(color);
	}
	public String getType(){
        return type;
    }
    public void setType(String type)
	{
        this.type = type;
    }
    public String getColor()
	{
        return color;
    }
    public void setColor(String color)
	{
        this.color = color;
    }
    
    
	public ArrayList<Integer> showMove(int r,int c)
	{
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		// Vertical movement
		int r1 = 0;
        int c1 = 0;
        int r2 = 0;
        int c2 = 0;
        r1 = r + 1;
        c1 = c;
        r2 = r - 1;
        c2 = c;
        if((r1>=0 && r1<=5) && (c1>=0 & c1<=6)){
            a.add(r1);
            a.add(c1);
        }
        if((r2>=0 && r2<=5) && (c2>=0 && c2<=6)){
            a.add(r2);
            a.add(c2);
        }
        
        // Horizontal movement
        int r3 = 0;
        int c3 = 0;
        int r4 = 0;
        int c4 = 0;
        r3 = r;
        c3 = c + 1;
        r4 = r;
        c4 = c - 1;
        if((r3>=0 && r3<=5) && (c3>=0 & c3<=6)){
            a.add(r3);
            a.add(c3);
        }
        if((r4>=0 && r4<=5) && (c4>=0 && c4<=6)){
            a.add(r4);
            a.add(c4);
        }
        
        // Diagonal movement
        int r5 = 0;
        int c5 = 0;
        int r6 = 0;
        int c6 = 0;
        r5 = r + 1;
        c5 = c + 1;
        r6 = r - 1;
        c6 = c - 1;
        if((r5>=0 && r5<=5) && (c5>=0 & c5<=6)){
            a.add(r5);
            a.add(c5);
        }
        if((r5>=0 && r5<=5) && (c6>=0 & c6<=6)){
            a.add(r5);
            a.add(c6);
        }
        if((r6>=0 && r6<=5) && (c5>=0 && c5<=6)){
            a.add(r6);
            a.add(c5);
        }
        if((r6>=0 && r6<=5) && (c6>=0 && c6<=6)){
            a.add(r6);
            a.add(c6);
        }
        
        return a;
	}
}
