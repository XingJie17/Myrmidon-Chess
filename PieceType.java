//package MyrmidonChess;
//The different type of pieces in a chess game
//@author Lucinda

enum PieceType
{
	//Pieces name
	PLUS,TRIANGLE,CHEVRON,SUN;
	
	//Return string denotation of this pieces
	String abbrev()
	{
		switch(this)
		{
		case PLUS:
            return "pl";
        case TRIANGLE:
            return "tr";
        case CHEVRON:
            return "ch";
        case SUN:
            return "su";
        default:
            return "-";
		}
	}
	
	
}