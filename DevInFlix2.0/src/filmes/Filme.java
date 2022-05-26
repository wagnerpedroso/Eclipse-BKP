package filmes;

import java.time.LocalDate;


public class Filme extends Conteudo {
		
	public int id;
	public String link;
	
	
	
	

	public Filme(int id, String link, String nomeF, Genero genero, LocalDate anoLancamento, String sinopse, int curtidas, int descurtidas) {
		
		this.id = id;
		this.link = link;
		this.nomeF = nomeF;
		this.genero = genero;
		this.anoLancamento = anoLancamento;
		this.sinopse = sinopse;
		this.curtidas = curtidas;
		this.descurtidas = descurtidas;
	}
	
	
//	protected String sinopse;
//	protected int curtidas; 	
//	 int curtidas; 
//	 int descurtidas;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	
		

}
