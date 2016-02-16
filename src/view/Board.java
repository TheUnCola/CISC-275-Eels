package view;

public class Board {
	//Code For The Board View
	//Create An X/Y Grid
	int height;
	int width;
	int[][] BoardArray;
	
	public Board(int w,int h) {
		this.width = w;
		this.height = h;
		BoardArray = new int[w][h];
	}
	
	public int getPos(int x,int y) {
		return BoardArray[x][y];
	}
	
	public void setPos(int x,int y,int val) {
		BoardArray[x][y] = val;
	}
	
	public static void main(String[] args) {
		Board brd = new Board(5,3);
		brd.setPos(2,2,3);
		System.out.print(brd.getPos(2, 2));
	}
}
