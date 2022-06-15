package devinmoney;

public class ContasPoupanca extends Conta {

	String historicoContaPoupanca = "Sem histórico";
	
	double saldocontaPoupanca = 0; 
			
	
	public ContasPoupanca (String nome, String cpf, Agencias Agencias,int conta, double saldocontaPoupanca) {
		
		this.nome = nome;
		this.cpf = cpf;
		this.conta = conta;
		this.Agencias = Agencias;
		this.saldocontaPoupanca = saldocontaPoupanca;
	
	

	}
	
	

}
