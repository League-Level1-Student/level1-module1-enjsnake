package _05_vault;

public class Spy {
	String spyName;
	int code;
	Spy(String name){
		this.spyName=name;
	}
	public int findCode(Vault vault) {
		
		for(int i=0;i<100000;i++) {
			if(vault.tryCode(i)) {
				return i;
				
			}
		
			else {
				return -1;
			}
			
		}
		return 0;
		
}
}
