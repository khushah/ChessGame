
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
		if(displacementX==displacementY)
			return true;
		return false;
	}
	
	public boolean isAPlusMove()
	{
		
		return isAHorizontalMove()||isAVerticalMove();
	}
	
	public boolean isAnLShapedMove()
	{
		if((displacementX==2 && displacementY==1)|| (displacementY==2 && displacementX==1))
			return true;
		return false;
	}
	
	public boolean isAHorizontalMove()
	{
		if(displacementX!=0 && displacementY==0)
			return true;
		return false;
	}
	
	public boolean isAVerticalMove()
	{
		if(displacementY!=0 && displacementX==0)
			return true;
		return false;
	}

}
