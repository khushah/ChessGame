import static org.junit.Assert.*;

import org.junit.Test;


public class RookTest {

	@Test
	public void testCanMoveTo() {
		Rook rook = new Rook('W',1,1);
		assertEquals("Return true for possible move for rook",true,rook.canMoveTo(1,4));
		assertEquals("Return false for possible move for rook",false,rook.canMoveTo(2,3));
		assertEquals("Return true for possible move for rook",true,rook.canMoveTo(1,7));
	}

}
