
public class Pawn extends ChessPiece{

	public Pawn(char color, int positionX, int positionY) {
		super(color, positionX, positionY);
	}

	@Override
	public boolean canMoveTo(int destinationX, int destinationY) {
		Move move = new Move(positionX,positionY,destinationX,destinationY);
		return false;
	}
	
	public boolean canMoveTo(int destinationX, int destinationY,boolean capture)
	{
		return capture;
		
	}

	@Override
	public void moveTo(int destinationX, int destinationY) {
		positionX = destinationX;
		positionY = destinationY;
	}

}
