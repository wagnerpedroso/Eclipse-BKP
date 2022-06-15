import java.util.Scanner;

class Exercicio_05 {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Digite seu nome: ");
        
        String nome = scanner.next();
        
            
        long somaCharacters = nome.chars().count();

        System.out.println("Quantidade de numero: " + somaCharacters); 
    }
}