package _05_vault;

public class Safe_Cracker {
	public static void main(String[]args) {
	Vault vault=new Vault();
	Spy spy=new Spy("James Bond");
	System.out.println(spy.findCode(vault));
	
}
	
}