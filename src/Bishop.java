public class Bishop extends ChessPiece {

	public Bishop(char color, int positionX, int positionY) 
	{
		super(color, positionX, positionY);
	}

	@Override
	public boolean canMoveTo(int destinationX, int destinationY) {
		return false;
	}

	@Override
	public boolean moveTo(int destinationX, int destinationY) {
		return false;
	}

}
