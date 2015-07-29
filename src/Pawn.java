
public class Pawn extends ChessPiece{
	
	public static final int STARTW = 2;
	public static final int STARTB = 7;

	public Pawn(char color, int positionX, int positionY) {
		super(color, positionX, positionY);
	}
	
	@Override
	public boolean canMoveTo(int destinationX, int destinationY) {
		return false;
	}

	public boolean canMoveTo(int destinationX, int destinationY, boolean capture) {
		if(capture){
			if(Math.abs(positionX-destinationX)==Math.abs(positionY-destinationY)){
				return true;
			}
		}else {
			if((positionY == STARTW && color == 'W') || (positionX == STARTB && color == 'B')){
				if(Math.abs(positionY - destinationY) == 2 || Math.abs(positionY - destinationY) == 1){
					return true;
				}else {
					if(Math.abs(positionY - destinationY) == 1){
						return true;
					}
				}
			}
			return false;
		}
		return false;
	}

	@Override
	public void moveTo(int destinationX, int destinationY) {
		positionX = destinationX;
		positionY = destinationY;
	}

}
