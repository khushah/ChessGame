import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ChessGame {
	public void formatInput(String inputMoves){
		String input[] = inputMoves.replace(".", " ").split(" ");
		int colorFlag=0;
		Player playerA = new Player("white");
		Player playerB = new Player("black");
		for(int i=0 ; i<input.length ; i++){
			if(i%3!=0 && colorFlag==0){
				playerA.move(input[i]);
				colorFlag=1;
			}
			else if(i%3!=0 && colorFlag==1){
				playerB.move(input[i]);
				colorFlag=0;
			}
		}
	}
	public void play(String input){
		
	}
	public static void main(String[] args) throws IOException {
		
		FileReader pgnInputFile= new FileReader("C:/Users/test/Desktop/pgnInputFile.txt");
		BufferedReader in = new BufferedReader(pgnInputFile);
		String inputMoves=in.readLine();
		ChessGame chessGame = new ChessGame();
		chessGame.formatInput(inputMoves);
	}

}
