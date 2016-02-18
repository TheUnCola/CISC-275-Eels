package view;

public class Board {
	int[][] BoardArray;
	
	public Board() {
		BoardArray = new int[8][8];
	}
	
	public int getPos(int x,int y) {
		return BoardArray[x][y];
	}
	
	public void setPos(int x,int y,int val) {
		BoardArray[x][y] = val;
	}
}
