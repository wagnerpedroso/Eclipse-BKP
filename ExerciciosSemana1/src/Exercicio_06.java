import java.util.Scanner;

class Exercicio_06 {

	public static void main(String[] args) {

		Scanner notas = new Scanner(System.in);

		int notaPrimeiroSemestre, notaSegundoSemestre, notaTerceiroSemestre, notaQuartoSemestre;

		System.out.print("Digite Primeiro semestre : ");

		notaPrimeiroSemestre = notas.nextInt();

		System.out.print("Digite Segundo semestre : ");

		notaSegundoSemestre = notas.nextInt();

		System.out.print("Digite terceiro semestre : ");

		notaTerceiroSemestre = notas.nextInt();

		System.out.print("Digite quarto semestre : ");

		notaQuartoSemestre = notas.nextInt();

		double soma = (notaPrimeiroSemestre + notaSegundoSemestre + notaTerceiroSemestre + notaQuartoSemestre);

		double quantidadeDeNotas = 4;

		double notaFinal = (soma / quantidadeDeNotas);

		System.out.print(notaFinal);

		
		
		
		
		
		// ystem.out.print(soma / 4);
		// ystem.out.print(notaFinal);

		// imprime a nota do 4 semestre.

		// System.out.println(notaPrimeiroSemestre + notaSegundoSemestre +
		// notaTerceiroSemestre + notaQuartoSemestre);

		// static void sum(string notaPrimeiroSemestre,string notaSegundoSemestre,string
		// notaTerceiroSemestre,string notaQuartoSemestre);

		// System.out.println(sum);

		// long somaCharacters = notaQuartoSemestre.char().count();

		// System.out.println("Quantidade de numero: " + somaCharacters);

	}
}