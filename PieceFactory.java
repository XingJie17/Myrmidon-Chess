//package myrmidonChess;

public class PieceFactory{
    public Piece createPiece(String PieceType, String PieceColor){
        
        if (PieceType.equalsIgnoreCase("Triangle") & PieceColor.equalsIgnoreCase("Red")){
            return new Triangle("Red");
        } else if (PieceType.equalsIgnoreCase("Triangle") & PieceColor.equalsIgnoreCase("Blue")){
            return new Triangle("Blue");
        } else if (PieceType.equalsIgnoreCase("Sun") & PieceColor.equalsIgnoreCase("Red")){
            return new Sun("Red");
        } else if (PieceType.equalsIgnoreCase("Sun") & PieceColor.equalsIgnoreCase("Blue")){
            return new Sun("Blue");
        } else if (PieceType.equalsIgnoreCase("Chevron") & PieceColor.equalsIgnoreCase("Red")){
            return new Chevron("Red");
        } else if (PieceType.equalsIgnoreCase("Chevron") & PieceColor.equalsIgnoreCase("Blue")){
            return new Chevron("Blue");
        } else if (PieceType.equalsIgnoreCase("Plus") & PieceColor.equalsIgnoreCase("Red")){
            return new Plus("Red");
        } else if (PieceType.equalsIgnoreCase("Plus") & PieceColor.equalsIgnoreCase("Blue")){
            return new Plus("Blue");    
        } else if (PieceType.equalsIgnoreCase("Empty")){
            return new Empty("White");    
        } else {
            return null;
        }
    }
}
