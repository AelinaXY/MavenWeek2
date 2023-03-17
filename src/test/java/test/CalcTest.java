package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalcTest {

	private Calculator calc = new Calculator();

	@Test
	void testAdd() {
		assertEquals(10, this.calc.add(3, 7));
	}

	@Test
	void testSub() {
		assertEquals(-4, this.calc.subtract(3, 7));
	}

}
