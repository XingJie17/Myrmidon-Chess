import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public final class GameInfo extends JPanel{
  /* Singleton Implementation*/
  private static GameInfo gameInfo = new GameInfo();

  private GameInfo(){};

  public static GameInfo getGameInfo(){
    return gameInfo;
  } 
  // Variabels
  private static JLabel CurrentTurn = new JLabel("Current Turn: Blue");

  public static JPanel insertGameInfoPanel(){
    gameInfo.setLayout(new BoxLayout(gameInfo, BoxLayout.Y_AXIS));
    gameInfo.add(new JLabel("Player 1"));
    gameInfo.add(new JLabel("Player 2"));
    gameInfo.add(new JLabel("Game Time: 00:00:00"));
    gameInfo.add(CurrentTurn);

    return gameInfo;
  }
  public static void changeCurrentTurn(String pT){
    CurrentTurn.setText("Current Turn: "+pT);
  }
}
