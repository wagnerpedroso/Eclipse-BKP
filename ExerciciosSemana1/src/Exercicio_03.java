import java.util.Scanner;

class Exercicio_03 {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Digite seu nome: ");
        
        String nome = scanner.next();
        
        System.out.print("Digite seu sobrenome: ");
        
        String sobrenome = scanner.next();
        
        
        System.out.print("Nome seu completo: " + nome );
        System.out.print(" " + sobrenome);
    }
}