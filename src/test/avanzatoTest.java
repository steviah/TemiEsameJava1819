package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import temi.avanzato.MagicStack;

public class avanzatoTest {
	
	MagicStack stack;
	
	@Before
	public void init() {
		stack = new MagicStack(5);
	}
	
	@Test
	public void operazioniTest() {
		stack.push(42);	
		stack.push(73);
		
		assertTrue(stack.pop().intValue() == 73);
		assertTrue(stack.pop().intValue() == 42);
	}
	
	@Test
	public void eccezioniTest() {
		try {
			stack.pop();
			fail();
		} catch (IndexOutOfBoundsException e) {
		} catch (Throwable e) {
			fail();
		}
		
		stack.push(42);	
		stack.push(42);
		stack.push(42);	
		stack.push(42);
		stack.push(42);	
		
		try {
			stack.push(42);	
			fail();
		} catch (Exception e) {
		} catch (Throwable e) {
			fail();
		}
	}

}
