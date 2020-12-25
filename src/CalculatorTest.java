import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	static Calculator c;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		c = new Calculator();
	}

	@Test
	void addition() {
		int prev = 0;
		for (int i = 0; i < 100; i++) {
			assertEquals(c.add(prev, i), i + prev);
			prev = i;
		}
	}
}
