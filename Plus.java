//package myrmidonChess;

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
			int r1 = r + step;
			int c1 = c + step;
			int r2 = r - step;
			int c2 = c - step;
			if((r>=0 && r<=5) && (c2>=0 & c2<=6)){
			    a.add(r);
			    a.add(c2);
			}
			if((r1>=0 && r1<=5) && (c>=0 && c<=6)){
			    a.add(r1);
			    a.add(c);
			}
			if((r>=0 && r<=5) && (c1>=0 & c1<=6)){
			    a.add(r);
			    a.add(c1);
			}
			if((r2>=0 && r2<=5) && (c>=0 && c<=6)){
			    a.add(r2);
			    a.add(c);
			}
		}
		return a;
	}//end SHOWMOVE
}
