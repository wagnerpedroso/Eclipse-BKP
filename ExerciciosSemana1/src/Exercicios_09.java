import java.util.Scanner;

public class Exercicios_09 {
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		int numeroSelecionado = 0; //Indica sabor selecionado 
		int brocolis = 1; // sabor pizza		
		int calabresa = 1; // sabor pizza
		int frango = 1; // sabor pizza
		int sabor = 0; // segundo scanner
		
		boolean satisfeito = false;
		boolean satisfeitoFatias = false;
		
		
		System.out.print("Digite sabor da pizza desejada.   "
				+ "\nOpções:"
				+ "\n1 - Brocolis"
				+ "\n2 - Calabresa"        //Primeira impressão no console 
				+ "\n3 - Frango"
				+ "\nSabor: ");
		
		numeroSelecionado = scanner.nextInt(); // Leitor da Opção "scanner"
		
		// *********************************** Brocolis
		
				if (numeroSelecionado == 1)  {  // Caso verdadeiro 
				while(!satisfeitoFatias) {        // Repete até que seja falso
					 
					System.out.println("Você selecionou Brocolis, Deseja mais uma fatia?"
						+ "\n1 - Sim"       //impressão caso selecione broclis 
						+ "\n2 - Não");
					sabor = scanner.nextInt(); // Leitor da Opção lida
					 if (sabor == 1)  // Caso verdadeiro 
						brocolis ++; // Soma brocolis
				 else {
						 System.out.println("Você comeu " + brocolis + " de fatias de Brocolis ");
					satisfeitoFatias = true;
				 }
				}
				}
				// *********************************** Calabresa
				else if (numeroSelecionado == 2)  {  // Caso verdadeiro 
					while(!satisfeitoFatias) {  // Repete até que seja falso
						
						System.out.println("Você selecionou Calabresa, Deseja mais uma fatia?"
							+ "\n1 - Sim"       //impressão caso selecione Calabresa
							+ "\n2 - Não");
						
						sabor = scanner.nextInt();
						 if (sabor == 1) // Caso verdadeiro 
							calabresa ++;
						 else {
							 	System.out.println("Você comeu " + calabresa + " de fatias de calabresa ");
					    satisfeitoFatias = true;
						 }
					}
					}
						// *********************************** Frango 
					    
						else if (numeroSelecionado == 3)  { 
							while(!satisfeitoFatias) {  
								
								System.out.println("Você selecionou Frango,Deseja mais uma fatia?"
									+ "\n1 - Sim"      
									+ "\n2 - Não");
								
								sabor = scanner.nextInt();
								 if (sabor == 1)
									frango ++;
								 else {
									 	System.out.println("Você comeu " + frango + " de fatias de frango ");
							    satisfeitoFatias = true;
				
								 }
							}			 
						}		 
					}
					
					}