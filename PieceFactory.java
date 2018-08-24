public class PieceFactory{
    public Piece createPiece(String PieceType, String PieceColor){
        Piece newPiece = null;
        if(PieceType.equalsIgnoreCase("Triangle") & PieceColor.equalsIgnoreCase("Red")){
            return new Triangle("Red");
        } 
        else if(PieceType.equalsIgnoreCase("Triangle") & PieceColor.equalsIgnoreCase("Blue")){
            return new Triangle("Blue");
        }else{
            return null;
        }
    }
}