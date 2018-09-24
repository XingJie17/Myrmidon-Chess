//package myrmidonChess;

import java.awt.Color;
import java.util.ArrayList;
/*(Shen Wei,Jeff)*/	
public class Triangle extends Piece {
    private String type;
    private String color;
    public Triangle(String color){
        this.setType("Triangle");
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
    public ArrayList<Integer> showMove(Piece[][] pieceManager, int r, int c){

        ArrayList<Integer> a = new ArrayList<Integer>();
        
        // Initialize 4 paths blocked flag
        boolean[] pathBlocked = new boolean[4];
        for(int x = 0; x < pathBlocked.length; x++) {
        	pathBlocked[x] = false;
        }
        
        for(int step = 1; step<=2; step++){
            int r1 = r + step;
            int c1 = c + step;
            int r2 = r - step;
            int c2 = c - step;
            
            // Available movement for path 1
            if((r1>=0 && r1<=5) && (c1>=0 && c1<=6)){
                if(step == 1) {
                	if(pieceManager[r1][c1].getColor() != pieceManager[r][c].getColor())
                    {
		        	    Board.grid[r1][c1].setBackground(Color.GREEN);
		        	    a.add(r1);
		        	    a.add(c1);
                    }
                	if(pieceManager[r1][c1].getType() != "Empty") {
                		pathBlocked[0] = true;
                	}
                }
            	if(step == 2) {
                	if(pathBlocked[0] == false) {
                		if(pieceManager[r1][c1].getColor() != pieceManager[r][c].getColor())
                        {
    		        	    Board.grid[r1][c1].setBackground(Color.GREEN);
    		        	    a.add(r1);
    		        	    a.add(c1);
                        }
                	}
                }
            }
            
            // Available movement for path 2
            if((r1>=0 && r1<=5) && (c2>=0 && c2<=6)){
            	if(step == 1) {
                	if(pieceManager[r1][c2].getColor() != pieceManager[r][c].getColor())
                    {
		        	    Board.grid[r1][c2].setBackground(Color.GREEN);
		        	    a.add(r1);
		        	    a.add(c2);
                    }
                	if(pieceManager[r1][c2].getType() != "Empty") {
                		pathBlocked[1] = true;
                	}
                }
            	if(step == 2) {
                	if(pathBlocked[1] == false) {
                		if(pieceManager[r1][c2].getColor() != pieceManager[r][c].getColor())
                        {
    		        	    Board.grid[r1][c2].setBackground(Color.GREEN);
    		        	    a.add(r1);
    		        	    a.add(c2);
                        }
                	}
                }
            }
            
            // Available movement for path 3
            if((r2>=0 && r2<=5) && (c1>=0 && c1<=6)){
            	if(step == 1) {
                	if(pieceManager[r2][c1].getColor() != pieceManager[r][c].getColor())
                    {
		        	    Board.grid[r2][c1].setBackground(Color.GREEN);
		        	    a.add(r2);
		        	    a.add(c1);
                    }
                	if(pieceManager[r2][c1].getType() != "Empty") {
                		pathBlocked[2] = true;
                	}
                }
            	if(step == 2) {
                	if(pathBlocked[2] == false) {
                		if(pieceManager[r2][c1].getColor() != pieceManager[r][c].getColor())
                        {
    		        	    Board.grid[r2][c1].setBackground(Color.GREEN);
    		        	    a.add(r2);
    		        	    a.add(c1);
                        }
                	}
                }
            }
            
            // Available movement for path 4
            if((r2>=0 && r2<=5) && (c2>=0 && c2<=6)){
            	if(step == 1) {
                	if(pieceManager[r2][c2].getColor() != pieceManager[r][c].getColor())
                    {
		        	    Board.grid[r2][c2].setBackground(Color.GREEN);
		        	    a.add(r2);
		        	    a.add(c2);
                    }
                	if(pieceManager[r2][c2].getType() != "Empty") {
                		pathBlocked[3] = true;
                	}
                }
            	if(step == 2) {
                	if(pathBlocked[3] == false) {
                		if(pieceManager[r2][c2].getColor() != pieceManager[r][c].getColor())
                        {
    		        	    Board.grid[r2][c2].setBackground(Color.GREEN);
    		        	    a.add(r2);
    		        	    a.add(c2);
                        }
                	}
                }
            }
        }
        
     // Reset pathBlocked after each move
     	for(int x = 0; x < pathBlocked.length; x++) {
     		pathBlocked[x] = false;
        }
     		
        return a;
    }
}