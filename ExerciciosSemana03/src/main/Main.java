package main;
import java.util.Scanner;

import usuarios.Usuarios;
import filmes.Filme;
import recomendacoes.Recomendacoes;



public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int recomed = 0;
		
		//Pacote filmes
		//Criação do primeiro filme. 
		
		Filme filme1 = new Filme('1', "John Wick", "Filme de ação com cachorro.", "ação", "www.teste.com.br", "Curtidas:");
		//System.out.println(filme1.id + " " + filme1.nome + " " + filme1.genero + " " + filme1.sinopse + " " + filme1.link);		// + " " + filme1.curtidaUsers);
		
		//Criação do segundo filme. 
	
		Filme filme2 = new Filme('2', "Jack Ryan", "Filme de ação da amazom.", "ação", "www.teste2.com.br", "Curtidas:");
		//System.out.println(filme2.id + " " + filme2.nome + " " + filme2.genero + " " + filme2.sinopse + " " + filme2.link);		// + " " + filme2.curtidaUsers);
	
		//Criação do Terceiro filme. 

		Filme filme3 = new Filme('3', "Homem Aranha", "Filme de ação e emoção.", "ação", "www.teste3.com.br", "Curtidas:");
		//System.out.println(filme3.id + " " + filme3.nome + " " + filme3.genero + " " + filme3.sinopse + " " + filme3.link);		//+ " " + filme3.curtidaUsers);

		//Criação do Quarto filme
		Filme filme4 = new Filme('4', "The chamado", "Filme de terror e suspense", "Terror", "www.teste4.com.br", "Curtidas:");
		//System.out.println(filme4.id + " " + filme4.nome + " " + filme4.genero + " " + filme4.sinopse + " " + filme4.link);		// + " " + filme1.curtidaUsers);
		
		//Criação do Quinto filme. 
	
		Filme filme5 = new Filme('5', "De ferias com a familia ", "Filme de comédia, familia.", "comédia", "www.teste5.com.br", "Curtidas:");
		//System.out.println(filme5.id + " " + filme5.nome + " " + filme5.genero + " " + filme5.sinopse + " " + filme5.link);		// + " " + filme2.curtidaUsers);
	
		//Criação do Sexto filme. 

		Filme filme6 = new Filme('6', "Homem Aranha 2", "Filme de ação e emoção2.", "ação", "www.teste6.com.br", "Curtidas:");
		//System.out.println(filme3.id + " " + filme6.nome + " " + filme6.genero + " " + filme6.sinopse + " " + filme6.link);		//+ " " + filme3.curtidaUsers);

		
		//Pacote usuario 
		// criação de um novo usuario
		
		Usuarios userFlix01 = new Usuarios("Wagner Pedroso" ,"Rua Manus nº:615","24.10.1995");
	//	System.out.println(userFlix01.nomeCompleto + " " + userFlix01.endereco + " " + userFlix01.dataNascimento); // + " " + userFlix01.curtidaUser);
		
		// criação do Segundo usuario. 
		
		Usuarios userFlix02 = new Usuarios("Jessica Milwerstet" ,"Rua Manus nº:615","05/12/2000");
	//	System.out.println(userFlix02.nomeCompleto + " " + userFlix01.endereco + " " + userFlix01.dataNascimento); // + " " + userFlix02.curtidaUser);
		
		// criação do Terceiro usuario. 
		
		Usuarios userFlix03 = new Usuarios("Jessica Milwerstet Pedroso" ,"Rua Manus nº:615","05/12/2000");
	//	System.out.println(userFlix03.nomeCompleto + " " + userFlix01.endereco + " " + userFlix01.dataNascimento); // + " " + userFlix03.curtidaUser);
		
		// criação do Quarto usuario. 
		
		Usuarios userFlix04 = new Usuarios("Jessica 04" ,"Rua Manus nº:615","05/12/2004");
	//	System.out.println(userFlix04.nomeCompleto + " " + userFlix04.endereco + " " + userFlix04.dataNascimento); // + " " + userFlix04.curtidaUser);
		
		// criação do Quinto usuario. 
		
		Usuarios userFlix05 = new Usuarios("Jessica 05" ,"Rua Manus nº:615","05/12/2005");
	//  System.out.println(userFlix05.nomeCompleto + " " + userFlix05.endereco + " " + userFlix05.dataNascimento); // + " " + userFlix05.curtidaUser);
		
		
		
//		//Menu 
//		System.out.println("Olá, Bem vindo ao DevInFlix de Wagner Pedroso.");
//		
//		System.out.println("Menu: \n1 - Para assistir filmes  \n2 - Curtit filmes \n3 - Recomendar filmes \n4 - Sujerir novos filmes ");
//		
//		int menu = scanner.nextInt(); //Scanner Seleciona Filme 		
//		 if (menu == 1)
//		
//		System.out.println("Escolha seu Filme: ");
//		 
//		 if (menu == 2)
//			 
//		 System.out.println("Selecione seu filme para Curtir S2 :");
//		 
//		 if (menu == 3)
//			 
//			 System.out.println("Selecione seu filme para Recomendar =) :");
//			 
//		 else  {
//			 System.out.println("Digite nome do filme para recomendar: ");
//			 //  recomendacoes1 = Scanner.string(); 
//	String recome = scanner.next();
//	System.out.println("Sua recomendação de filme foi: " + recome);
//			 }
//			
				//Menu 
				System.out.println("Olá, Bem vindo ao DevInFlix de Wagner Pedroso.");
				
				
				System.out.println("Menu: \n1 - Para assistir filmes  \n2 - Curtit filmes \n3 - Recomendar filmes \n4 - Sujerir novos filmes \n5 - Você já recomendou? ");
				
				
				int menu = scanner.nextInt(); //Scanner Seleciona Filme 		
				if (menu == 1) {
				
				System.out.println("Escolha seu Filme: ");
				
				 System.out.println("Selecione seu filme para Assistir:");
					System.out.println("1" +  " " + filme1.nome + " " + filme1.genero + " " + filme1.sinopse);// + " " + filme1.link);
					System.out.println("2" +  " " + filme2.nome + " " + filme2.genero + " " + filme2.sinopse);// + " " + filme2.link);
					System.out.println("3" +  " " + filme3.nome + " " + filme3.genero + " " + filme3.sinopse);// + " " + filme3.link);
					System.out.println("4" +  " " + filme4.nome + " " + filme4.genero + " " + filme4.sinopse);// + " " + filme4.link);
					System.out.println("5" +  " " + filme5.nome + " " + filme5.genero + " " + filme5.sinopse);// + " " + filme5.link);
					System.out.println("6" +  " " + filme6.nome + " " + filme6.genero + " " + filme6.sinopse);// + " " + filme6.link);
					System.out.println("Opção: ");
					
					//Seleciona Filme
					int id = scanner.nextInt(); //Scanner Seleciona Filme 		
					 //Filme 01
					 if (id == 1)  // Caso verdadeiro 
					System.out.println("Play " + filme1.nome);	 
					 //Filme 02
					 if (id == 2) // Caso verdadeiro 
					 System.out.println("Play " + filme2.nome);		 
					//Filme 03		  
					 if (id == 3) // Caso verdadeiro 
					 System.out.println("Play " + filme3.nome);	
					 //Filme04
					 if (id == 4)  // Caso verdadeiro 
					System.out.println("Play " + filme4.nome);	 
					//Filme 05
					if (id == 5) // Caso verdadeiro 
					 System.out.println("Play " + filme5.nome);		 
					//Filme 06		  
					 if (id == 6) // Caso verdadeiro 
					 System.out.println("Play " + filme6.nome);	
					 
				
				}
				 if (menu == 2)  {
					 
				 System.out.println("Selecione seu filme para Curti :");
						System.out.println("1" +  " " + filme1.nome + " " + filme1.genero + " " + filme1.sinopse);// + " " + filme1.link);
						System.out.println("2" +  " " + filme2.nome + " " + filme2.genero + " " + filme2.sinopse);// + " " + filme2.link);
						System.out.println("3" +  " " + filme3.nome + " " + filme3.genero + " " + filme3.sinopse);// + " " + filme3.link);
						System.out.println("4" +  " " + filme4.nome + " " + filme4.genero + " " + filme4.sinopse);// + " " + filme4.link);
						System.out.println("5" +  " " + filme5.nome + " " + filme5.genero + " " + filme5.sinopse);// + " " + filme5.link);
						System.out.println("6" +  " " + filme6.nome + " " + filme6.genero + " " + filme6.sinopse);// + " " + filme6.link);
						System.out.println("Opção: ");
						
						//Seleciona Filme
						int id = scanner.nextInt(); //Scanner Seleciona Filme 		
						 if (id == 1)  // Caso verdadeiro 
							 System.out.println("Você curtiu " + filme1.nome);	 
						 		 //Filme 02
						 if (id == 2) // Caso verdadeiro 
						 System.out.println("Você curtiu " + filme2.nome);		 
						//Filme 03		  
						 if (id == 3) // Caso verdadeiro 
						 System.out.println("Você curtiu " + filme3.nome);	
						//Filme 04
						 if (id == 4)  // Caso verdadeiro 
							 System.out.println("Você curtiu " + filme4.nome);	 
						 		 //Filme 05
						 if (id == 5) // Caso verdadeiro 
						 System.out.println("Você curtiu " + filme5.nome);		 
						//Filme 06		  
						 if (id == 6) // Caso verdadeiro 
						 System.out.println("Você curtiu " + filme6.nome);
						 
						 
						 System.out.println("Digite nome do filme caso queira sugerir para novos filmes : ");
						 
					 
				 }
				 
				 if (menu == 3) {
					 System.out.println("Selecione seu filme para recomenda-lo: ");
						System.out.println("1" +  " " + filme1.nome + " " + filme1.genero + " " + filme1.sinopse);// + " " + filme1.link);
						System.out.println("2" +  " " + filme2.nome + " " + filme2.genero + " " + filme2.sinopse);// + " " + filme2.link);
						System.out.println("3" +  " " + filme3.nome + " " + filme3.genero + " " + filme3.sinopse);// + " " + filme3.link);
						System.out.println("4" +  " " + filme4.nome + " " + filme4.genero + " " + filme4.sinopse);// + " " + filme4.link);
						System.out.println("5" +  " " + filme5.nome + " " + filme5.genero + " " + filme5.sinopse);// + " " + filme5.link);
						System.out.println("6" +  " " + filme6.nome + " " + filme6.genero + " " + filme6.sinopse);// + " " + filme6.link);
						System.out.println("Opção: ");
						
						//Seleciona Filme
						int id = scanner.nextInt(); //Scanner Seleciona Filme 		
						 if (id == 1)  // Caso verdadeiro 
						System.out.println("recomendaou  " + filme1.nome);	 
						 		 //Filme 02
						 if (id == 2) // Caso verdadeiro 
						 System.out.println("recomendou " + filme2.nome);		 
						//Filme 03		  
						 if (id == 3) // Caso verdadeiro 
						 System.out.println("recomendou " + filme3.nome);	
						 //Filme 04
						 if (id == 4)  // Caso verdadeiro 
						System.out.println("recomendou  " + filme4.nome);	 
						 //Filme 05		  
						 if (id == 5) // Caso verdadeiro 
						 System.out.println("recomendou " + filme5.nome);	
						 //Filme 06		  
						 if (id == 6) // Caso verdadeiro 
						 System.out.println("recomendou " + filme6.nome);
						 
						 System.out.println("Digite o e-mail ou usuario para recomendar : ");
						 String user = scanner.next();
						 System.out.println("Você enviou sua recomendação para: " + user);
						 
					 System.out.println("Digite nome do filme caso queira sugerir para novos filmes : ");
				 
				 }
				 
				 
				 if (menu == 4) {
					 
					 System.out.println("Você poderá indicar 1 filme ao mês. \nDigite nome do filme para Indicar : "); {  
				 String recomenda = scanner.next();
				 System.out.println("Sua recomendação de filme foi: " + recomenda);
				 System.out.println("Selecione seu filme para assistir:");
				 System.out.println("Menu: \n1 - Para assistir filmes  \n2 - Curtit filmes \n3 - Recomendar filmes \n4 - Sujerir novos filmes \n5 - Você já recomendou? ");
					
					
					int menu1 = scanner.nextInt();				
				 
				 
				  recomed ++;
			//	 System.out.println(recomed);
				// System.out.println("Selecione seu filme para assistir:");
					 }
				 }
				 
				 if (menu == 5) {
					 System.out.println("Você selecionou " + recomed + " filmes");
					 				
					 System.out.println("Selecione seu filme para assistir:");
					 System.out.println("Menu: \n1 - Para assistir filmes  \n2 - Curtit filmes \n3 - Recomendar filmes \n4 - Sujerir novos filmes \n5 - Você já recomendou? ");
						
						
						int menu1 = scanner.nextInt();
					 
				 }
				 
				 
				 
		 //Lista flimes
		System.out.println("1" +  " " + filme1.nome + " " + filme1.genero + " " + filme1.sinopse);// + " " + filme1.link);
		System.out.println("2" +  " " + filme2.nome + " " + filme2.genero + " " + filme2.sinopse);// + " " + filme2.link);
		System.out.println("3" +  " " + filme3.nome + " " + filme3.genero + " " + filme3.sinopse);// + " " + filme3.link);
		System.out.println("4" +  " " + filme4.nome + " " + filme4.genero + " " + filme4.sinopse);// + " " + filme4.link);
		System.out.println("5" +  " " + filme5.nome + " " + filme5.genero + " " + filme5.sinopse);// + " " + filme5.link);
		System.out.println("6" +  " " + filme6.nome + " " + filme6.genero + " " + filme6.sinopse);// + " " + filme6.link);
		System.out.println("Opção: ");
	
		//Seleciona Filme
		
		int id = scanner.nextInt(); //Scanner Seleciona Filme 		
		 if (id == 1) // Caso verdadeiro 
		System.out.println("Você Selecionou " + filme1.nome);	 
		 		 //Filme 02
		 if (id == 2) // Caso verdadeiro 
		 System.out.println("Você Selecionou " + filme2.nome);		 
		//Filme 03		  
		 if (id == 3) // Caso verdadeiro 
		 System.out.println("Você Selecionou " + filme3.nome);	 
			//Filme 04
		 if (id == 4)  // Caso verdadeiro 
		System.out.println("Você Selecionou " + filme4.nome);	 
		 		 //Filme 05
		 if (id == 5) // Caso verdadeiro 
		 System.out.println("Você Selecionou "+ filme5.nome);		 
		//Filme 06		  
		 if (id == 6) // Caso verdadeiro 
		 System.out.println("Você Selecionou " + filme6.nome);
		 

		 //Recomanda filme selecionado 
		 System.out.println("Antes de assistir, você deseja ? \n1 - Curtir filme  \n2 - Recomenda filme \n3 - Assistir Filme \nOpção: ");
		  int recomendacoes = scanner.nextInt(); //Scanner Seleciona se deseja recomendar 
		
		  if (recomendacoes == 1) // Caso verdadeiro 
				System.out.println("Você curitu ");
			 
			 if (recomendacoes == 2) // Caso verdadeiro 
					System.out.println("Você Recomendou ");
			 if (recomendacoes == 3) // Caso verdadeiro 
					System.out.println("Play filme now ");
			 else {
				 System.out.println("Play filme");
		 }

	}	 
}		 
			 
			 
		
			 
			 
			 
			 
			 
			 
			 
			 
			
		  
		  
		  
		  
		  
		  
		  
//		 	int id = scanner.nextInt(); // Leitor da Opção "scanner"
//		 	 if (id == 1)   {  // Caso verdadeiro 
//				while(!satisfeitoFatias) {        // Repete até que seja falso
//					 
//					System.out.println("Você selecionou Brocolis, Deseja mais uma fatia?"
//						+ "\n1 - Sim"       //impressão caso selecione broclis 
//						+ "\n2 - Não");
//					sabor = scanner.nextInt(); // Leitor da Opção lida
//					 if (sabor == 1)  // Caso verdadeiro 
//						brocolis ++; // Soma brocolis
//				 else {
//						 System.out.println("Você comeu " + brocolis + " de fatias de Brocolis ");
//					satisfeitoFatias = true;
//				 }
		 	
		 	
		 	
		 	
		 	
		 	
		 	
//	    satisfeitoFatias = true;
//		
	
		
		
//		Recomendacoes = scanner.String();

// 	if (numeroSelecionado == 1)  {  // Caso verdadeiro 
//			//while(!satisfeitoFatias) {        // Repete até que seja falso
//				 
 		//		System.out.println("Você selecionou John Wick, Deseja curti esse filme?");
//					+ "\n1 - Sim"       //altera para true o curitiu filme **Acrecentar o User+curitu em Filmes* 
//					+ "\n2 - Não");
//				sabor = scanner.nextInt(); // Leitor da Opção lida
//				 if (sabor == 1)  // Caso verdadeiro 
//					 ; // Soma brocolis
	//		 else {
		 
			//	 System.out.println("Filme não recomendado");
		 
		 
//				satisfeitoFatias = true;
		 
//			 }
//			}
//			}
//			// *********************************** Calabresa
//			else if (numeroSelecionado == 2)  {  // Caso verdadeiro 
//				while(!satisfeitoFatias) {  // Repete até que seja falso
//					
//					System.out.println("Você selecionou Calabresa, Deseja mais uma fatia?"
//						+ "\n1 - Sim"       //impressão caso selecione Calabresa
//						+ "\n2 - Não");
//					
//					sabor = scanner.nextInt();
//					 if (sabor == 1) // Caso verdadeiro 
//						calabresa ++;
//					 else {
//						 	System.out.println("Você comeu " + calabresa + " de fatias de calabresa ");
//				    satisfeitoFatias = true;
//					 }
//				}
//				}
//					// *********************************** Frango 
//				    
//					else if (numeroSelecionado == 3)  { 
//						while(!satisfeitoFatias) {  
//							
//							System.out.println("Você selecionou Frango,Deseja mais uma fatia?"
//								+ "\n1 - Sim"      
//								+ "\n2 - Não");
//							
//							sabor = scanner.nextInt();
//							 if (sabor == 1)
//								frango ++;
//							 else {
//								 	System.out.println("Você comeu " + frango + " de fatias de frango ");
//						    satisfeitoFatias = true;
//			
	

//	private static void recomendacoes1(String next) {
		// TODO Auto-generated method stub
		
	


//Parte comentada 
//;	
	
	
//				 filme1.nome = "John Wick";
//				 filme1.sinopse = "Filme de ação com cachorro";
//				 filme1.genero = "ação";
//				 filme1.link = "www.teste.com.br";
			