package temi.difficile;

public abstract class Connettore implements Componente {
	
	private Componente uscite[];
	
	public Connettore(int uscite) {
		this.uscite = new Componente[uscite];
	}
	
	public void propaga() {

	}

}
