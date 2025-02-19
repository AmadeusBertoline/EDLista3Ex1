package controller;

public class DigitoController {
	
	public int ContaDigito(int num){
		
		if(num < 10) {
			
			return 1;
			
		}
		
		return 1 + ContaDigito(num / 10);
		
	}

}
