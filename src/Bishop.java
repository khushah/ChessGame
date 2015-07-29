
public class Bishop extends ChessPiece{

	@Override
	public boolean canMoveTo(int destinationX, int destinationY) {
		Move move = new Move(positionX,positionY,destinationX,destinationY);
		if(move.isADiagonalMove()){
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
