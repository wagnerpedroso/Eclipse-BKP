import java.util.Scanner;

public class Exercicio_07 {
	
	public static void main(String[] args) {
	
	Scanner numeroSac = new Scanner(System.in);
	
	int numero; 
	int fat = 1; 
	
	
	System.out.println("Informe o numero: ");
	numero = numeroSac.nextInt();
	
	for (int i = 1; i <= numero; i++) {
		fat = fat * i;
	}
	
	System.out.println("Resultado do fatorial: "+ fat);
	
	}
	}



