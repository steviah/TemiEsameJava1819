package temi.avanzato;

public class MagicStack extends CryptoStack {	

	public MagicStack(int maxLen) {
		super(maxLen);
	}

	@Override
	public Integer encode(Integer input) {
		return input + 42;
	}

	@Override
	public Integer decode(Integer input) {
		return input - 42;
	}

}
