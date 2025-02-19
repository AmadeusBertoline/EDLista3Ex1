package view;
import controller.DigitoController;
import java.util.Scanner;


public class DigitoMain {

	public static void main(String[] args) {
		
		DigitoController digito  = new DigitoController();
		Scanner scanner = new Scanner(System.in);
		
		int res, num;
		
		System.out.println("Digite um número qualquer: ");
		num = scanner.nextInt();
		
		res = digito.ContaDigito(num);
		
		System.out.println("Quantidade de dígitos: "+ res);
		
		scanner.close();
		
	}
	
}
