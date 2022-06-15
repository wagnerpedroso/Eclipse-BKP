import java.util.Scanner;

public class Exercicio_10 {
	public static void main(String[] args) {

		Scanner numero = new Scanner(System.in);
		int valor = 0, cont = 0;

		System.out.print("Digite o numero : ");
		valor = numero.nextInt();

		for (int i = 1; i <= valor; i++) {
			if (valor % i == 0) {
				cont++;
			}
		}
		if (cont == 2) {
			System.out.println("O numero " + valor + " é primo");
		} else {
			System.out.println("O numero " + valor + " não é primo");
		}

	}
}