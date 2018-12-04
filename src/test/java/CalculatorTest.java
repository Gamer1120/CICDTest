import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

	@Test
	public void addTest() {
		assertEquals(Calculator.add(1, 1), 2);
	}
}
