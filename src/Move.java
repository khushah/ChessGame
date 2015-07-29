
public class Move 
{
	int sourceX,sourceY,destinationX,destinationY;
	
	public Move(int sourceX,int sourceY,int destinationX,int destinationY) 
	{
		this.sourceX = sourceX;
		this.sourceY = sourceY;
		this.destinationX = destinationX;
		this.destinationY = destinationY;
	}
	
	public boolean isADiagonalMove()
	{
		if(Math.abs(sourceX-destinationX)==Math.abs(sourceY-destinationY))
			return true;
		return false;
	}

}
