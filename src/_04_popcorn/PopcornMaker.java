package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
	static String answer;
	public static void main(String[] args) {
		answer=JOptionPane.showInputDialog("What flavor of popcorn do you want?");
		Popcorn popcorn=new Popcorn(answer);
		answer=JOptionPane.showInputDialog("How long do you want to cook the popcorn");
		int minsToCook= Integer.parseInt(answer);
		Microwave microwave=new Microwave();
		microwave.setTime(minsToCook);
		microwave.putInMicrowave(popcorn);
		microwave.startMicrowave();
		popcorn.eat();
		

	}

}
