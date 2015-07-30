
public class Knight extends ChessPiece{

	public Knight(char color, int positionX, int positionY) {
		super(color, positionX, positionY);
	}

	@Override

	public boolean canMoveTo(int destinationX, int destinationY) {
		Move move = new Move(positionX,positionY,destinationX,destinationY);
			return move.isAnLShapedMove();
	}

	@Override
	public void moveTo(int destinationX, int destinationY) {
			positionX = destinationX;
			positionY = destinationY;
	}

}
