
abstract public class ChessPiece {
	
	public char color;
	public int positionX;
	public int positionY;
	public boolean isCaptured = false;
	
	public ChessPiece(char color,int positionX,int positionY) 
	{
		this.color= color;
		this.positionX = positionX;
		this.positionY = positionY;
	}
	
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
	
	public boolean isCaptured() {
		return isCaptured;
	}

	public void setCaptured(boolean isCaptured) {
		this.isCaptured = isCaptured;
	}

	public abstract boolean canMoveTo(int destinationX,int destinationY);
	
	public abstract void moveTo(int destinationX,int destinationY);
	
	
}
