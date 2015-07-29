import java.awt.List;
import java.util.ArrayList;


public class Player {
	public char color;
	public ArrayList<ChessPiece> setOfPieces= new ArrayList<ChessPiece>();
	public Player(char color){
		setColor(color);
	}
	public char getColor() {
		return color;
	}
	public void setColor(char color) {
		this.color = color;
	}
	public ArrayList<ChessPiece> getSetOfPieces() {
		return setOfPieces;
	}
	public void setSetOfPieces(ArrayList<ChessPiece> setOfPieces) {
		this.setOfPieces = setOfPieces;
	}
	
}
