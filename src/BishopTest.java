import static org.junit.Assert.*;

import org.junit.Test;


public class BishopTest {

	@Test
	public void testCanMoveTo() {
		Bishop bishop = new Bishop('W',3,1);
		assertEquals("Return true for possible move for bishop",true,bishop.canMoveTo(5,3));
		assertEquals("Return false for possible move for bishop",false,bishop.canMoveTo(4,7));
		assertEquals("Return true for possible move for bishop",true,bishop.canMoveTo(2,2));
	}

}
