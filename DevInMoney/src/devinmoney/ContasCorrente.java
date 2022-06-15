package devinmoney;

import static devinmoney.Agencias.FLORIANOPOLIS;
// import static devinmoney.Conta;
import static devinmoney.Menu.main;

public class ContasCorrente extends Conta {
	
	
	
	String historicoContaCorrente = "Seu Extrato: ";
	double saldoChequeEspecial = 2000;
	double saldoDispnivel = saldoContaCorrente + saldoChequeEspecial;
	double contasNegativa = -0;
	public ContasCorrente(String nome, String cpf, Agencias Agencias,int conta, double saldoContaCorrente, int rendaMensal) {
		
		this.nome = nome;
		this.cpf = cpf;
		this.conta = conta;
		this.Agencias = Agencias;
		this.saldoContaCorrente = saldoContaCorrente;
		this.rendaMensal = rendaMensal;
	}

	public double getSaldoContaCorrente() {
		return saldoContaCorrente;
	}

	public void setSaldoContaCorrente(double saldoContaCorrente) {
		this.saldoContaCorrente = saldoContaCorrente;
	}

	public double getSaldoChequeEspecial() {
		return saldoChequeEspecial;
	}

	public void setSaldoChequeEspecial(double saldoChequeEspecial) {
		this.saldoChequeEspecial = saldoChequeEspecial;
	}

	public double getSaldoDispnivel() {
		return saldoDispnivel;
	}

	public void setSaldoDispnivel(double saldoDispnivel) {
		this.saldoDispnivel = saldoDispnivel;
	}
	public String getHistoricoContaCorrente() {
		return historicoContaCorrente;
	}
	public void setHistoricoContaCorrente(String historicoContaCorrente) {
		this.historicoContaCorrente = historicoContaCorrente;
	}

	public double getContasNegativa() {
		return contasNegativa;
	}

	public void setContasNegativa(double contasNegativa) {
		this.contasNegativa = contasNegativa;
	}
	
	
	
	
	
	
	
}



// public class  contasDevInMoney {
	 
//		int saldo = saldo;
//		int chequeEspecial = chequeEspecial;
//		
//		public ContasCorrente(int saldo, int chequeEspecial) {
//			this.saldo = saldo;
//			this.chequeEspecial = chequeEspecial;
//			
//		}
		
//	int saldo = saldo;
//	int chequeEspecial = chequeEspecial;
//	
//	
//	
//	public ContasCorrente(int saldo, int chequeEspecial) {
//		this.saldo = saldo;
//		this.chequeEspecial;
//	}
//}
