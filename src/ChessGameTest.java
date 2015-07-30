import static org.junit.Assert.*;

import org.junit.Test;


public class ChessGameTest {

	@Test
	public void testSplitMoveForPawn() {
		ChessGame chessGame = new ChessGame();
		int[] splittedMove = chessGame.splitMove("e4");
		assertEquals("Piece: P", 'P', (char)splittedMove[0]);
		assertEquals("DestinationX", 5, splittedMove[1]);
		assertEquals("DestinationY", 4, splittedMove[2]);
		assertEquals("Capture", 0, splittedMove[4]);
	}

	@Test
	public void testSplitMoveForKnight() {
		ChessGame chessGame = new ChessGame();
		int[] splittedMove = chessGame.splitMove("Nf3");
		assertEquals("Piece: N", 'N', (char)splittedMove[0]);
		assertEquals("DestinationX", 6, splittedMove[1]);
		assertEquals("DestinationY", 3, splittedMove[2]);
		assertEquals("Capture", 0, splittedMove[4]);
	}
	@Test
	public void testSplitMoveForCapture() {
		ChessGame chessGame = new ChessGame();
		int[] splittedMove = chessGame.splitMove("Bxd2");
		assertEquals("Piece: B", 'B', (char)splittedMove[0]);
		assertEquals("DestinationX", 4, splittedMove[1]);
		assertEquals("DestinationY", 2, splittedMove[2]);
		assertEquals("Capture", 1, splittedMove[4]);
	}
	@Test
	public void testIsPawnMove() {
		ChessGame chessGame = new ChessGame();
		assertEquals("Returns True", true,chessGame.isPawnMove("e5") );
		assertEquals("Returns True", false,chessGame.isPawnMove("Nd4") );
		assertEquals("Returns True", true,chessGame.isPawnMove("fx5") );
	}
	@Test
	public void testIsCastlingMove() {
		ChessGame chessGame = new ChessGame();
		assertEquals("Returns True", true,chessGame.isCastlingMove("O-O") );
		assertEquals("Returns True", false,chessGame.isPawnMove("Nd4") );
	}
	

}
