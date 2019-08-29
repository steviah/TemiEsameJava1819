package temi.medio;

import temi.difficile.Connettore;

public class Dimmer extends Connettore {
	
	public static final int MAX = 5;
	private int l = 0;
	
	public void livello() {
		l++;
		
		if(l > 5)
			l = 0;
	}

	@Override
	public void attiva() {
		// TODO viene chiamato quando il componente viene attivato
	}

}
