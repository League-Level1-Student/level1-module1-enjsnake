package _06_duck;

import javax.swing.JOptionPane;

public class Snake {
	int animalsToBeEaten;
	String favoriteFood;
	
	Snake(int animalsToBeEaten, String favoriteFood){
		this.animalsToBeEaten=animalsToBeEaten;
		this.favoriteFood=favoriteFood;
	}
	
	public void attack() {
		JOptionPane.showMessageDialog(null, favoriteFood + " has just been gobbled by the snake");
	}
	
}
