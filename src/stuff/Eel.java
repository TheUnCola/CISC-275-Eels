package stuff;

public class Eel extends GameObject {
	
	char[] eel;
	
	public Eel(char img, int length){//length will determine how long the eel is; determines the
		super(img);
		eel = new char[length];
		for(int i = 0; i<length; i++){
			eel[i]=img;
		}
	}

	@Override
	public void onMove() {
		// TODO Auto-generated method stub
		
	}
	
	
	


}
