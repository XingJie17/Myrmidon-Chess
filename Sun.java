//package MyrmidonChess;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public final class Sun extends  Piece  
{
	public Plus(String color)
	{
		setName("Plus");
		setColor(color);
	}
	public ArrayList<Integer> showMove(int r,int c)
	{
		//Haven't done (if blockage then cannot move)[PIECE]		
			int r1 = 0;
			int c1 = 0;
			int r2 = 0;
            int c2 = 0;
			r1 = r + step;
            c1 = c + step;
			r2 = r - step;
            c2 = c - step;
			
			if(r1>=0 || r1<=5) 
			{
                a.add(r1);				
				if(c1>=0 || c1<=6)
				{
					 a.add(c1);
				}
				else if(c2>=0 || c2<=6)
				{
					 a.add(c2);
				}
				else
				{
					a.add(c);
				}               
            }
			if(c1>=0 || c1<=6)
			{
				a.add(r);
				a.add(c1);
			}	
			if(c2>=0 || c2<=6)
			{
				a.add(r);
				a.add(c2);
			}
			if(r2>=0 || r2<=5)
			{
				a.add(r2);
				if (c1>=0 || c1<=6)
				{
					a.add(c1);
				}
				else if(c2>=0 || c2<=6)
				{               
                a.add(c2);
				}
				else
				{
					a.add(c);	
				}	
			}
			return a;
	}//end SHOWMOVE
}
