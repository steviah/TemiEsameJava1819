package temi.medio;

import java.util.ArrayList;

public class ContainerAssicurato extends ContainerLimitato<Integer> {
	
	public static final int ASSICURATO = 10;
	private ArrayList<Integer> contenuto = new ArrayList<>();

	@Override
	public boolean inserisci(Integer item) {
		if(item > ASSICURATO)
			return false;
		
		contenuto.add(item);
		return true;
	}
	
	public ArrayList<Integer> getContenuto() {
		return contenuto;
	}

}
