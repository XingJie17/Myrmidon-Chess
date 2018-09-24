//package myrmidonChess;

import java.awt.Color;
import java.util.ArrayList;
/*(Shen Wei,Lucinda)*/	
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
    
   

	public ArrayList<Integer> showMove(Piece[][] pieceManager, int r, int c)
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
        if((r1>=0 && r1<=5) && (c1>=0 && c1<=6)){
        	if(pieceManager[r1][c1].getColor() != pieceManager[r][c].getColor())
            {
        	    Board.grid[r1][c1].setBackground(Color.GREEN);
        	    a.add(r1);
        	    a.add(c1);
            }
        }
        if((r2>=0 && r2<=5) && (c2>=0 && c2<=6)){
        	if(pieceManager[r2][c2].getColor() != pieceManager[r][c].getColor())
            {
        	    Board.grid[r2][c2].setBackground(Color.GREEN);
        	    a.add(r2);
        	    a.add(c2);
            }
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
        if((r3>=0 && r3<=5) && (c3>=0 && c3<=6)){
        	if(pieceManager[r3][c3].getColor() != pieceManager[r][c].getColor())
            {
        	    Board.grid[r3][c3].setBackground(Color.GREEN);
        	    a.add(r3);
        	    a.add(c3);
            }
        }
        if((r4>=0 && r4<=5) && (c4>=0 && c4<=6)){
        	if(pieceManager[r4][c4].getColor() != pieceManager[r][c].getColor())
            {
        	    Board.grid[r4][c4].setBackground(Color.GREEN);
        	    a.add(r4);
        	    a.add(c4);
            }
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
        if((r5>=0 && r5<=5) && (c5>=0 && c5<=6)){
        	if(pieceManager[r5][c5].getColor() != pieceManager[r][c].getColor())
            {
        	    Board.grid[r5][c5].setBackground(Color.GREEN);
        	    a.add(r5);
        	    a.add(c5);
            }
        }
        if((r5>=0 && r5<=5) && (c6>=0 && c6<=6)){
        	if(pieceManager[r5][c6].getColor() != pieceManager[r][c].getColor())
            {
        	    Board.grid[r5][c6].setBackground(Color.GREEN);
        	    a.add(r5);
        	    a.add(c6);
            }
        }
        if((r6>=0 && r6<=5) && (c5>=0 && c5<=6)){
        	if(pieceManager[r6][c5].getColor() != pieceManager[r][c].getColor())
            {
        	    Board.grid[r6][c5].setBackground(Color.GREEN);
        	    a.add(r6);
        	    a.add(c5);
            }
        }
        if((r6>=0 && r6<=5) && (c6>=0 && c6<=6)){
        	if(pieceManager[r6][c6].getColor() != pieceManager[r][c].getColor())
            {
        	    Board.grid[r6][c6].setBackground(Color.GREEN);
        	    a.add(r6);
        	    a.add(c6);
            }
        }
        
        return a;
	}
	
}
