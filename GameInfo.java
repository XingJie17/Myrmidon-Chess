import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;

@SuppressWarnings("serial")
public final class GameInfo extends JPanel{
    /* Singleton Implementation*/
    private static GameInfo gameInfo = new GameInfo();
   
    private GameInfo(){};
   
    public static GameInfo getGameInfo()
	{
        return gameInfo;
    } 
    // Variables
    private static JLabel CurrentTurn = new JLabel("Current Turn: Blue");
    private static String playerTurn = "Blue";
    private static JLabel eatenPiecesInfo = new JLabel("<html><br/>Red:<br/><br/>Blue:</html>");
   
    public static JPanel insertGameInfoPanel()
	{
        gameInfo.setLayout(new BoxLayout(gameInfo, BoxLayout.Y_AXIS));
        gameInfo.add(new JLabel("Player 1"));
        gameInfo.add(new JLabel("Player 2"));
        gameInfo.add(new JLabel("Game Time: 00:00:00"));
        gameInfo.add(CurrentTurn);
        gameInfo.add(eatenPiecesInfo);
   
        return gameInfo;
    }
    public static void changeCurrentTurn(String pT)
	{
        CurrentTurn.setText("Current Turn: "+pT);
        playerTurn = pT;
    }
    public static String getCurrentTurn()
	{
        return playerTurn;
    }   
	
    public static void updateEatenPiece(ArrayList<Piece> list)
	{
        String tempRed = "<html>Red:<br/>";
        String tempBlue = "Blue:<br/>";
        for(Piece p:list)
        {
            if(p.getColor() == "Red")
            {
      		    tempRed = tempRed + "- Red " + p.getType()+"<br/>";
      	    }
      	    else
      	    {	
      	    	tempBlue = tempBlue + "- Blue" + p.getType() + "<br/>";
      	    }
        }
      
        tempRed = tempRed + "<br/>";
        tempBlue = tempBlue + "</html>";
        eatenPiecesInfo.setText(tempRed+tempBlue);
    }
    public static void loadGame()
	{
        eatenPiecesInfo.setText("<html>Red:<br/>Blue:</html>");
    } 
	public static void newGame()
	{
		Board.turn = 0;
		Board.setTurnFromBoard();
		eatenPiecesInfo.setText("<html>Red:<br/><br/>Blue:</html>");
	}
}

