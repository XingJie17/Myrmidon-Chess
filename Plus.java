package myrmidonChess;

/** NOT DONE **/

//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//import java.util.Random;
import java.util.ArrayList;
//import java.util.Arrays;
//import java.io.*;

public class Plus extends Piece  
{
	private String type;
    private String color;
	public Plus(String color)
	{
		this.setType("Plus");
        this.setColor(color);
	}
	 public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    
    public void checkOccupied(ArrayList<Integer> a) {
    	// TODO
    }
    
	public ArrayList<Integer> showMove(int r,int c)
	{
		ArrayList<Integer> a = new ArrayList<Integer>();
		//Haven't done (if blockage then cannot move)[PIECE]
		//Verify pawn can go backwards direction? 
		
		
		for(int step = 1; step<=2; step++){
			
			// Vertical movement
			int r1 = 0;
            int c1 = 0;
            int r2 = 0;
            int c2 = 0;
            r1 = r + step;
            c1 = c;
            r2 = r - step;
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
            c3 = c + step;
            r4 = r;
            c4 = c - step;
            if((r3>=0 && r3<=5) && (c3>=0 & c3<=6)){
                a.add(r3);
                a.add(c3);
            }
            if((r4>=0 && r4<=5) && (c4>=0 && c4<=6)){
                a.add(r4);
                a.add(c4);
            }
		}	//end SHOWMOVE
		return a;
	}
}