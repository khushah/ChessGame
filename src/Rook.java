
public class Rook extends ChessPiece{

	public Rook(char color, int positionX, int positionY) {
		super(color, positionX, positionY);
	}

	@Override
	public boolean canMoveTo(int destinationX, int destinationY) {
		Move move = new Move(positionX,positionY,destinationX,destinationY);
		if(move.isAPlusMove()){
			return true;
		}
		return false;
	}

	@Override
	public void moveTo(int destinationX, int destinationY) {
		positionX = destinationX;
		positionY = destinationY;
	}

}
