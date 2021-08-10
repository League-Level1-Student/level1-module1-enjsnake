package _05_vault;

import java.util.Random;

import javax.swing.JOptionPane;

public class Vault {
	public int vaultCode;
	Random ran =new Random();
	
	Vault(){
		vaultCode=ran.nextInt(11);
		System.out.println("This vault now has a code of "+ vaultCode);
	}
	public boolean tryCode(int codeTry) {
		return codeTry==vaultCode;
	}
	
}
	