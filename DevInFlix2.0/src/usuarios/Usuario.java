package usuarios;

import java.time.LocalDate;

//import java.time.LocalDate;

public class Usuario {
	
	private String nome;
    private String endereco;
	//private LocalDate dataNascimento;
	private String dataNascimento;
	private LocalDate indicacaoData = null;
	private LocalDate proxIndicacao = null; 
	
	

	
	public Usuario(String nome, String endereco, String dataNascimento) {
		this.nome = nome;
		this.endereco = endereco;
		this.dataNascimento = dataNascimento;
		this.indicacaoData = indicacaoData;
		this.proxIndicacao = proxIndicacao;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public LocalDate getIndicacaoData() {
		return indicacaoData;
	}


	public void setIndicacaoData(LocalDate indicacaoData) {
		this.indicacaoData = indicacaoData;
	}


	public LocalDate getProxIndicacao() {
		return proxIndicacao;
	}

	public void setProxIndicacao(LocalDate proxIndicacao) {
		this.proxIndicacao = proxIndicacao;
	}


}
