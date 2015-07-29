import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ChessGame {

	public static void main(String[] args) throws IOException {
		FileReader pgnInputFile= new FileReader("C:/Users/test/Desktop/pgnInputFile.txt");
		BufferedReader in = new BufferedReader(pgnInputFile);
		String inputMoves=in.readLine();
		ChessBoard chessBoard = new ChessBoard();
		chessBoard.play(inputMoves);
	}

}
