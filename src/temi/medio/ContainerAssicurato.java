package temi.medio;

public class ContainerAssicurato extends ContainerLimitato<Integer> {
	
	public static final int ASSICURATO = 10;

	@Override
	public boolean inserisci(Integer item) {
		return true;
	}

}
