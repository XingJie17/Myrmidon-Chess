package myrmidonChess;

import java.awt.*;
import javax.swing.*;
import java.awt.GridLayout;

// *Note: (Not needed for now, to be added later if necessary)
// import java.awt.image.BufferedImage;
// import javax.crypto.ShortBufferException;
// import java.awt.EventQueue;

/*** Written by Yoong Shen Wei ***/
@SuppressWarnings("serial")
public final class Board extends JPanel {
	
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
	
	public static JPanel insertPanel() {
		
		// create grid layout on the chess board
		board.setLayout(new GridLayout(ROWS, COLUMNS, 1, 1));
		
		// assign color to each grid
		for (int r = 0; r < ROWS; r++) {
			for (int c = 0; c < COLUMNS;  c++) {
				// Create a temporary single grid to be colored
				JButton g = new JButton();
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
		
		return board;
	}
	
}