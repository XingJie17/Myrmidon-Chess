//package MyrmidonChess;
//Different colors of pieces in a chess game
//@author Lucinda

enum PieceColor
{
	//Colors name
	RED,BLUE;
	
	//Return string denotation of this color.(abbrev)
	public String abbrev()
	{
		switch(this)
		{
			case BLUE:
				return "b";
			case RED:
				return "r";
			default:
				return "-";
		}
	}
	
	//Return string  full denotation of this color.
	public String string()
	{
		switch(this)
		{
			case BLUE:
				return "BLUE";
			case RED:
				return "RED";
			default:
				return "-";
		}
	}
}