package view;

public class Asterisk {
	
	int posx;
	int posy;
	
	//Asterisk Starts At Center
	public Asterisk() {
		this.posx = 4;
		this.posy = 4;
	}
	
	public Asterisk(int x,int y) {
		this.posx = x;
		this.posy = y;
	}
	
	public int getPosX() {
		return this.posx;
	}
	
	public int getPosY() {
		return this.posy;
	}
}
