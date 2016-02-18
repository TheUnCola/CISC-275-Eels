package stuff;

//for later implementation it may be wise to extend List here for the snakes

public abstract class GameObject{
	
	char img;//img takes the place of the ASCII character
	
	public abstract void onMove();
	
	public GameObject(char img){
		this.img=img;
	}
	
	

}
