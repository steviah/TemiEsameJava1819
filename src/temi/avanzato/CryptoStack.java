package temi.avanzato;

public abstract class CryptoStack implements Stack<Integer> {
	
	private int len;
	private Integer content[];
	
	public CryptoStack(int maxLen) {
		len = 0;
		content = new Integer[maxLen];		
	}
	
	public abstract Integer encode(Integer input);
	public abstract Integer decode(Integer input);
	
	@Override
	public void push(Integer item) {
		if(len >= content.length)
				 throw new IndexOutOfBoundsException(); 
		
		content[len++] = encode(item);
	}
	
	@Override
	public Integer pop() {
		if(len <= 0)
			throw new IndexOutOfBoundsException(); 
		
		return decode(content[--len]);
	}

}
