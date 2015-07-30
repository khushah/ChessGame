import static org.junit.Assert.*;

import org.junit.Test;


public class QueenTest {

	@Test
	public void testCanMoveTo() {
		Queen queen = new Queen('W',5,1);
		assertEquals("Return true for possible move for queen",true,queen.canMoveTo(5,2));
		assertEquals("Return false for possible move for queen",false,queen.canMoveTo(4,7));
		assertEquals("Return true for possible move for queen",true,queen.canMoveTo(4,1));
	}

}
