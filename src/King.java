
public class King extends ChessPiece{

	public King(char color, int positionX, int positionY) {
		super(color, positionX, positionY);
	}

	@Override
	public boolean canMoveTo(int destinationX, int destinationY) {
		Move move = new Move(positionX,positionY,destinationX,destinationY);
			return move.isADiagonalMove() || move.isAPlusMove();
	}

	@Override
	public void moveTo(int destinationX, int destinationY) {
		positionX = destinationX;
		positionY = destinationY;
	}

}
