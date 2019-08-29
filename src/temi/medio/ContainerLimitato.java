package temi.medio;

import java.util.ArrayList;

public abstract class ContainerLimitato<T> implements Container<T> {

	public static final int CAPIENZA = 5;
	private int carico = 0;
	
	public void carica(ArrayList<T> elenco) {
		for(T item: elenco) {
			if(inserisci(item))
				carico++;
			
			else
				break;
		}
	}
	
}
