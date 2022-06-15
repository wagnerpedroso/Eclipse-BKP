import java.util.Random;

public class Exercicio_01 {
	
  public static void main(String[] args) {
	  
    Random novoNumero = new Random();
    
    int valor = novoNumero.nextInt(10);
    System.out.println("Novo numero gerado: " + valor);
  }
}
