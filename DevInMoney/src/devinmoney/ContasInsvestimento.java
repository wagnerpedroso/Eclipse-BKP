package devinmoney;

public class ContasInsvestimento extends Conta {

	String historicoContaInvestimento = "Sem histórico";
	
	double saldocontaInvestimento = 0; 
			
	
	public ContasInsvestimento(String nome, String cpf, Agencias Agencias,int conta, double saldocontaInvestimento) {
		
		this.nome = nome;
		this.cpf = cpf;
		this.conta = conta;
		this.Agencias = Agencias;
		this.saldocontaInvestimento = saldocontaInvestimento;

		
		
		
}
}