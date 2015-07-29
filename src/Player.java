import java.awt.List;
import java.util.ArrayList;


public class Player 
{
	public char color;
	public ArrayList<ChessPiece> setOfPieces= new ArrayList<ChessPiece>();
	
	
	public Player(char color){
		setColor(color);
		int initialY;
		if(color=='W')
			initialY=1;
		else
			initialY=8;
		setOfPieces.add( new King(color,5,initialY));
		setOfPieces.add( new Queen(color,4,initialY));
		setOfPieces.add( new Bishop(color,3,initialY));
		setOfPieces.add( new Bishop(color,6,initialY));
		setOfPieces.add( new Knight(color,2,initialY));
		setOfPieces.add( new Knight(color,7,initialY));
		setOfPieces.add( new Rook(color,1,initialY));
		setOfPieces.add( new Rook(color,8,initialY));
		if(color=='W')
			initialY=2;
		else
			initialY=7;
		for(int i=1;i<=8;i++){
			setOfPieces.add( new Pawn(color,i,initialY));
		}
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
	
	public void play(char rank,int destinationX,int destinationY,int identifyingPositionX,boolean capture)
	{
		if(identifyingPositionX==-1)
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
					if(cp instanceof Knight && cp.getPositionX()==identifyingPositionX)
						cp.moveTo(destinationX, destinationY);
				}
				break;
			case 'B':
				for(ChessPiece cp : setOfPieces)
				{
					if(cp instanceof Bishop && cp.getPositionX()==identifyingPositionX)
						cp.moveTo(destinationX, destinationY);
				}
				break;
			case 'R':
				for(ChessPiece cp : setOfPieces)
				{
					if(cp instanceof Rook && cp.getPositionX()==identifyingPositionX)
						cp.moveTo(destinationX, destinationY);
				}
				break;
			case 'P':
				for(ChessPiece cp : setOfPieces)
				{
					if(cp instanceof Pawn && cp.getPositionX()==identifyingPositionX)	///
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
	
	public ArrayList<String> returnStatus()
	{
		ArrayList<String> remainingChessPieces = new ArrayList<String>();
		for(ChessPiece cp : setOfPieces)
		{
			if(cp.isCaptured()==false)
			{
				String currentChessPieceStatus = color +" "+ getTypeString(cp) +" -> ("+ cp.getPositionX()+","+cp.getPositionX()+")";
				remainingChessPieces.add(currentChessPieceStatus);
			}
		}
		return remainingChessPieces;
		
	}
	private String getTypeString(ChessPiece cp) 
	{
		if(cp instanceof King)
			return "K";
		else if (cp instanceof Queen)
			return "Q";
		else if (cp instanceof Knight)
			return "N";
		else if (cp instanceof Bishop)
			return "B";
		else if (cp instanceof Rook)
			return "R";
		else if (cp instanceof Pawn)
			return "P";
		return null;
	}
	
	
}
