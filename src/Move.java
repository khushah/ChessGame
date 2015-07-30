
public class Move 
{
	int sourceX,sourceY,destinationX,destinationY,displacementX,displacementY;
	
	public Move(int sourceX,int sourceY,int destinationX,int destinationY) 
	{
		this.sourceX = sourceX;
		this.sourceY = sourceY;
		this.destinationX = destinationX;
		this.destinationY = destinationY;
		displacementX = Math.abs(sourceX-destinationX);
		displacementY = Math.abs(sourceY-destinationY);
		
	}
	
	public boolean isADiagonalMove()
	{
			return displacementX==displacementY;
	}
	
	public boolean isAPlusMove()
	{
		
		return isAHorizontalMove()||isAVerticalMove();
	}
	
	public boolean isAnLShapedMove()
	{
			return (displacementX==2 && displacementY==1)|| (displacementY==2 && displacementX==1);	
	}
	
	public boolean isAHorizontalMove()
	{
			return (displacementX!=0 && displacementY==0);
	}
	
	public boolean isAVerticalMove()
	{
			return (displacementY!=0 && displacementX==0);
	}

}
