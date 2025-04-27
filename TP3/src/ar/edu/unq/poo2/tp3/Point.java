package ar.edu.unq.poo2.tp3;

public class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;		this.y = y;
	}
	
	public Point() {
		this.x = 0;
		this.y = 0;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public Point sum(Point p) {
		Point newP = new Point(p.getX() + this.getX(), p.getY() + this.getY());
		return newP;
	}
}
