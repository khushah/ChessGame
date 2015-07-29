import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ChessGame {

	public static void main(String[] args) throws IOException {
		FileReader pgnInputFile= new FileReader("C:\\ChessGame\\Adams.pgn");
		BufferedReader in = new BufferedReader(pgnInputFile);
		String inputMoves=in.readLine();
		ChessBoard chessBoard = new ChessBoard();
		chessBoard.play(inputMoves);
		in.close();
	}

}
