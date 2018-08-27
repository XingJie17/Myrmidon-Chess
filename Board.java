//package myrmidonChess;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;
import java.awt.GridLayout;

// *Note: (Not needed for now, to be added later if necessary)
// import java.awt.image.BufferedImage;
// import javax.crypto.ShortBufferException;
// import java.awt.EventQueue;

/*** Written by Yoong Shen Wei ***/
@SuppressWarnings("serial")
public final class Board extends JPanel{
	
	/** Singleton Implementation **/
	// Create STATIC instance for this class - SINGLETON
	private static Board board = new Board();
	
	// Create a private constructor, so that it cannot be instantiated
	private Board(){};
	
	// This method returns static instance of the class
	public static Board getBoard() {
		return board;
	}
	
	// Declaration of grid on chess board, row = 6, column = 7
	private static final int ROWS = 6;
	private static final int COLUMNS = 7;
	private static JButton[][] grid = new JButton[ROWS][COLUMNS];
	private static Piece[][] pieceManager = new Piece[ROWS][COLUMNS];
	private static PieceFactory pieceFactory = new PieceFactory();
	
	public static JPanel insertPanel() {
		
		// create grid layout on the chess board
		board.setLayout(new GridLayout(ROWS, COLUMNS, 1, 1));
		board.setSize(200,200);
		// assign color to each grid
		for (int r = 0; r < ROWS; r++) {
			for (int c = 0; c < COLUMNS;  c++) {
				String btnName = r+","+c;
				// Create a temporary single grid to be colored
				JButton g = new JButton();
				g.setActionCommand(btnName);
				g.addActionListener(new ActionListener()
				{
				    public void actionPerformed(ActionEvent e){
						resetBoardColor();
						String temp = g.getActionCommand();
						int row = Integer.parseInt(temp.substring(0,1));
						int col = Integer.parseInt(temp.substring(2));
						if(pieceManager[row][col] != null){
							ArrayList<Integer> availableBtn = new ArrayList<Integer>(); 
							availableBtn = pieceManager[row][col].showMove(row,col);
							for(int i = 0; i < availableBtn.size(); i++){
								int x = i;
								int y = i+1;
								i++;
								//System.out.println("i: "+i);
								if(pieceManager[availableBtn.get(x)][availableBtn.get(y)] == null){
									grid[availableBtn.get(x)][availableBtn.get(y)].setBackground(Color.GREEN);
								}
								//System.out.println("r: "+availableBtn.get(x)+" c: "+availableBtn.get(y));
							}
						}
    				}
				});
				if ((c % 2 == 1 && r % 2 == 1) || (c % 2 == 0 && r % 2 == 0)) {
					g.setBackground(Color.WHITE);
					
				}
				else {
					g.setBackground(Color.BLACK);
				}
				grid[r][c] = g; 
			}
		}
		
		// insert grids into chess board
		for (int r = 0; r < ROWS; r++) {
			for (int c = 0; c < COLUMNS;  c++) {
				board.add(grid[r][c]);
			}
		}
		
		initialPosition();
		return board;
	}
	
	/*
	private static ImageIcon loadImage(String path){
        Image image = new ImageIcon(Board.class.getResource(path)).getImage();
        Image scaledImage = image.getScaledInstance(132, 132,  java.awt.Image.SCALE_SMOOTH);
        return new ImageIcon(scaledImage);
	}
	*/
	
	/** Returns an ImageIcon, or null if the path was invalid. */
	private static ImageIcon loadImage(String path) {
	    java.net.URL imgURL = Board.class.getResource(path);
	    if (imgURL != null) {
	        return new ImageIcon(imgURL);
	    } else {
	        System.err.println("Couldn't find file: " + path);
	        return null;
	    }
	}
	
	//initialize and display pieces 
	private static void initialPosition(){
		/*for(int i = 0; i < 14; i++){
			pieceManager[i] = new Piece();
		}*/
		//initialize piece
		//pieceManager[5][0] = pieceFactory.createPiece("Plus","Red");
		//pieceManager[5][6] = pieceFactory.createPiece("Plus","Red");
		//pieceManager[0][0] = pieceFactory.createPiece("Plus","Blue");
		//pieceManager[0][6] = pieceFactory.createPiece("Plus","Blue");
		
		pieceManager[5][1] = pieceFactory.createPiece("Triangle","Red");
		pieceManager[5][5] = pieceFactory.createPiece("Triangle","Red");
		pieceManager[0][1] = pieceFactory.createPiece("Triangle","Blue");
		pieceManager[0][5] = pieceFactory.createPiece("Triangle","Blue");

		pieceManager[5][0] = pieceFactory.createPiece("Plus","Red");
		pieceManager[5][6] = pieceFactory.createPiece("Plus","Red");
		pieceManager[0][0] = pieceFactory.createPiece("Plus","Blue");
		pieceManager[0][6] = pieceFactory.createPiece("Plus","Blue");
		
		pieceManager[5][2] = pieceFactory.createPiece("Chevron","Red");
		pieceManager[5][4] = pieceFactory.createPiece("Chevron","Red");
		pieceManager[0][2] = pieceFactory.createPiece("Chevron","Blue");
		pieceManager[0][4] = pieceFactory.createPiece("Chevron","Blue");
		
		
		pieceManager[0][3] = pieceFactory.createPiece("Sun","Blue");
		pieceManager[5][3] = pieceFactory.createPiece("Sun","Red");

		//display pieces
		grid[5][0].setIcon(loadImage("RedPlus.png"));
		grid[5][6].setIcon(loadImage("RedPlus.png"));
		grid[0][0].setIcon(loadImage("BluePlus.png"));
		grid[0][6].setIcon(loadImage("BluePlus.png"));
		
		grid[5][1].setIcon(loadImage("RedTriangle.png"));
		grid[5][5].setIcon(loadImage("RedTriangle.png"));
		grid[0][1].setIcon(loadImage("BlueTriangle.png"));
		grid[0][5].setIcon(loadImage("BlueTriangle.png"));
		
		grid[5][2].setIcon(loadImage("RedChervon.png"));
		grid[5][4].setIcon(loadImage("RedChervon.png"));
		grid[0][2].setIcon(loadImage("BlueChervon.png"));
		grid[0][4].setIcon(loadImage("BlueChervon.png"));
		
		grid[5][3].setIcon(loadImage("RedSun.png"));
		grid[0][3].setIcon(loadImage("BlueSun.png"));	
		
	}
	private static void resetBoardColor(){
		for (int r = 0; r < ROWS; r++) {
			for (int c = 0; c < COLUMNS;  c++) {
				if ((c % 2 == 1 && r % 2 == 1) || (c % 2 == 0 && r % 2 == 0)) {
					grid[r][c].setBackground(Color.WHITE);
				}
				else {
					grid[r][c].setBackground(Color.BLACK);
				}
			}
		}
	
	}
}
