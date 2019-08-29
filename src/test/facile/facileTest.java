package test.facile;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import temi.facile.Quadrato;

public class facileTest {
	
	public Quadrato quadrato;

	@Before
	public void init() {
		quadrato = new Quadrato(0, 0, 5);
	}
	
	@Test
	public void areaTest() {
		assertEquals(quadrato.area(), 25, 0.00001);
	}
	
	@Test
	public void perimetroTest() {
		assertEquals(quadrato.perimetro(), 20, 0.00001);
	}
	
	@Test
	public void contenutoTest() {
		assertTrue(quadrato.contenuto(3.14, 2.72));
		assertFalse(quadrato.contenuto(42, 42));
	}

}
