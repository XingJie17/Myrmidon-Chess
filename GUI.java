//package MyrmidonChess;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.filechooser.*;
import java.lang.*;
import java.util.Scanner;
public class GUI{
	
	private JFrame frame;

	// Launch the application
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	// Create the application
	public GUI() {
		initialize();
	}
	
	// Initialize the contents of the frame
	private void initialize() {
		frame = new JFrame("Myrmidon Chess");
		//frame.setBounds(100, 50, 1500, 1000);
		frame.setBounds(0, 0, 1500, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS));
		
		// Create a split pane
		JSplitPane splitPane = new JSplitPane();
		frame.getContentPane().add(splitPane);
		
		// Adjust splitPane;
		splitPane.setResizeWeight(0.8);
		// Insert chess board panel to the left of split pane
		splitPane.setLeftComponent(Board.insertPanel());
		
		// Insert player and game information to the right of split pane
		// ******** TO-DO ********
		// THIS IS JUST A STUB //
		splitPane.setRightComponent(GameInfo.insertGameInfoPanel());

		// THIS IS JUST A STUB //
		// ******** TO-DO ********
		
		// Insert JMenuBar
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu gameMenu = new JMenu("Game");
		menuBar.add(gameMenu);
		gameMenu.add(new JMenuItem("New Game"));
		gameMenu.add(new JMenuItem(new AbstractAction("Save Game"){
            public void actionPerformed(ActionEvent e){
                JFileChooser fs = new JFileChooser(new File("c:\\"));
                fs.setDialogTitle("Save Game");
                FileNameExtensionFilter txtFilter = new FileNameExtensionFilter("Text file (*.txt)", ".txt");
                fs.addChoosableFileFilter(txtFilter);
                fs.setFileFilter(txtFilter);
                int result = fs.showSaveDialog(null);
                if(result == JFileChooser.APPROVE_OPTION){
                    String content = Board.printPM();
                    File fi = fs.getSelectedFile();
                    String fiExt = getFileExtension(fi);
                    System.out.println(fiExt);
                    if(!fiExt.equals("txt")){
                        fi = new File(fi.toString()+".txt");
                    }
                    try{
                        FileWriter fw = new FileWriter(fi.getPath());
                        fw.write(content);
                        fw.flush();
                        fw.close();
                    }catch(Exception e2){
                        JOptionPane.showMessageDialog(null, e2.getMessage());
                    }
                }
            }
        }));
        gameMenu.add(new JMenuItem(new AbstractAction("Load Game"){
            public void actionPerformed(ActionEvent e){
                GameInfo.loadGame();
                JFileChooser fc = new JFileChooser(new File("c:\\"));
                fc.setDialogTitle("Load Game");
                int response = fc.showOpenDialog(null);
                if(response == JFileChooser.APPROVE_OPTION){
                    File file = fc.getSelectedFile();
                    String text = ""; 
                    try{
                        System.out.println("Filename: "+file.getName());
                        System.out.println("File path: "+file.getPath());
                        Scanner s = new Scanner(new File(file.getPath()));
                        while(s.hasNext()){
                            text = text + s.next();
                        }
                        //System.out.println(text+"\n");
                        Board.loadGame(text);
                    } catch (Exception e2){
                        JOptionPane.showMessageDialog(null,"Error: "+ e2.getMessage());
                    }
                }
            }
        }));
		gameMenu.add(new JMenuItem(new AbstractAction("Resign"){
            public void actionPerformed(ActionEvent e){
                int button = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog(null, GameInfo.getCurrentTurn()+": resign?");
                if(dialogResult == JOptionPane.YES_OPTION){
                    switch(GameInfo.getCurrentTurn()){
                        case "Red":
                            JOptionPane.showMessageDialog(frame, "BLUE WON!"); 
                            break;
                        case "Blue":
                            JOptionPane.showMessageDialog(frame, "RED WON!"); 
                            break;
                    }
                    Board.initialPosition();
                }
            }
        }));
		
		JMenuItem exitItem=new JMenuItem("Exit");
		gameMenu.add(exitItem);
		exitItem.addActionListener(new ActionListener(){
			//Exit Game after click on "Exit" 
			public void actionPerformed(ActionEvent e)
			{
				System.exit(0);
			}
		});
		
		JMenu helpMenu = new JMenu("Help");
		menuBar.add(helpMenu);
		helpMenu.add(new JMenuItem("Tutorial"));
	}
    private String getFileExtension(File file){
        System.out.println("\nEnter getFileExtension()");
        String ext = "";
        System.out.println(file.getName());
        String name = file.getName();
        System.out.println("last index of: "+name.lastIndexOf("."));
        ext = name.substring(name.lastIndexOf(".")+1);
        System.out.println("Return: "+ext);
        return ext;
    }
}
