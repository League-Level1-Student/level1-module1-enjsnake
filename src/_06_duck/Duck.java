package _06_duck;

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Duck {

	int numberOfFriends;
	String favoriteFood;
	JFrame frame=new JFrame();
	JPanel panel = new JPanel();
	Duck(int numberOfFriends, String favoriteFood){
		this.numberOfFriends = numberOfFriends;
		this.favoriteFood = favoriteFood;
	}
	public void quack() {
		JOptionPane.showMessageDialog(null, "Quack!!!");
	}
	
}
