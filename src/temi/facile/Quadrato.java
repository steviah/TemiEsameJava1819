package temi.facile;

/**
 * @author steviah
 *
 */
public class Quadrato extends Figura {
	
	private double x;
	private double y;
	private double l;
	
	public Quadrato(double x, double y, double l) {
		this.x = x;
		this.y = y;
		this.l = l;
	}

	@Override
	public double area() {
		return l*l;
	}

	@Override
	public double perimetro() {
		return l*4;
	}

	@Override
	public boolean contenuto(double x1, double y1) {
		if(x <= x1 && x1 <= (x + l) && y <= y1 && y1 <= (y + l))
			return true;
		
		return false;
	}
	
	public double getX() {
		return x;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public double getXL() {
		return l;
	}
	
	public void setL(double l) {
		this.l = l;
	}

}
