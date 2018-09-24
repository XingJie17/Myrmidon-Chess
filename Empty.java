//package myrmidonChess;

import java.util.ArrayList;
/*(Jeff)*/
public class Empty extends Piece {
    private String type;
    private String color;
    public Empty(String color){
        this.setType("Empty");
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
        // the Arraylist is empty because this is an empty piece yo
        ArrayList<Integer> a = new ArrayList<Integer>();
        return a;
    }
    
}