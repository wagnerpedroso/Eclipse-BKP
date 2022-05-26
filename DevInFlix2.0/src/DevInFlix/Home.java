package DevInFlix;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit; // Perguntar refencia 

import java.util.Scanner;
import java.util.Set;

import filmes.Filme;

import java.io.ObjectInputStream.GetField;
import java.time.LocalDate;

import filmes.Conteudo;
//import filmes.Conteudo.curtirDescurtir;
import filmes.Serie;
import filmes.Genero;
import usuarios.Usuario;
import recomendacoes.recomenda;
import filmes.Recom;

//public class Home extends recomenda {
	
	
	public class Home {	
	
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	

	
	
	
	boolean menuCompleto = false;
	while(!menuCompleto) { 
		
		
		
		
		
	
		
	
	
	//System.out.println(filmes.cu);
	

	
	// criação de um novo usuario
	Usuario user1 = new Usuario("Wagner Predroso", "Rua Manaus", "24/10/1995");
	//System.out.println(user1.getNome() + user1.getEndereco() + user1.getDataNascimento());
	// criação do Segundo usuario. 
	Usuario user2 = new Usuario("Jessica Milwestet", "Rua Manus 615", "05/12/1993");
	//System.out.println(user2.getNome() + user2.getEndereco() + user2.getDataNascimento());
	// criação do Terceiro usuario. 
	Usuario user3 = new Usuario("Pedro 1", "Rua do pedro 1", "18/06/1976");
	//System.out.println(user3.getNome() + user3.getEndereco() + user3.getDataNascimento());
	// criação do Quarto usuario. 
	Usuario user4 = new Usuario("Pedro 2", "Rua do pedro 2", "13/02/2004");
	//System.out.println(user4.getNome() + user4.getEndereco() + user4.getDataNascimento());
	// criação do Quinto usuario. 
	Usuario user5 = new Usuario("Pedro 3", "Rua do pedro 3", "11/04/1990");
	//System.out.println(user5.getNome() + user5.getEndereco() + user5.getDataNascimento());
	
	//Criação do primeiro filme. 
	Filme filme1 = new Filme(01, "https://localhost.com.br/JohnWick", "John Wick",Genero.COMEDIA, LocalDate.of(2019, 5, 10), "Filme de ação com cachorro.", 0, 0);	
	//System.out.println(filme1.id + filme1.link + filme1.getGenero() +filme1.getAnoLancamento() + filme1.getSinopse() + filme1.getCurtidas() + filme1.getDescurtidas());
	//Criação do segundo filme. 
	Filme filme2 = new Filme(02, "https://localhost.com.br/JackRyan", "Jack Ryan",Genero.ACAO, LocalDate.of(2020, 5, 5), "Filme de ação da amazom.", 0, 0);	
	//System.out.println(filme2.id + filme2.link + filme2.getGenero() +filme2.getAnoLancamento() + filme2.getSinopse() + filme2.getCurtidas() + filme2.getDescurtidas());
	//Criação do Terceiro filme. 
	Filme filme3 = new Filme(03, "https://localhost.com.br/HomemAranha", "Homem Aranha",Genero.ACAO, LocalDate.of(1999, 5, 5), "Filme de ação e emoção.", 0, 0);	
	//System.out.println(filme3.id + filme3.link + filme3.getGenero() +filme3.getAnoLancamento() + filme3.getSinopse() + filme3.getCurtidas() + filme3.getDescurtidas());
	//Criação do Quarto filme
	Filme filme4 = new Filme(04, "https://localhost.com.br/Thechamado", "The chamado",Genero.TERROR, LocalDate.of(2014, 3, 5), "Filme de terror e suspense.", 0, 0);	
	//System.out.println(filme4.id + filme4.link + filme4.getGenero() +filme4.getAnoLancamento() + filme4.getSinopse() + filme4.getCurtidas() + filme4.getDescurtidas());
	//Criação do Quinto filme. 
	Filme filme5 = new Filme(05, "https://localhost.com.br/Deferiascomafamilia", "De ferias com a familia",Genero.COMEDIA, LocalDate.of(2006,9, 5), "Filme de comédia, familia.", 0, 0);	
	//System.out.println(filme5.id + filme5.link + filme5.getGenero() +filme5.getAnoLancamento() + filme5.getSinopse() + filme5.getCurtidas() + filme5.getDescurtidas());
	//Criação do Sexto filme. 
	Filme filme6 = new Filme(06, "https://localhost.com.br/HomemAranha2", "Homem Aranha 2",Genero.ACAO, LocalDate.of(2019, 7, 5), "Filme de ação e emoção2.", 0, 0);	
	//System.out.println(filme6.id + filme6.link + filme6.getGenero() +filme6.getAnoLancamento() + filme6.getSinopse() + filme6.getCurtidas() + filme6.getDescurtidas());
	
	
	
	
	System.out.println("Olá, Bem vindo ao DevInFlix de Wagner Pedroso.");
	
	System.out.println("Menu: \n1 - Para assistir filmes  \n2 - Curtit filmes \n3 - Recomendar filmes \n4 - Sujerir novos filmes \n5 - Você já recomendou? \n6 - Usuario \n7 - New Usuario ");
	System.out.println("Opção: ");
	
	
	
	int menu = scanner.nextInt(); //Scanner Seleciona Filme 	
	if (menu == 1) {
		
		System.out.println("Escolha seu Filme: ");
		
		 System.out.println("Selecione seu filme para Assistir:");
		 System.out.println(filme1.id+ " - " + "Nome do filme: " + filme1.nomeF + " Genero: " + filme1.getGenero() + " Sinopse: " + filme1.getSinopse() + " Numero de Curtidas filme: " + filme1.getCurtidas()); // + " Data Lançamento: " + filme1.getAnoLancamento() + " " + "Numero de Descurtidas filme: " + filme1.getDescurtidas());
		 System.out.println(filme2.id+ " - " + "Nome do filme: " + filme2.nomeF + " Genero: " + filme2.getGenero() + " Sinopse: " + filme2.getSinopse() + " Numero de Curtidas filme: " + filme2.getCurtidas()); // + " Data Lançamento: " + filme2.getAnoLancamento() + " " + "Numero de Descurtidas filme: " + filme2.getDescurtidas());
		 System.out.println(filme3.id+ " - " + "Nome do filme: " + filme3.nomeF + " Genero: " + filme3.getGenero() + " Sinopse: " + filme3.getSinopse() + " Numero de Curtidas filme: " + filme3.getCurtidas()); // + " Data Lançamento: " + filme3.getAnoLancamento() + " " + "Numero de Descurtidas filme: " + filme3.getDescurtidas());
		 System.out.println(filme4.id+ " - " + "Nome do filme: " + filme4.nomeF + " Genero: " + filme4.getGenero() + " Sinopse: " + filme4.getSinopse() + " Numero de Curtidas filme: " + filme4.getCurtidas()); // + " Data Lançamento: " + filme4.getAnoLancamento() + " " + "Numero de Descurtidas filme: " + filme4.getDescurtidas());
		 System.out.println(filme5.id+ " - " + "Nome do filme: " + filme5.nomeF + " Genero: " + filme5.getGenero() + " Sinopse: " + filme5.getSinopse() + " Numero de Curtidas filme: " + filme5.getCurtidas()); // + " Data Lançamento: " + filme5.getAnoLancamento() + " " + "Numero de Descurtidas filme: " + filme5.getDescurtidas());
		 System.out.println(filme6.id+ " - " + "Nome do filme: " + filme6.nomeF + " Genero: " + filme6.getGenero() + " Sinopse: " + filme6.getSinopse() + " Numero de Curtidas filme: " + filme6.getCurtidas()); // + " Data Lançamento: " + filme6.getAnoLancamento() + " " + "Numero de Descurtidas filme: " + filme6.getDescurtidas());
		
			System.out.println("Opção: ");
			
			int id = scanner.nextInt(); //Scanner Seleciona Filme 		
			 //Filme 01
			 if (id == 1)  // Caso verdadeiro 
			System.out.println("Play " + filme1.getNomeF() + " Link: " + filme1.link + "\nPlay Now...");
						 //Filme 02
			 if (id == 2) // Caso verdadeiro 
			System.out.println("Play " + filme2.getNomeF() + " Link: " + filme2.link + "\nPlay Now...");	 		 	 			 
			 //Filme 03
			 if (id == 3) // Caso verdadeiro 
			System.out.println("Play " + filme3.getNomeF() + " Link: " + filme3.link + "\nPlay Now...");	
			 //Filme 04
			 if (id == 4) // Caso verdadeiro 
			System.out.println("Play " + filme4.getNomeF() + " Link: " + filme4.link + "\nPlay Now...");	
			 //Filme 05
			 if (id == 5) // Caso verdadeiro 
			System.out.println("Play " + filme5.getNomeF() + " Link: " + filme5.link + "\nPlay Now...");	
			 //Filme 06
			 if (id == 6) // Caso verdadeiro 
			System.out.println("Play " + filme6.getNomeF() + " Link: " + filme6.link + "\nPlay Now...");	
//	}
//	
//	else { System.out.println("Filme invalido!");
		
	break;
  }	

if (menu == 2)  {
	
	System.out.println("Selecione seu filme para Curti :");
	
	 System.out.println(filme1.id+ " - " + "Nome do filme: " + filme1.nomeF + " Genero: " + filme1.getGenero() + " Sinopse: " + filme1.getSinopse() + " Numero de Curtidas filme: " + filme1.getCurtidas()); // + " Data Lançamento: " + filme1.getAnoLancamento() + " " + "Numero de Descurtidas filme: " + filme1.getDescurtidas());
	 System.out.println(filme2.id+ " - " + "Nome do filme: " + filme2.nomeF + " Genero: " + filme2.getGenero() + " Sinopse: " + filme2.getSinopse() + " Numero de Curtidas filme: " + filme2.getCurtidas()); // + " Data Lançamento: " + filme2.getAnoLancamento() + " " + "Numero de Descurtidas filme: " + filme2.getDescurtidas());
	 System.out.println(filme3.id+ " - " + "Nome do filme: " + filme3.nomeF + " Genero: " + filme3.getGenero() + " Sinopse: " + filme3.getSinopse() + " Numero de Curtidas filme: " + filme3.getCurtidas()); // + " Data Lançamento: " + filme3.getAnoLancamento() + " " + "Numero de Descurtidas filme: " + filme3.getDescurtidas());
	 System.out.println(filme4.id+ " - " + "Nome do filme: " + filme4.nomeF + " Genero: " + filme4.getGenero() + " Sinopse: " + filme4.getSinopse() + " Numero de Curtidas filme: " + filme4.getCurtidas()); // + " Data Lançamento: " + filme4.getAnoLancamento() + " " + "Numero de Descurtidas filme: " + filme4.getDescurtidas());
	 System.out.println(filme5.id+ " - " + "Nome do filme: " + filme5.nomeF + " Genero: " + filme5.getGenero() + " Sinopse: " + filme5.getSinopse() + " Numero de Curtidas filme: " + filme5.getCurtidas()); // + " Data Lançamento: " + filme5.getAnoLancamento() + " " + "Numero de Descurtidas filme: " + filme5.getDescurtidas());
	 System.out.println(filme6.id+ " - " + "Nome do filme: " + filme6.nomeF + " Genero: " + filme6.getGenero() + " Sinopse: " + filme6.getSinopse() + " Numero de Curtidas filme: " + filme6.getCurtidas()); // + " Data Lançamento: " + filme6.getAnoLancamento() + " " + "Numero de Descurtidas filme: " + filme6.getDescurtidas());
	
		System.out.println("0 - Menu Inical \nOpção: ");
		
		int id = scanner.nextInt(); //Scanner Seleciona Filme 		
		 //Filme 01
		 if (id == 1) {     // Caso verdadeiro  				
	   	filme1.setCurtidas(filme1.getCurtidas() + 1);
		 System.out.println("Você curitu o filme: " + filme1.nomeF + " Numero de curtidas do filmes: " + filme1.getCurtidas());
		 System.out.println("Aperte 0 para voltar");
			int id1 = scanner.nextInt();
			if (id1 == 0);
		 }		 
		 //Filme 02		
		 if (id == 2) {       // Caso verdadeiro  		 	 			 
		filme2.setCurtidas(filme2.getCurtidas() + 1);
		System.out.println("Você curitu o filme: " + filme2.nomeF + " Numero de curtidas do filmes: " + filme2.getCurtidas());
		System.out.println("Aperte 0 para voltar");
		int id2 = scanner.nextInt();
		if (id2 == 0);		
		 }	 
		 //Filme 03		
		 if (id == 3) {       // Caso verdadeiro  		 	 			 
		filme3.setCurtidas(filme3.getCurtidas() + 1);
		System.out.println("Você curitu o filme: " + filme3.nomeF + " Numero de curtidas do filmes: " + filme3.getCurtidas());
		System.out.println("Aperte 0 para voltar");
		int id3 = scanner.nextInt();
		if (id3 == 0);		
		 }		 
		 //Filme 04		
		 if (id == 4) {       // Caso verdadeiro  		 	 			 
		filme4.setCurtidas(filme4.getCurtidas() + 1);
		System.out.println("Você curitu o filme: " + filme4.nomeF + " Numero de curtidas do filmes: " + filme4.getCurtidas());
		System.out.println("Aperte 0 para voltar");
		int id4 = scanner.nextInt();
		if (id4 == 0);		
		 }		 
		 //Filme 05		
		 if (id == 5) {       // Caso verdadeiro  		 	 			 
		filme5.setCurtidas(filme5.getCurtidas() + 1);
		System.out.println("Você curitu o filme: " + filme5.nomeF + " Numero de curtidas do filmes: " + filme5.getCurtidas());
		System.out.println("Aperte 0 para voltar");
		int id5 = scanner.nextInt();
		if (id5 == 0);		
		 }		 
		 //Filme 06		
		 if (id == 6) {       // Caso verdadeiro  		 	 			 
		filme6.setCurtidas(filme6.getCurtidas() + 1);
		System.out.println("Você curitu o filme: " + filme6.nomeF + " Numero de curtidas do filmes: " + filme6.getCurtidas());
		System.out.println("Aperte 0 para voltar");
		int id6 = scanner.nextInt();
		if (id6 == 0);		
		 }	
		 
}
		  	 if (menu == 3)  {
			  System.out.println("Selecione seu filme para recomenda-lo: ");
			  	System.out.println(filme1.id+ " - " + "Nome do filme: " + filme1.nomeF + " Genero: " + filme1.getGenero() + " Sinopse: " + filme1.getSinopse() + " Numero de Curtidas filme: " + filme1.getCurtidas()); // + " Data Lançamento: " + filme1.getAnoLancamento() + " " + "Numero de Descurtidas filme: " + filme1.getDescurtidas());
			 	System.out.println(filme2.id+ " - " + "Nome do filme: " + filme2.nomeF + " Genero: " + filme2.getGenero() + " Sinopse: " + filme2.getSinopse() + " Numero de Curtidas filme: " + filme2.getCurtidas()); // + " Data Lançamento: " + filme2.getAnoLancamento() + " " + "Numero de Descurtidas filme: " + filme2.getDescurtidas());
			 	System.out.println(filme3.id+ " - " + "Nome do filme: " + filme3.nomeF + " Genero: " + filme3.getGenero() + " Sinopse: " + filme3.getSinopse() + " Numero de Curtidas filme: " + filme3.getCurtidas()); // + " Data Lançamento: " + filme3.getAnoLancamento() + " " + "Numero de Descurtidas filme: " + filme3.getDescurtidas());
			 	System.out.println(filme4.id+ " - " + "Nome do filme: " + filme4.nomeF + " Genero: " + filme4.getGenero() + " Sinopse: " + filme4.getSinopse() + " Numero de Curtidas filme: " + filme4.getCurtidas()); // + " Data Lançamento: " + filme4.getAnoLancamento() + " " + "Numero de Descurtidas filme: " + filme4.getDescurtidas());
			 	System.out.println(filme5.id+ " - " + "Nome do filme: " + filme5.nomeF + " Genero: " + filme5.getGenero() + " Sinopse: " + filme5.getSinopse() + " Numero de Curtidas filme: " + filme5.getCurtidas()); // + " Data Lançamento: " + filme5.getAnoLancamento() + " " + "Numero de Descurtidas filme: " + filme5.getDescurtidas());
			 	System.out.println(filme6.id+ " - " + "Nome do filme: " + filme6.nomeF + " Genero: " + filme6.getGenero() + " Sinopse: " + filme6.getSinopse() + " Numero de Curtidas filme: " + filme6.getCurtidas()); // + " Data Lançamento: " + filme6.getAnoLancamento() + " " + "Numero de Descurtidas filme: " + filme6.getDescurtidas());
			 	System.out.println("Opção: ");		  	 
			 	//Seleciona Filme
			 	int menu3 = scanner.nextInt(); //Scanner Seleciona Filme 	
		 		//Filme 1
			 	
			 	
			 	if (menu3 == 1) { // Caso verdadeiro 
				System.out.println("recomendaou  " + filme1.nomeF);	 			 
			 	 System.out.println("Digite o e-mail ou usuario para recomendar : ");
				 String recomendacao1 = scanner.next();
				 filme1.setCurtidas(filme1.getCurtidas() + 1);			
				 System.out.println("Você recomendou: " + filme1.nomeF +" e enviou sua recomendação para: " + recomendacao1);
				 //Criar contrutores de envio
			 	}
			 	//Filme 02		
				 if (menu3 == 2) { // Caso verdadeiro 
						System.out.println("recomendaou  " + filme2.nomeF);	 					 	
					 	 System.out.println("Digite o e-mail ou usuario para recomendar : ");
						 String recomendacao2 = scanner.next();
						 System.out.println("Você recomendou: " + filme2.nomeF +" e enviou sua recomendação para: " + recomendacao2);}
				 //Filme 03		
				 if (menu3 == 3) { // Caso verdadeiro 
						System.out.println("recomendaou  " + filme3.nomeF);	 					 	
					 	 System.out.println("Digite o e-mail ou usuario para recomendar : ");
						 String recomendacao3 = scanner.next();
						 System.out.println("Você recomendou: " + filme3.nomeF +" e enviou sua recomendação para: " + recomendacao3);}
				 //Filme 04		
				 if (menu3 == 4) { // Caso verdadeiro 
						System.out.println("recomendaou  " + filme4.nomeF);	 					 	
					 	 System.out.println("Digite o e-mail ou usuario para recomendar : ");
						 String recomendacao4 = scanner.next();
						 System.out.println("Você recomendou: " + filme4.nomeF +" e enviou sua recomendação para: " + recomendacao4);}
				 //Filme 05	
				 if (menu3 == 5) { // Caso verdadeiro 
						System.out.println("recomendaou  " + filme5.nomeF);	 					 	
					 	 System.out.println("Digite o e-mail ou usuario para recomendar : ");
						 String recomendacao5 = scanner.next();
						 System.out.println("Você recomendou: " + filme5.nomeF +" e enviou sua recomendação para: " + recomendacao5);}
				 //Filme 06		
				 if (menu3 == 6) { // Caso verdadeiro 
						System.out.println("recomendaou  " + filme6.nomeF);	 					 	
					 	 System.out.println("Digite o e-mail ou usuario para recomendar : ");
						 String recomendacao6 = scanner.next();
						 System.out.println("Você recomendou: " + filme6.nomeF +" e enviou sua recomendação para: " + recomendacao6);
				 }	
				 System.out.println("Deseja voltar para o menu? \n1 - sim \n0 - não");
				 int scrmenu = scanner.nextInt();
					if (scrmenu == 0);				 
		  	 }
		  	 
		  	 
		  	 
		  	 
		  	 
		  	 
		  	 
	
		  	 
		  	 if (menu == 4)  {	 	
		  		 
				 long dias = ChronoUnit.MONTHS.between(user1.getIndicacaoData(), LocalDate.now());
		  		
				 if (dias > 1) {
		  			 user1.setIndicacaoData(LocalDate.now());
		  			 user1.setProxIndicacao(LocalDate.now().plusMonths(1));
		  			 System.out.println("tests");  
		  			
		  		}	else {
		  			System.out.println("Você já recomendou filme esse mês");
		  		}
		  		 
		  		 
		  		 
		  		 System.out.println("Você poderá Sujerir 1 filme ao mês. \nDigite nome do filme para Sujerir: "); 		  		  	  			  	 		 		 	  	 		  		 
		  		 String recomenda = scanner.next();
		  		 
		  		 
		  		 
		  		 System.out.println("Sua recomendação de filme foi: " + recomenda);
		  		 Recom recom1 = new Recom(recomenda, "Wagner");
		  		 
		  		 System.out.println("O filme: " + recom1.filmeRecomendado + " Foi recomendado pelo usuario: "+ recom1.usuarioRecomendado);
		  		 //Mudar o nome do usuario para o que ele está logado 
		  		 System.out.println("Deseja voltar para o menu? \n1 - sim \n0 - não");
		  		 int scrmenu = scanner.nextInt();
		  		 if (scrmenu == 0);
		 	 		  		 
		  	 }

		  	 
		  	 
		  	 
		  	 
		  	 
		  	 
		  	 
		  	 
		  	 
		  	 
		  	 
		  	 
		  	 
		  	 
		  	 
		  	 
		  	 if (menu == 5)  {		
		  		 
		  	System.out.println("reco");
		  	 }

}
}
}



//				 
//				
//				 if (menu == 6)  {		 }
//				 if (menu == 7)  {		 }



		

		

	
 

	
	


