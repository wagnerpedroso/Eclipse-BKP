package devinmoney;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class HistoricoDeTransacoes {
	

	
	String nome;
	int conta;
	double historico;
	int identificacao;
	String dataInd;
	
	public HistoricoDeTransacoes(String nome, int conta, double historico, int identificacao, String dataInd) { 
		this.nome = nome;
		this.conta = conta;
		this.historico = historico;
		this.identificacao = identificacao;
		this.dataInd = dataInd;
	}
	


	public double getHistorico() {
		return historico;
	}

	public void setHistorico(double historico) {
		this.historico = historico;
	}

	
	
	
}
