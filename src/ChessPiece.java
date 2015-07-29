
abstract public class ChessPiece {
	
	public char color;
	public int positionX;
	public int positionY;
	public char getColor() {
		return color;
	}
	public void setColor(char color) {
		this.color = color;
	}
	public int getPositionX() {
		return positionX;
	}
	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}
	public int getPositionY() {
		return positionY;
	}
	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}
	
	public abstract boolean canMoveTo(int destinationX,int destinationY);
	
	public abstract void moveTo(int destinationX,int destinationY);
	
	
}
