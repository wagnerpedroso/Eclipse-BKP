package devinmoney;

import static devinmoney.Agencias.FLORIANOPOLIS;

import java.io.ObjectInputStream.GetField;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.Set;



//import java.time.LocalDate
//import java.time.format.DateTimeFormatter
import java.time.format.TextStyle;
import java.util.Locale;
import java.time.DayOfWeek;


import devinmoney.Conta;
import devinmoney.ContasCorrente;
import devinmoney.ContasPoupanca;
import devinmoney.ContasInsvestimento;
import devinmoney.HistoricoDeTransacoes;
import devinmoney.*;
public class Menu {
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);		
	
		boolean menuCompleto = false;
		
		//Contas Correntes
		ContasCorrente conta01 = new ContasCorrente("Wagner Pedroso", "10005399999", Agencias.FLORIANOPOLIS, 1, 300.5, 1800);
		ContasCorrente conta02 = new ContasCorrente("Jessica Milwerstet", "10005388888", Agencias.FLORIANOPOLIS, 2, 300.5, 2400);
		ContasCorrente conta03 = new ContasCorrente("teste conta03", "10005333333", Agencias.FLORIANOPOLIS, 3, 100.5, 4000);
		ContasCorrente conta04 = new ContasCorrente("Teste conta04", "100053444444", Agencias.FLORIANOPOLIS, 4, 800.5, 3800);
		ContasCorrente conta05 = new ContasCorrente("Teste conta05", "100053555555", Agencias.FLORIANOPOLIS, 5, -500, 2800);
		ContasCorrente conta06 = new ContasCorrente("Teste conta06", "100053666666", Agencias.FLORIANOPOLIS, 6, -500, 5500);
		ContasCorrente conta07 = new ContasCorrente("Teste conta07", "100053777777", Agencias.SAOJOSE, 7, -500, 4900);
		ContasCorrente conta08 = new ContasCorrente("Teste conta08", "100053888888", Agencias.SAOJOSE, 8, 100.5,5098);
		ContasCorrente conta09 = new ContasCorrente("Teste conta09", "100053999999", Agencias.SAOJOSE, 9, -500, 532);
		ContasCorrente conta010 = new ContasCorrente("Teste coonta010", "100053101010", Agencias.SAOJOSE, 10, 800.5, 780);
	
		//Contas Poupanças
		ContasPoupanca conta100 = new ContasPoupanca("Wagner Pedroso Poup", "10005355999", Agencias.FLORIANOPOLIS, 100, 500);
		ContasPoupanca conta101 = new ContasPoupanca("Jessica Milwerstet", "10005388888", Agencias.FLORIANOPOLIS, 100, 500);
		ContasPoupanca conta102 = new ContasPoupanca("teste poup conta02", "10005222222", Agencias.FLORIANOPOLIS, 3100, 3000);
		ContasPoupanca conta103 = new ContasPoupanca("teste poup conta03", "10005333333", Agencias.FLORIANOPOLIS, 5100, 500);
		ContasPoupanca conta104 = new ContasPoupanca("Teste poup conta04", "100053444444", Agencias.FLORIANOPOLIS, 100, 1000);
		ContasPoupanca conta105 = new ContasPoupanca("Teste poup conta05", "100053555555", Agencias.SAOJOSE, 100, 500);
		ContasPoupanca conta106 = new ContasPoupanca("Teste poup conta06", "100053666666", Agencias.SAOJOSE, 400, 10000);
		ContasPoupanca conta107 = new ContasPoupanca("Teste poup conta07", "100053777777",Agencias.FLORIANOPOLIS, 100, 500);
		ContasPoupanca conta108 = new ContasPoupanca("Teste poup conta08", "100053888888", Agencias.SAOJOSE, 300, 1000);
		ContasPoupanca conta109 = new ContasPoupanca("Teste poup conta09", "100053999999", Agencias.SAOJOSE, 100, 500);
		
		//Contas Investimentos
		
		ContasInsvestimento contai01 = new ContasInsvestimento("Wagner Pedroso Ivest", "10005355999", FLORIANOPOLIS, 100, 500);
		ContasInsvestimento contai02 = new ContasInsvestimento("Jessica Milwerstet", "10005388888", FLORIANOPOLIS, 100, 500);
		ContasInsvestimento contai03 = new ContasInsvestimento("teste Ivest conta03", "10005333333", Agencias.FLORIANOPOLIS, 3, 100.5);
		ContasInsvestimento contai04 = new ContasInsvestimento("Teste Ivest conta04", "100053444444", Agencias.FLORIANOPOLIS, 4, 800.5);
		ContasInsvestimento contai05 = new ContasInsvestimento("Teste Ivest conta05", "100053555555", Agencias.FLORIANOPOLIS, 5, 900.5);
		ContasInsvestimento contai06 = new ContasInsvestimento("Teste Ivest conta06", "100053666666", Agencias.FLORIANOPOLIS, 6, 100.5);
		ContasInsvestimento contai07 = new ContasInsvestimento("Teste Ivest conta07", "100053777777", Agencias.SAOJOSE, 7, 400.5);
		ContasInsvestimento contai08 = new ContasInsvestimento("Teste Ivest conta08", "100053888888", Agencias.SAOJOSE, 8, 100.5);
		ContasInsvestimento contai09 = new ContasInsvestimento("Teste Ivest conta09", "100053999999", Agencias.SAOJOSE, 9, 600.5);
		ContasInsvestimento contai010 = new ContasInsvestimento("Teste Ivest coonta010", "100053101010", Agencias.SAOJOSE, 10, 800.5);
		
		while(!menuCompleto) { 
		
		System.out.println("Banco DevInMoney  ¯\\(°_o)/¯ ");
		
		System.out.println("Menu: \n1 - Verifique seu Saldo  \n2 - Verifique seu Extrato \n3 - Saque \n4 - Depósito \n5 - Transferência entre contas DevInMoney \n6 - Dados cadastrais \n7 - Relatórios Sistema \n8 - Simulações ");
		
		int menu = scanner.nextInt();
		if (menu == 1) {		
			System.out.println("\nConta verificada: " + conta01.nome + " \nNº da Conta: " + conta01.conta);
			System.out.println("Saldo disponível: R$ " + conta01.saldoContaCorrente);			
			double somaValoDisponivel = (conta01.saldoChequeEspecial + conta01.saldoContaCorrente);		
			System.out.println("Saldo Total disponível: R$ " + somaValoDisponivel);	
			System.out.println("\n \n");		
		}
		
		
		if (menu == 2) {
			System.out.println("\nExtrato"); 			
			System.out.println("Lista de todas suas movimentações: ");			
			System.out.println(conta01.historicoContaCorrente);
			System.out.println("Você deseja imprimir seu Extrato? \n1 - Sim \n2 - Não");
			int impRel = scanner.nextInt();
			
			if (impRel == 1)	{
				System.out.println("Retire seu comprovante!");
			}						
			System.out.println("\n \n");	
		}
		
		if (menu == 3) {
			double somaValoDisponivel = (conta01.saldoChequeEspecial + conta01.saldoContaCorrente);			
			System.out.println("Saldo Conta Corrente: R$" + conta01.saldoContaCorrente);			
			System.out.println("Limete Cheque Especial: R$" + conta01.saldoChequeEspecial);			
			System.out.println("Valor TOTAL disponível para saque: R$" + somaValoDisponivel);			
			System.out.println("Valor deseja ser sacado: R$");				
			double valorSaque = scanner.nextDouble();						
			double confereSaldo = (somaValoDisponivel - valorSaque);							
			
			if (confereSaldo  >= 1 )	{						
			System.out.println("\nSaque solicitado Realizado! \nValor: R$" + valorSaque);			
			conta01.setSaldoContaCorrente(conta01.getSaldoContaCorrente() - valorSaque);				
			System.out.println("Valor que ficou disponível na conta: R$" + conta01.saldoContaCorrente);					
			double somaValoDisponivelPO = (conta01.saldoChequeEspecial + conta01.saldoContaCorrente);
			System.out.println("Valor TOTAL disponível: R$" + somaValoDisponivelPO);
			LocalDateTime myDateSystem = LocalDateTime.now();
		    DateTimeFormatter formaData = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		    String localDate = myDateSystem.format(formaData);
		    System.out.println("Data e Hora: " + localDate + "\n");
		    HistoricoDeTransacoes historicoSaque = new HistoricoDeTransacoes(conta01.nome, conta01.conta, valorSaque, conta01.conta, localDate); 			
		    conta01.setHistoricoContaCorrente(conta01.getHistoricoContaCorrente() + " <Historico*Saque*>Nome.Cliente: " + conta01.nome + " Conta: " + conta01.conta + " OperaçãoSaqueContaCorrente: R$" + valorSaque + "Data e hora: " + localDate + "<Fim>\n");
	//		System.out.println("\n\n" + conta01.historicoContaCorrente + "\n \n");								
			}
			else if (confereSaldo <= -1) {
		
			System.out.println("Saldo insuficiente\n *Transação Cancelada!*");
			
			System.out.println("\n \n");
		}
		}		
		
		if (menu == 4) {			 						
			System.out.println("Saldo da Conta Corrente: R$" + conta01.saldoContaCorrente);
			System.out.println("Valor disponível Cheque Especial: R$" + conta01.saldoChequeEspecial);
			double somaValoDisponivelContaCorrente = (conta01.saldoChequeEspecial + conta01.saldoContaCorrente);	
			System.out.println("Valor TOTAL disponível na Conta: R$" + somaValoDisponivelContaCorrente);				
			System.out.println("Informe o valor do envelope para depositar: R$ ");			
			double valorDeposito = scanner.nextDouble();							
			conta01.setSaldoContaCorrente(conta01.getSaldoContaCorrente() + valorDeposito);								
			System.out.println("Informe o Numero do envelope: R$");
			int NumeroEnvelope = scanner.nextInt();		//Para conferencia das cedulas 				
			System.out.println("Você depositou o valor de R$: " + valorDeposito);
		    System.out.println("Saldo da conta atualizado: R$" + conta01.saldoContaCorrente);
			double somaValoDisponivelPO = (conta01.saldoChequeEspecial + conta01.saldoContaCorrente);
			System.out.println("Valor TOTAL disponível: R$" + somaValoDisponivelPO);			
			LocalDateTime myDateSystem = LocalDateTime.now();
		    DateTimeFormatter formaData = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		    String localDate = myDateSystem.format(formaData);
		    System.out.println("Data e Hora: " + localDate);			
			HistoricoDeTransacoes historicoDeposito = new HistoricoDeTransacoes(conta01.nome, conta01.conta, valorDeposito, NumeroEnvelope, localDate);
			System.out.println("<Historico>Nome.Cliente: R$" + historicoDeposito.nome + " Conta: " + historicoDeposito.conta + " OperaçãoDepositoContaCorrente: R$" + historicoDeposito.historico + "Numero envelope: " +historicoDeposito.identificacao + "<Historico>\n");
			conta01.setHistoricoContaCorrente(conta01.getHistoricoContaCorrente() + " <Historico*Deposito*>Nome.Cliente: " + conta01.nome + " Conta Depositada: " + conta01.conta + " OperaçãoDepositoContaCorrente: R$" + valorDeposito + " Numero de Envelope: " + NumeroEnvelope + "Data e hora: " + localDate + "<Fim>\n");
		//	System.out.println(conta01.historicoContaCorrente + "\n \n");
			}
		if (menu == 5) {			
			double somaValoDisponivel = (conta01.saldoChequeEspecial + conta01.saldoContaCorrente);			
			System.out.println("Valor disponível na Conta Corrente: R$ " + conta01.saldoContaCorrente);
			System.out.println("Valor disponível Cheque Especial: R$ " + conta01.saldoChequeEspecial);
			System.out.println("Valor TOTAL disponível para Deposito: R$ " + somaValoDisponivel);	
			System.out.println("Informe o valor que deseja tranferir: ");
			double valorTransferencia = scanner.nextDouble();			
			double confereSaldoTrans = (somaValoDisponivel - valorTransferencia);					
			if (confereSaldoTrans >= 1 ) {										
			System.out.println("Transferir o valor: R$ " + valorTransferencia);
			System.out.println("Informe Nº da conta DevInBank: ");
			int contaTransferencia = scanner.nextInt();			
			if (contaTransferencia == 1) {System.out.println("Você não pode transferir para você mesmo!");}
			if (contaTransferencia == 2) {
				   System.out.println("Nome da Conta que você está depositando: " + conta02.nome);	
				   System.out.println("Informações da conta: " + conta02.nome + " Cpf: " +conta02.cpf + " Conta: " + conta02.conta);
				   System.out.println("Você tem Certeza que deseja depositar na conta de " + conta02.nome + "?\n1 - Sim  0 - Não" );
				   int confirmaTransação = scanner.nextInt();					
				if 	 (confirmaTransação == 1) {
					 conta02.setSaldoContaCorrente(conta02.getSaldoContaCorrente()+(valorTransferencia));
					   System.out.println("Transferencia confirmada para conta: " + contaTransferencia);
					   System.out.println("Novo saldo da conta Depositada:R$  " + conta02.saldoContaCorrente + " *Obs:Não estárá disponível pro usuario*");
					   conta01.setSaldoContaCorrente(conta01.getSaldoContaCorrente() - valorTransferencia);
					   double somaValoDisponivelPO = (conta01.saldoChequeEspecial + conta01.saldoContaCorrente);
					   System.out.println("Saldo da sua conta atualizado: R$ " + conta01.saldoContaCorrente);
					   System.out.println("Valor TOTAL disponível: R$ " + somaValoDisponivelPO);					   
					   LocalDateTime myDateSystem = LocalDateTime.now();					   					   
					    DateTimeFormatter formaData = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
					    String localDate = myDateSystem.format(formaData);
					    System.out.println("Data e Hora: " + localDate);
					    HistoricoDeTransacoes historicoTransferencia = new HistoricoDeTransacoes(conta02.nome, conta02.conta, valorTransferencia, contaTransferencia, localDate);				
					   System.out.println("<Historico>Nome.Cliente: R$" + historicoTransferencia.nome + " Conta: " + historicoTransferencia.conta + " OperaçãoTransferenciaContaCorrente: R$" + historicoTransferencia.historico + "Conta que Recebe Valor: " + contaTransferencia + "<Historico>\n");
					
					   conta01.setHistoricoContaCorrente(conta01.getHistoricoContaCorrente() + " <Historico*Transferencia*>Nome.Cliente: " + conta01.nome + " Conta: " + conta01.conta + " OperaçãoTransferenciaContaCorrente: R$" + valorTransferencia + " Conta Destino: "+ contaTransferencia + "Data e hora: " + localDate + "<Fim>\n");
					//	System.out.println(conta01.historicoContaCorrente + "\n \n");					
				} 
					}
				if (contaTransferencia == 3) {
					System.out.println("Nome da Conta que você está depositando: " + conta03.nome);	
					System.out.println("Informações da conta: " + conta03.nome + " Cpf: " +conta03.cpf + " Conta: " + conta03.conta);
					System.out.println("Você tem Certeza que deseja depositar na conta de " + conta03.nome + "?\n1 - Sim  2 - Não" );
					int confirmaTransação3 = scanner.nextInt();
						
					if (confirmaTransação3 == 1) {
						conta03.setSaldoContaCorrente(conta03.getSaldoContaCorrente()+(valorTransferencia));
						System.out.println("Transferencia confirmada para conta: " + contaTransferencia);
						System.out.println("Novo saldo da conta Depositada: R$ " + conta03.saldoContaCorrente + " *Obs:Não estárá disponível pro usuario*");
						conta01.setSaldoContaCorrente(conta01.getSaldoContaCorrente() - valorTransferencia);
						double somaValoDisponivelPO = (conta01.saldoChequeEspecial + conta01.saldoContaCorrente);
						System.out.println("Saldo da sua conta atualizado: R$ " + conta01.saldoContaCorrente);
						System.out.println("Valor TOTAL disponível: R$ " + somaValoDisponivelPO);										   
						   LocalDateTime myDateSystem = LocalDateTime.now();
						    DateTimeFormatter formaData = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
						    String localDate = myDateSystem.format(formaData);
						    System.out.println("Data e Hora: " + localDate);						   
						   HistoricoDeTransacoes historicoTransferencia = new HistoricoDeTransacoes(conta02.nome, conta02.conta, valorTransferencia, contaTransferencia, localDate);				
					//	System.out.println("<Historico>Nome.Cliente: R$" + historicoTransferencia.nome + " Conta: " + historicoTransferencia.conta + " OperaçãoTransferenciaContaCorrente: R$" + historicoTransferencia.historico + "Conta que Recebe Valor: " + contaTransferencia + "Data e hora: " + localDate + "<Fim>\n");
						}
						}
				if (contaTransferencia == 4) {
					System.out.println("Nome da Conta que você está depositando: " + conta04.nome);	
					System.out.println("Informações da conta: " + conta04.nome + " Cpf: " +conta04.cpf + " Conta: " + conta04.conta);
					System.out.println("Você tem Certeza que deseja depositar na conta de " + conta04.nome + "?\n1 - Sim  2 - Não" );
					int confirmaTransação3 = scanner.nextInt();
						
					if (confirmaTransação3 == 1) {
						conta04.setSaldoContaCorrente(conta04.getSaldoContaCorrente()+(valorTransferencia));
						System.out.println("Transferencia confirmada para conta: " + contaTransferencia);
						System.out.println("Novo saldo da conta Depositada: R$ " + conta01.saldoContaCorrente + " *Obs:Não estárá disponível pro usuario*");
						conta01.setSaldoContaCorrente(conta04.getSaldoContaCorrente() - valorTransferencia);
						double somaValoDisponivelPO = (conta04.saldoChequeEspecial + conta04.saldoContaCorrente);
						System.out.println("Saldo da sua conta atualizado: R$ " + conta01.saldoContaCorrente);
						System.out.println("Valor TOTAL disponível: R$ " + somaValoDisponivelPO);										   
						   LocalDateTime myDateSystem = LocalDateTime.now();
						    DateTimeFormatter formaData = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
						    String localDate = myDateSystem.format(formaData);
						    System.out.println("Data e Hora: " + localDate);						   
						   HistoricoDeTransacoes historicoTransferencia = new HistoricoDeTransacoes(conta02.nome, conta02.conta, valorTransferencia, contaTransferencia, localDate);	
						//   System.out.println("<Historico>Nome.Cliente: R$" + historicoTransferencia.nome + " Conta: " + historicoTransferencia.conta + " OperaçãoTransferenciaContaCorrente: R$" + historicoTransferencia.historico + "Conta que Recebe Valor: " + contaTransferencia + "Data e hora: " + localDate + "<Fim>\n");
						}
						}
				if (contaTransferencia == 5) {
					System.out.println("Nome da Conta que você está depositando: " + conta05.nome);	
					System.out.println("Informações da conta: " + conta05.nome + " Cpf: " +conta05.cpf + " Conta: " + conta05.conta);
					System.out.println("Você tem Certeza que deseja depositar na conta de " + conta05.nome + "?\n1 - Sim  2 - Não" );
					int confirmaTransação3 = scanner.nextInt();
					
					if (confirmaTransação3 == 1) {
						conta05.setSaldoContaCorrente(conta03.getSaldoContaCorrente()+(valorTransferencia));
						System.out.println("Transferência confirmada para conta: " + contaTransferencia);
						System.out.println("Novo saldo da conta Depositada: R$ " + conta05.saldoContaCorrente + " *Obs:Não estárá disponível pro usuario*");
						conta01.setSaldoContaCorrente(conta01.getSaldoContaCorrente() - valorTransferencia);
						double somaValoDisponivelPO = (conta05.saldoChequeEspecial + conta05.saldoContaCorrente);
						System.out.println("Saldo da sua conta atualizado: R$ " + conta01.saldoContaCorrente);
						System.out.println("Valor TOTAL disponível: R$ " + somaValoDisponivelPO);
						   
						   LocalDateTime myDateSystem = LocalDateTime.now();
						    DateTimeFormatter formaData = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
						    String localDate = myDateSystem.format(formaData);
						    System.out.println("Data e Hora: " + localDate);
						   
						   HistoricoDeTransacoes historicoTransferencia = new HistoricoDeTransacoes(conta02.nome, conta02.conta, valorTransferencia, contaTransferencia, localDate);				
						//System.out.println("<Historico>Nome.Cliente: R$" + historicoTransferencia.nome + " Conta: " + historicoTransferencia.conta + " OperaçãoTransferenciaContaCorrente: R$" + historicoTransferencia.historico + "Conta que Recebe Valor: " + contaTransferencia + "Data e hora: " + localDate + "<Fim>\n");
						}
						}
				if (contaTransferencia == 6) {
					System.out.println("Nome da Conta que você está depositando: " + conta06.nome);	
					System.out.println("Informações da conta: " + conta06.nome + " Cpf: " + conta06.cpf + " Conta: " + conta06.conta);
					System.out.println("Você tem Certeza que deseja depositar na conta de " + conta06.nome + "?\n1 - Sim  2 - Não" );
					int confirmaTransação3 = scanner.nextInt();
						
					if (confirmaTransação3 == 1) {
						conta06.setSaldoContaCorrente(conta06.getSaldoContaCorrente()+(valorTransferencia));
						System.out.println("Transferência confirmada para conta: " + contaTransferencia);
						System.out.println("Novo saldo da conta Depositada: R$ " + conta01.saldoContaCorrente + " *Obs:Não estárá disponível pro usuario*");
						conta01.setSaldoContaCorrente(conta01.getSaldoContaCorrente() - valorTransferencia);
						double somaValoDisponivelPO = (conta01.saldoChequeEspecial + conta01.saldoContaCorrente);
						System.out.println("Saldo da sua conta atualizado: R$ " + conta01.saldoContaCorrente);
						System.out.println("Valor TOTAL disponível: R$ " + somaValoDisponivelPO);
						   
						   LocalDateTime myDateSystem = LocalDateTime.now();
						    DateTimeFormatter formaData = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
						    String localDate = myDateSystem.format(formaData);
						    System.out.println("Data e Hora: " + localDate);
						   
						   HistoricoDeTransacoes historicoTransferencia = new HistoricoDeTransacoes(conta02.nome, conta02.conta, valorTransferencia, contaTransferencia, localDate);					
						//System.out.println("<Historico>Nome.Cliente: R$" + historicoTransferencia.nome + " Conta: " + historicoTransferencia.conta + " OperaçãotransferênciasContaCorrente: R$" + historicoTransferencia.historico + "Conta que Recebe Valor: " + contaTransferencia + "Data e hora: " + localDate + "<Fim>\n");
						}
						}
				if (contaTransferencia == 7) {
					System.out.println("Nome da Conta que você está depositando: " + conta07.nome);	
					System.out.println("Informações da conta: " + conta07.nome + " Cpf: " +conta07.cpf + " Conta: " + conta07.conta);
					System.out.println("Você tem Certeza que deseja depositar na conta de " + conta07.nome + "?\n1 - Sim  2 - Não" );
					int confirmaTransação3 = scanner.nextInt();
						
					if (confirmaTransação3 == 1) {
						conta03.setSaldoContaCorrente(conta03.getSaldoContaCorrente()+(valorTransferencia));
						System.out.println("Transferência confirmada para conta: " + contaTransferencia);
						System.out.println("Novo saldo da conta Depositada: R$ " + conta07.saldoContaCorrente + " *Obs:Não estárá disponível pro usuario*");
						conta01.setSaldoContaCorrente(conta01.getSaldoContaCorrente() - valorTransferencia);
						double somaValoDisponivelPO = (conta01.saldoChequeEspecial + conta01.saldoContaCorrente);
						System.out.println("Saldo da sua conta atualizado: " + conta01.saldoContaCorrente);
						System.out.println("Valor TOTAL disponível: " + somaValoDisponivelPO);
						   
						   LocalDateTime myDateSystem = LocalDateTime.now();
						    DateTimeFormatter formaData = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
						    String localDate = myDateSystem.format(formaData);
						    System.out.println("Data e Hora: " + localDate);
						   
						   HistoricoDeTransacoes historicoTransferencia = new HistoricoDeTransacoes(conta02.nome, conta02.conta, valorTransferencia, contaTransferencia, localDate);					
						//System.out.println("<Historico>Nome.Cliente: R$" + historicoTransferencia.nome + " Conta: " + historicoTransferencia.conta + " OperaçãoTransferênciaContaCorrente: R$" + historicoTransferencia.historico + "Conta que Recebe Valor: " + contaTransferencia + "Data e hora: " + localDate + "<Fim>\n");
						}
						}
				if (contaTransferencia == 8) {
					System.out.println("Nome da Conta que você está depositando: " + conta08.nome);	
					System.out.println("Informações da conta: " + conta08.nome + " Cpf: " +conta08.cpf + " Conta: " + conta08.conta);
					System.out.println("Você tem Certeza que deseja depositar na conta de " + conta08.nome + "?\n1 - Sim  2 - Não" );
					int confirmaTransação3 = scanner.nextInt();
						
					if (confirmaTransação3 == 1) {
						conta08.setSaldoContaCorrente(conta08.getSaldoContaCorrente()+(valorTransferencia));
						System.out.println("Transferência confirmada para conta: " + contaTransferencia);
						System.out.println("Novo saldo da conta Depositada: R$ " + conta08.saldoContaCorrente + " *Obs:Não estárá disponível pro usuario*");
						conta01.setSaldoContaCorrente(conta01.getSaldoContaCorrente() - valorTransferencia);
						double somaValoDisponivelPO = (conta01.saldoChequeEspecial + conta01.saldoContaCorrente);
						System.out.println("Saldo da sua conta atualizado: R$ " + conta01.saldoContaCorrente);
						System.out.println("Valor TOTAL disponível: " + somaValoDisponivelPO);
						   
						   LocalDateTime myDateSystem = LocalDateTime.now();
						    DateTimeFormatter formaData = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
						    String localDate = myDateSystem.format(formaData);
						    System.out.println("Data e Hora: " + localDate);
						   
						   HistoricoDeTransacoes historicoTransferencia = new HistoricoDeTransacoes(conta02.nome, conta02.conta, valorTransferencia, contaTransferencia, localDate);				
					//	System.out.println("<Historico>Nome.Cliente: R$" + historicoTransferencia.nome + " Conta: " + historicoTransferencia.conta + " OperaçãoTransferênciaContaCorrente: R$" + historicoTransferencia.historico + "Conta que Recebe Valor: " + contaTransferencia + "Data e hora: " + localDate + "<Fim>\n");
						}				
						}
				if (contaTransferencia == 9) {
					System.out.println("Nome da Conta que você está depositando: " + conta09.nome);	
					System.out.println("Informações da conta: " + conta09.nome + " Cpf: " +conta09.cpf + " Conta: " + conta09.conta);
					System.out.println("Você tem Certeza que deseja depositar na conta de " + conta09.nome + "?\n1 - Sim  2 - Não" );
					int confirmaTransação3 = scanner.nextInt();
						
					if (confirmaTransação3 == 1) {
						conta09.setSaldoContaCorrente(conta09.getSaldoContaCorrente()+(valorTransferencia));
						System.out.println("Transferência confirmada para conta: " + contaTransferencia);
						System.out.println("Novo saldo da conta Depositada: R$ " + conta09.saldoContaCorrente + " *Obs:Não estárá disponível pro usuario*");
						conta01.setSaldoContaCorrente(conta01.getSaldoContaCorrente() - valorTransferencia);
						double somaValoDisponivelPO = (conta01.saldoChequeEspecial + conta01.saldoContaCorrente);
						System.out.println("Saldo da sua conta atualizado: R$ " + conta01.saldoContaCorrente);
						System.out.println("Valor TOTAL disponível: R$ " + somaValoDisponivelPO);
						   
						   LocalDateTime myDateSystem = LocalDateTime.now();
						    DateTimeFormatter formaData = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
						    String localDate = myDateSystem.format(formaData);
						    System.out.println("Data e Hora: " + localDate);
						   
						   HistoricoDeTransacoes historicoTransferencia = new HistoricoDeTransacoes(conta02.nome, conta02.conta, valorTransferencia, contaTransferencia, localDate);				
					//	System.out.println("<Historico>Nome.Cliente: R$" + historicoTransferencia.nome + " Conta: " + historicoTransferencia.conta + " OperaçãoTransferenciaContaCorrente: R$" + historicoTransferencia.historico + "Conta que Recebe Valor: " + contaTransferencia + "Data e hora: " + localDate + "<Fim>\n");
						}
						}
				if (contaTransferencia == 10) {
					System.out.println("Nome da Conta que você está depositando: " + conta010.nome);	
					System.out.println("Informações da conta: " + conta010.nome + " Cpf: " +conta010.cpf + " Conta: " + conta010.conta);
					System.out.println("Você tem Certeza que deseja depositar na conta de " + conta010.nome + "?\n1 - Sim  2 - Não" );
					int confirmaTransação3 = scanner.nextInt();
						
					if (confirmaTransação3 == 1) {
						conta03.setSaldoContaCorrente(conta03.getSaldoContaCorrente()+(valorTransferencia));
						System.out.println("Transferência confirmada para conta: " + contaTransferencia);
						System.out.println("Novo saldo da conta Depositada: R$ " + conta010.saldoContaCorrente + " *Obs:Não estárá disponível pro usuario*");
						conta01.setSaldoContaCorrente(conta01.getSaldoContaCorrente() - valorTransferencia);
						double somaValoDisponivelPO = (conta01.saldoChequeEspecial + conta01.saldoContaCorrente);
						System.out.println("Saldo da sua conta atualizado: R$ " + conta01.saldoContaCorrente);
						System.out.println("Valor TOTAL disponível: R$ " + somaValoDisponivelPO);
						   
						   LocalDateTime myDateSystem = LocalDateTime.now();
						    DateTimeFormatter formaData = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
						    String localDate = myDateSystem.format(formaData);
						    System.out.println("Data e Hora: " + localDate);
						   
						   HistoricoDeTransacoes historicoTransferencia = new HistoricoDeTransacoes(conta02.nome, conta02.conta, valorTransferencia, contaTransferencia, localDate);					
					//	System.out.println("<Historico>Nome.Cliente: R$" + historicoTransferencia.nome + " Conta: " + historicoTransferencia.conta + " OperaçãoTransferenciaContaCorrente: R$" + historicoTransferencia.historico + "Conta que Recebe Valor: " + contaTransferencia + "Data e hora: " + localDate + "<Fim>\n");
						
						
						   conta01.setHistoricoContaCorrente(conta01.getHistoricoContaCorrente() + " <Historico*Transferência*>Nome.Cliente: " + conta01.nome + " Conta: " + conta01.conta + " OperaçãoDepositoContaCorrente: R$" + valorTransferencia  + " <Fim> "); // + "Conta depositada : " + contaTransferencia
								System.out.println( "\n \n");
						}
					}
				}
			else if (confereSaldoTrans <= -1) {
						System.out.println("*Transação não efetuada! Operação Cancelada Pelo Usuario*");					

						
						System.out.println("Saldo insuficiente\n *Transação Cancelada!*");
						
						
						System.out.println("\n \n");
				   }
				   
		}	
		if (menu == 6) {
			System.out.println("Informações Cadastrais");
			
			System.out.println("Informações de conta Corrente\n");

			System.out.println("Nome: " + conta01.nome);
			System.out.println("CPF: " + conta01.cpf);
			System.out.println("Conta: " + conta01.conta);
			System.out.println("Agencia: " + conta01.Agencias);
			System.out.println("Saldo Disponivel: R$ " + conta01.saldoDispnivel);
			
			System.out.println("Você deseja fazer alguma alteração cadastral? \n1 - Sim 2 - Não");
			int confirmaTransação = scanner.nextInt();
			
			if (confirmaTransação == 1) {
				System.out.println("Você pode alterar apenas o Nome \nDesejar atualizar seu nome? \n1 - Atualizar nome \n2 - Voltar para Menu");
				int confirmaTransação1 = scanner.nextInt();	
				
				if (confirmaTransação1 == 1) {
					System.out.println("Digite seu nome completo: ");
					String novoNome = scanner.next();	
					conta01.setNome(novoNome);
					System.out.println("Novo nome da conta: " + conta01.nome);				
			} 
			}
				else {
				
			}			
			}
			
		if (menu == 7) {
			System.out.println("*Gerador de Relatorios*");
			
			System.out.println("Menu: \n1 - Relatórios sobre contas correntes  \n2 - Relatórios sobre contas Poupança \n3 - Relatórios sobre contas Investimento \n4 - Relatórios sobre total investido \n5 - Relatórios de sua conta \n6 - Valor Total das contas negativas");
			
			int menuRelatorio = scanner.nextInt();
			
			if (menuRelatorio == 1) { 
				System.out.println("Sistema de relátorios sobre contas correntes");				
				System.out.println("Menu: \n1 - Relatóriosnome de todas as contas  \n2 - Relatórios CPF de todas as contas \n3 - Relatórios Saldo de todas contas Correntes");
				 int menuRelatorio1 = scanner.nextInt();
				if (menuRelatorio1 == 1) {
					System.out.println(" < # Relatórios nome todas Contas # >");
					System.out.print("Conta 1: " + conta01.nome + "\nConta 2: " + conta02.nome + "\nConta 3: "  + conta03.nome + "\nConta 4: "  + conta04.nome + "\nConta 5: "  + conta05.nome + "\nConta 6: "  + conta06.nome + "\nConta 7: "  + conta07.nome + "\nConta 8: " + conta08.nome + "\nConta 9: "  + conta09.nome + "\nConta 10: "+ conta010.nome + "\n\n");
					}
				if (menuRelatorio1 == 2) {
					System.out.println(" < # Relatórios Numero CPF# >");
					System.out.print("Conta 1: " + conta01.nome + " CPF: " + conta01.cpf + "\nConta 2: " + conta02.nome +  " CPF: " + conta02.cpf + "\nConta 3: "  + conta03.nome +  " CPF: " + conta03.cpf + "\nConta 4: "  + conta04.nome +  " CPF: " + conta04.cpf + "\nConta 5: "  + conta05.nome +  " CPF: " + conta05.cpf + "\nConta 6: "  + conta06.nome +  " CPF: " + conta06.cpf + "\nConta 7: "  + conta07.nome +  " CPF: " + conta07.cpf + "\nConta 8: " + conta08.nome +  " CPF: " + conta08.cpf + "\nConta 9: "  + conta09.nome +  " CPF: " + conta09.cpf + "\nConta 10: "+ conta010.nome + " CPF: " + conta010.cpf + "\n\n");
					}
				if (menuRelatorio1 == 3) {
					System.out.println(" < # Relatórios Soma dos Saldos de todas as contas Correntes # >");
					double somaTodasAsContas = (conta01.saldoContaCorrente + conta02.saldoContaCorrente + conta03.saldoContaCorrente + conta04.saldoContaCorrente + conta05.saldoContaCorrente + conta06.saldoContaCorrente + conta07.saldoContaCorrente + conta08.saldoContaCorrente + conta09.saldoContaCorrente + conta010.saldoContaCorrente);
					System.out.println("Total das contas Correntes: R$ " + somaTodasAsContas + "\n\n");				
				}
				}
			
			
			
				if (menuRelatorio == 2) { 
					System.out.println("Sistema de Relatórios sobre contas Poupança");					
					System.out.println("Menu: \n1 - Relatórios nome de todas as contas  \n2 - Relatórios CPF de todas as contas \n3 - Relatórios Saldo de todas contas Poupanca");
					 int menuRelatorio1 = scanner.nextInt();
					if (menuRelatorio1 == 1) {
						System.out.println(" < # Relatórios nome todas Contas Poupanca # >");
						System.out.print("Conta 1: " + conta100.nome + "\nConta 2: " + conta101.nome + "\nConta 3: "  + conta102.nome + "\nConta 4: "  + conta103.nome + "\nConta 5: "  + conta104.nome + "\nConta 6: "  + conta105.nome + "\nConta 7: "  + conta106.nome + "\nConta 8: " + conta107.nome + "\nConta 9: "  + conta108.nome + "\nConta 10: "  + conta09.nome + "\n\n");
					}
					if (menuRelatorio1 == 2) {
						System.out.println(" < # Relatórios Numero CPF# >");
						System.out.print("Conta 1: " + conta100.nome + " CPF: " + conta100.cpf +"\nConta 2: " + conta101.nome + " CPF: " + conta101.cpf + "\nConta 3: " + conta102.nome +  " CPF: " + conta102.cpf + "\nConta 4: "  + conta103.nome +  " CPF: " + conta103.cpf + "\nConta 5: "  + conta104.nome +  " CPF: " + conta104.cpf + "\nConta 6: "  + conta105.nome +  " CPF: " + conta105.cpf + "\nConta 7: "  + conta106.nome +  " CPF: " + conta106.cpf + "\nConta 8: "  + conta107.nome +  " CPF: " + conta107.cpf + "\nConta 9: " + conta108.nome +  " CPF: " + conta108.cpf + "\nConta 10: "  + conta109.nome +  " CPF: " + conta109.cpf + "\n\n");
					}
					if (menuRelatorio1 == 3) {
						System.out.println(" < # Relatórios Soma dos Saldos de todas as contas Poupanca # >");
						double somaTodasAsContasPoup = (conta100.saldocontaPoupanca + conta101.saldocontaPoupanca + conta102.saldocontaPoupanca + conta103.saldocontaPoupanca + conta104.saldocontaPoupanca  + conta105.saldocontaPoupanca + conta106.saldocontaPoupanca + conta107.saldocontaPoupanca + conta108.saldocontaPoupanca + conta109.saldocontaPoupanca);
						System.out.println("Total das contas Poupança: R$ " + somaTodasAsContasPoup + "\n\n");					
					}
					}
				
				if (menuRelatorio == 3) { 
					System.out.println("Sistema de Relatórios sobre contas Investimento");					
					System.out.println("Menu: \n1 - Relatórios nome de todas as contas  \n2 - Relatórios CPF de todas as contas \n3 - Relatórios Saldo de todas contas Investimento");
					 int menuRelatorio1 = scanner.nextInt();
					if (menuRelatorio1 == 1) {
						System.out.println(" < # Relatórios nome todas Contas Investimento # >");
						System.out.print("Conta 1 : " + contai01.nome + "\nConta 2: " + contai02.nome + "\nConta 3: "  + contai03.nome + "\nConta 4: "  + contai04.nome + "\nConta 5: "  + contai05.nome + "\nConta 6: "  + contai06.nome + "\nConta 7: "  + contai07.nome + "\nConta 8: " + contai08.nome + "\nConta 9: "  + contai09.nome + "\nConta 10: "  + contai010.nome + "\n\n");
					}
					if (menuRelatorio1 == 2) {
						System.out.println(" < # Relatórios Numero CPF# >");
						System.out.print("Conta 1: " + contai01.nome + " CPF: " + contai01.cpf + "\nConta 2: " + contai02.nome +  " CPF: " + contai02.cpf + "\nConta 3: "  + contai03.nome +  " CPF: " + contai03.cpf + "\nConta 4: "  + contai04.nome +  " CPF: " + contai04.cpf + "\nConta 5: "  + contai05.nome +  " CPF: " + contai05.cpf + "\nConta 6: "  + contai06.nome +  " CPF: " + contai06.cpf + "\nConta 7: "  + contai07.nome +  " CPF: " + contai07.cpf + "\nConta 8: " + contai08.nome +  " CPF: " + contai08.cpf + "\nConta 9: "  + contai09.nome +  " CPF: " + contai09.cpf + "\nConta 10: "+ contai010.nome + " CPF: " + contai010.cpf + "\n\n");
					}
					if (menuRelatorio1 == 3) {
						System.out.println(" < # Relatórios Soma dos Saldos de todas as contas Investimentos # >");
						double somaTodasAsContasInvest = (contai01.saldocontaInvestimento + contai02.saldocontaInvestimento + contai03.saldocontaInvestimento + contai04.saldocontaInvestimento + contai05.saldocontaInvestimento + contai06.saldocontaInvestimento + contai07.saldocontaInvestimento + contai08.saldocontaInvestimento + contai09.saldocontaInvestimento + contai010.saldocontaInvestimento);
						System.out.println("Total das contas Investimentos: R$ " + somaTodasAsContasInvest + "\n\n");					
					}					
					}
				if (menuRelatorio == 4) {					
					double somaTodasAsContas = (conta01.saldoContaCorrente + conta02.saldoContaCorrente + conta03.saldoContaCorrente + conta04.saldoContaCorrente + conta05.saldoContaCorrente + conta06.saldoContaCorrente + conta07.saldoContaCorrente + conta08.saldoContaCorrente + conta09.saldoContaCorrente + conta010.saldoContaCorrente);
					double somaTodasAsContasPoup = (conta100.saldocontaPoupanca + conta101.saldocontaPoupanca + conta102.saldocontaPoupanca + conta103.saldocontaPoupanca + conta104.saldocontaPoupanca  + conta105.saldocontaPoupanca + conta106.saldocontaPoupanca + conta107.saldocontaPoupanca + conta108.saldocontaPoupanca + conta109.saldocontaPoupanca );
					double somaTodasAsContasInvest = (contai01.saldocontaInvestimento + contai02.saldocontaInvestimento + contai03.saldocontaInvestimento + contai04.saldocontaInvestimento + contai05.saldocontaInvestimento + contai06.saldocontaInvestimento + contai07.saldocontaInvestimento + contai08.saldocontaInvestimento + contai09.saldocontaInvestimento + contai010.saldocontaInvestimento);
					double somaTodoBanco = (somaTodasAsContas + somaTodasAsContasPoup + somaTodasAsContasInvest);
					System.out.println(somaTodoBanco + "\n\n");
					}
				if (menuRelatorio == 5) {
					
					System.out.println(conta01.historicoContaCorrente + "\n\n");
					
					
				}
				if (menuRelatorio == 6) {													
					System.out.println("Valor Total das contas Correntes negativas: R$ ");					
					
					if (conta01.saldoContaCorrente <-1) {						
						double soma1 = conta01.saldoContaCorrente;
						//System.out.println(soma1);
						conta01.contasNegativa = soma1;												
					} 
					if (conta02.saldoContaCorrente <-1) {						
						double soma2 = conta02.saldoContaCorrente;					
						//System.out.println(soma2);
						conta02.contasNegativa = soma2;
					}
					if (conta03.saldoContaCorrente <-1) {						
						double soma3 = conta03.saldoContaCorrente;
						conta03.contasNegativa = soma3;
						//System.out.println(soma3);
					}
					if (conta04.saldoContaCorrente <-1) {						
						double soma4 = conta04.saldoContaCorrente;
						conta05.contasNegativa = soma4;
						//System.out.println(soma4);
					}
					if (conta05.saldoContaCorrente <-1) {		
						double soma5 = conta05.saldoContaCorrente;
						conta05.contasNegativa = soma5;
						//System.out.println(soma5);
					}
					if (conta06.saldoContaCorrente <-1) {		
						double soma6 = conta06.saldoContaCorrente;
						conta06.contasNegativa = soma6;
						//System.out.println(soma6);
					}
					if (conta07.saldoContaCorrente <-1) {		
						double soma7 = conta07.saldoContaCorrente;
						conta07.contasNegativa = soma7;
						//System.out.println(soma7);
					}
					if (conta08.saldoContaCorrente <-1) {						
						double soma8 = conta08.saldoContaCorrente;
						conta08.contasNegativa = soma8;
					//	System.out.println(soma8);
					}
					if (conta09.saldoContaCorrente <-1) {					
						double soma9 = conta09.saldoContaCorrente;
						conta09.contasNegativa = soma9;
				//		System.out.println(soma9);
					}
					if (conta010.saldoContaCorrente <-1) {		
						double soma10 = conta010.saldoContaCorrente;
						conta010.contasNegativa = soma10;
					//	System.out.println(soma10);
					}
				double contasnegativasresult = (conta01.contasNegativa + conta02.contasNegativa + conta03.contasNegativa + conta04.contasNegativa + conta05.contasNegativa + conta06.contasNegativa + conta07.contasNegativa + conta08.contasNegativa + conta09.contasNegativa + conta010.contasNegativa); 
				
				System.out.println("Total de todas as contas Correntes Negativas: R$ "+ contasnegativasresult + "\n\n");
						}
				}							
		if (menu == 8) {
			
			System.out.println("1 - Simulações de conta Poupança \n2 - Sumilações de Investimentos: ");
			
			int simulacao = scanner.nextInt();
			
			if (simulacao == 1) {
				System.out.println("Taxa de rendimento da conta Poupança Baseado na Taxa Selic 5% ao Mês");
				System.out.println("Informa o valor que desejar Poupar: ");				
				int valorPoup = scanner.nextInt();
				System.out.println("Informe o quantidade de tempo que o valor ficará em sua conta poupança: ");
				int tempPoup = scanner.nextInt();
				
				int DivPop = (valorPoup / 100 );		
				int PorcTxAm = (DivPop * 5 );
				int valorDV = (tempPoup * PorcTxAm);				
				int resolt1 = (valorPoup + valorDV);				
				System.out.println("Valor total após tempo na Poupança: R$ " + resolt1 + "\n\n");
			} 
			if (simulacao == 2) {
				System.out.println("Taxa de rendimento para investimentosc 10% ao Mês");
				System.out.println("Informa o valor que desejar Investir: ");
				int valorIvs = scanner.nextInt();
				
				System.out.println("Quantidade de tempo que deseja deixar aplicado: ");
				int tempInv = scanner.nextInt();						
				
				int DivInv = (valorIvs / 100 );		
				int PorcTxAmInv = (DivInv * 10 );
				int valorInvDV = (tempInv * PorcTxAmInv);				
				int resoltInv = (valorIvs + valorInvDV);				
				System.out.println("Valor total após tempo Aplicado: R$ " + resoltInv + "\n\n");
				
		}	
		}
		}		
	} 	
	}

