import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ChessGame {
	Player playerA = new Player('W');
	Player playerB = new Player('B');

	public void formatInput(String inputMoves) {
		String input[] = inputMoves.replace(".", " ").split(" ");
		int colorFlag = 0;
		boolean capture = false;
		boolean isCastling;
		int[] move = null;
		for (int i = 0; i < input.length; i++) {
			isCastling = isCastlingMove(input[i]);
			if (i % 3 != 0 && !isCastling) {
				move = splitMove(input[i]);
				capture = (move[4] == 1) ? true : false;
			}

			if (i % 3 != 0 && colorFlag == 0 && !isCastling) {

				playerA.play((char) move[0], move[1], move[2], move[3], capture);
				colorFlag = 1;
				if (capture) {
					playerB.removeChessPieceAt(move[1], move[2]);
				}
			} else if (i % 3 != 0 && colorFlag == 1 && !isCastling) {

				playerB.play((char) move[0], move[1], move[2], move[3], capture);
				colorFlag = 0;
				if (capture) {
					playerA.removeChessPieceAt(move[1], move[2]);
				}
			} else if (i % 3 != 0 && colorFlag == 0 && isCastling) {
				playerA.playCastlingMove((input[i].length()==3));
				colorFlag=1;
				
			} else if (i % 3 != 0 && colorFlag == 1 && isCastling) {
				playerB.playCastlingMove((input[i].length()==3));
				colorFlag=0;
			}
		}
	}

	public boolean isPawnMove(String move) {
		char firstChar = move.charAt(0);
		return firstChar >= 'a' && firstChar <= 'z';
	}

	public boolean isCastlingMove(String move) {
		char firstChar = move.charAt(0);
		return firstChar == 'O';
	}

	public int[] splitMove(String move) {
		char piece;
		int posX;
		int posY;
		boolean capture;
		String POSITION_X = "abcdefgf";
		int currentPos;
		if (isPawnMove(move)) {
			if (move.contains("x")) {
				capture = true;
				posX = POSITION_X.indexOf(move.charAt(2)) + 1;
				posY = Character.getNumericValue(move.charAt(3));
				currentPos = POSITION_X.indexOf(move.charAt(0)) + 1;
			} else {
				capture = false;
				posX = POSITION_X.indexOf(move.charAt(0)) + 1;
				posY = Character.getNumericValue(move.charAt(1));
				currentPos = -1;
			}
			piece = 'P';
		} else {
			if (move.contains("x")) {
				capture = true;
				posX = POSITION_X.indexOf(move.charAt(2)) + 1;
				posY = Character.getNumericValue(move.charAt(3));
				currentPos = -1;
			} else {
				capture = false;
				if (move.length() == 4) {
					posX = POSITION_X.indexOf(move.charAt(2)) + 1;
					posY = Character.getNumericValue(move.charAt(3));
					currentPos = POSITION_X.indexOf(move.charAt(1)) + 1;
				} else {
					posX = POSITION_X.indexOf(move.charAt(1)) + 1;
					posY = Character.getNumericValue(move.charAt(2));
					currentPos = -1;
				}
			}
			piece = move.charAt(0);
		}
		int splittedMove[] = { piece, posX, posY, currentPos, capture ? 1 : 0 };
		return splittedMove;
	}

	public void display() {
		ArrayList<String> statusOfPlayerA = playerA.returnStatus();
		ArrayList<String> statusOfPlayerB = playerB.returnStatus();
		System.out.println("Current positions of Player A");
		for (int i = 0; i < statusOfPlayerA.size(); i++) {
			System.out.println(statusOfPlayerA.get(i));
		}
		System.out.println("Current positions of Player B");
		for (int i = 0; i < statusOfPlayerB.size(); i++) {
			System.out.println(statusOfPlayerB.get(i));
		}
	}

	public static void main(String[] args) throws IOException {

		FileReader pgnInputFile = new FileReader(
				"C:/Users/test/Desktop/pgnInputFile.txt");
		BufferedReader in = new BufferedReader(pgnInputFile);
		String inputMoves = in.readLine();
		ChessGame chessGame = new ChessGame();
		chessGame.formatInput(inputMoves);
		chessGame.display();
	}

}
