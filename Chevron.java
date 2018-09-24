//package myrmidonChess;

import java.util.ArrayList;

import java.awt.Color;
import java.lang.Math;
/*(Lucinda)*/
public class Chevron extends Piece  
{
	private String type;
    private String color;
    public Chevron(String color)
	{
        this.setType("Chevron");
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
	
	public ArrayList<Integer> showMove(Piece[][] pieceManager, int r, int c)
	{
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int r1=0;r1<=5;r1++)
		{
			for(int c1=0;c1<=6;c1++)
			{
				
				if((Math.abs(r-r1)==2&&Math.abs(c-c1)==1)
					||(Math.abs(r-r1)==1&&Math.abs(c-c1)==2))
					{
						if(pieceManager[r1][c1].getColor() != pieceManager[r][c].getColor())
			            {
			        	    Board.grid[r1][c1].setBackground(Color.GREEN);
			        	    a.add(r1);
			        	    a.add(c1);
			            }
					}
			}
		}			
		return a;
	}
	
}
