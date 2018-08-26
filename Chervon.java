//package MyrmidonChess;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.*;

public class Chervon extends  Piece  
{
	private String type;
    private String color;
    public Chervon(String color)
	{
        this.setType("Chervon");
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
	
	public ArrayList<Integer> showMove(int r,int c)
	{
		for(int r1=0;r1<=5;r1++)
		{
			for(int c1=0;c1<=6;c1++)
			{
				if(Math.abs(r-r1)==2&&Math.abs(c-c1)==1)
					||(Math.abs(r-r1)==1&&Math.abs(c-c1)==2)
					{
						a.add(r1);
						a.add(c1);
					}
			}
		}			
		return a;
	}
}
