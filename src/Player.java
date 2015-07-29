import java.awt.List;
import java.util.ArrayList;


public class Player 
{
	public char color;
	public ArrayList<ChessPiece> setOfPieces= new ArrayList<ChessPiece>();
	
	public Player(char color){
		setColor(color);
	}
	public char getColor() {
		return color;
	}
	public void setColor(char color) {
		this.color = color;
	}
	public ArrayList<ChessPiece> getSetOfPieces() {
		return setOfPieces;
	}
	public void setSetOfPieces(ArrayList<ChessPiece> setOfPieces) {
		this.setOfPieces = setOfPieces;
	}
	public void play(char rank,int destinationX,int destinationY,boolean capture) 
	{
		
		switch(rank)
		{
			case 'K':
				for(ChessPiece cp : setOfPieces)
				{
					if(cp instanceof King)
						cp.moveTo(destinationX, destinationY);
				}
				break;
			case 'Q':
				for(ChessPiece cp : setOfPieces)
				{
					if(cp instanceof Queen)
						cp.moveTo(destinationX, destinationY);
				}
				break;
			case 'N':
				for(ChessPiece cp : setOfPieces)
				{
					if(cp.isCaptured()==false && cp instanceof Knight && cp.canMoveTo(destinationX, destinationY))
						cp.moveTo(destinationX, destinationY);
				}
				break;
			case 'B':
				for(ChessPiece cp : setOfPieces)
				{
					if(cp.isCaptured()==false &&cp instanceof Bishop && cp.canMoveTo(destinationX, destinationY))
						cp.moveTo(destinationX, destinationY);
				}
				break;
			case 'R':
				for(ChessPiece cp : setOfPieces)
				{
					if(cp.isCaptured()==false && cp instanceof Rook && cp.canMoveTo(destinationX, destinationY))
						cp.moveTo(destinationX, destinationY);
				}
				break;
			case 'P':
				for(ChessPiece cp : setOfPieces)
				{
					if(cp.isCaptured()==false && cp instanceof Pawn && ((Pawn)cp).canMoveTo(destinationX, destinationY,capture))	///
						cp.moveTo(destinationX, destinationY);
				}
				break;
		}
	}
	
	public void play(char rank,int destinationX,int destinationY,int currentPositionX,boolean capture)
	{
		if(currentPositionX==-1)
			play(rank, destinationX, destinationY, capture);
		switch(rank)
		{
			case 'K':
				for(ChessPiece cp : setOfPieces)
				{
					if(cp instanceof King)
						cp.moveTo(destinationX, destinationY);
				}
				break;
			case 'Q':
				for(ChessPiece cp : setOfPieces)
				{
					if(cp instanceof Queen)
						cp.moveTo(destinationX, destinationY);
				}
				break;
			case 'N':
				for(ChessPiece cp : setOfPieces)
				{
					if(cp instanceof Knight && cp.getPositionX()==currentPositionX)
						cp.moveTo(destinationX, destinationY);
				}
				break;
			case 'B':
				for(ChessPiece cp : setOfPieces)
				{
					if(cp instanceof Bishop && cp.getPositionX()==currentPositionX)
						cp.moveTo(destinationX, destinationY);
				}
				break;
			case 'R':
				for(ChessPiece cp : setOfPieces)
				{
					if(cp instanceof Rook && cp.getPositionX()==currentPositionX)
						cp.moveTo(destinationX, destinationY);
				}
				break;
			case 'P':
				for(ChessPiece cp : setOfPieces)
				{
					if(cp instanceof Pawn && cp.getPositionX()==currentPositionX)	///
						cp.moveTo(destinationX, destinationY);
				}
				break;
		}
	}
	
	public void removeChessPieceAt(int positionX,int positionY)
	{
		for(ChessPiece cp : setOfPieces)
		{
			if(cp.getPositionX()==positionX && cp.getPositionY()==positionY)
				cp.setCaptured(true);
		}
	}
	
	
	
}
