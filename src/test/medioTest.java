package test;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Random;

import org.junit.Before;
import org.junit.Test;

import temi.medio.ContainerAssicurato;

public class medioTest {
	
	ContainerAssicurato container;
	ArrayList<Integer> elenco;

	@Before
	public void init() {
		container = new ContainerAssicurato();
	}
	
	@Test
	public void inserimentoRandomTest() {
		creaListaRandom();
		
		container.carica(elenco);
		assertTrue(container.getContenuto().size() <= 5);
	}
	
	@Test
	public void inserimentoTest() {
		creaLista();
		
		container.carica(elenco);
		assertTrue(container.getContenuto().size() == 4);
	}
	
	private void creaListaRandom() {
		elenco = new ArrayList<>();
		
		for(int i = 0; i < 20; i++) 
			elenco.add(new Random().nextInt(20));
	}
	
	private void creaLista() {
		elenco = new ArrayList<>();
		
		elenco.add(1);
		elenco.add(3);
		elenco.add(5);
		elenco.add(7);
		elenco.add(11);
		elenco.add(12);
		elenco.add(15);
		
	}

}
