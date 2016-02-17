package play;

import java.util.Scanner;

public class Play {
	public static void main(String[] args) {
		menu();
	}
	
	public static void menu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Would you like to play?");
		String menu = scan.next();
		if(menu.equals("Yes")) start();
	}
	
	public static void start() {
		System.out.println("The Game Has Begun");
	}
}
