import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ChessGame {

	public static void main(String[] args) throws IOException {
		InputStreamReader read=new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(read);
		System.out.println("Enter the chess moves in PGN format: ");
		String inputMoves= in.readLine();
		ChessBoard chessBoard = new ChessBoard();
		chessBoard.play(inputMoves);
	}

}
