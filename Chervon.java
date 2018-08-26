//package MyrmidonChess;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public final class Chervon extends  Piece  
{

	
	public Plus(String color)
	{
		setName("Plus");
		setColor(color);
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
