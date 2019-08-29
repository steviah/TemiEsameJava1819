package temi.difficile;

public abstract class Connettore implements Componente {
	
	private Componente uscite[];
	
	public Connettore() {
		this.uscite = new Componente[8];
	}

	public void propaga() {
		attiva();
		
		for(Componente c: uscite)
			c.attiva();
		
		// TODO propoagazione agli altri componenti (?)
	}

}
