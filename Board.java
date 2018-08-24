//package MyrmidonChess;

import java.awt.*;
import java.awt.event.*;
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
						String temp = g.getActionCommand();
						int row = Integer.parseInt(temp.substring(0,1));
						int col = Integer.parseInt(temp.substring(2));
						pieceManager[row][col].showMove(row,col);
    				}
				});
				if ((c % 2 == 1 && r % 2 == 1) || (c % 2 == 0 && r % 2 == 0)) {
					g.setBackground(Color.WHITE);
					
				}
				else {
					g.setBackground(Color.BLACK);
				}
				grid[r][c] = g; 
				/*grid[r][c].setX(r);
				grid[r][c].setY(c);*/
				//grid[r][c].addActionListener(new onClick());
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
	private static ImageIcon loadImage(String path){
        Image image = new ImageIcon(Board.class.getResource(path)).getImage();
        Image scaledImage = image.getScaledInstance(132, 132,  java.awt.Image.SCALE_SMOOTH);
        return new ImageIcon(scaledImage);
	}
	private static void initialPosition(){
		/*for(int i = 0; i < 14; i++){
			pieceManager[i] = new Piece();
		}*/
		pieceManager[5][1] = pieceFactory.createPiece("Triangle","Red");
		pieceManager[5][5] = pieceFactory.createPiece("Triangle","Red");
		pieceManager[0][1] = pieceFactory.createPiece("Triangle","Blue");
		pieceManager[0][5] = pieceFactory.createPiece("Triangle","Blue");

		grid[5][1].setIcon(loadImage("RedTriangle.png"));
		grid[5][5].setIcon(loadImage("RedTriangle.png"));
		grid[0][1].setIcon(loadImage("BlueTriangle.png"));
		grid[0][5].setIcon(loadImage("BlueTriangle.png"));

		//pieceManager[5][1].showMove(5,1);
		//System.out.println(pieceManager[5][1].getClass());
	}

	/*private void onClick(int r, int c){

	}*/
}

class onClick implements ActionListener{
	public void actionPerformed(ActionEvent avt){
		String temp = avt.getActionCommand();
		int row = Integer.parseInt(temp.substring(0,1));
		int col = Integer.parseInt(temp.substring(2));
		//String pieceObj = 
		//pieceManager[row][col].showMove(row,col);
		/*
		System.out.println("button pose: ["+temp+"]");
		System.out.println("row = " + row);
		System.out.println("col = " + col+"\n");*/
	}
}